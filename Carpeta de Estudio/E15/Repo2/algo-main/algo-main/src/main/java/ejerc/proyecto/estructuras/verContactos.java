/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerc.proyecto.estructuras;

import Objetos.Contacto;
import Objetos.ContactoEmpresa;
import Objetos.ContactoPersona;
import espol.utilidades.DoubleLinkedList;
import java.util.ListIterator;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Michael
 */
public class verContactos extends Application {

    /**
     * @param args the command line arguments
     */
    public static Contacto contactoSeleccionado = null;
    private DoubleLinkedList<Contacto> contactos = App.usuario.getContactos();
    private ListIterator<Contacto> iterator = contactos.listIterator();
    private VBox cajaContacto = new VBox();
    private VBox root = new VBox();

    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void start(Stage primaryStage) {
        HBox busqueda=new HBox();
        ObservableList<String> opciones = FXCollections.observableArrayList(
                "Pais", "Cantidad Atributos", "Tipo Contacto"
        );
        ComboBox<String> comboBox = new ComboBox<>(opciones);
        comboBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Obtener el elemento seleccionado
                String seleccion = comboBox.getSelectionModel().getSelectedItem();
                if (seleccion.equals("Pais")) {
                    Contacto.ordenarPorPaisResidencia(contactos);
                } else if (seleccion.equals("Cantidad Atributos")) {
                    Contacto.ordenarPorCantidadAtributos(contactos);
                } else if (seleccion.equals("Tipo Contacto")) {
                    Contacto.ordenarPorTipoContacto(contactos);
                }
                cajaContacto.getChildren().clear();
                mostrarPrimero();

            }
        });
        TextField txtBusqueda=new TextField();
        Button buscar=new Button();
        busqueda.getChildren().addAll(comboBox,txtBusqueda,buscar);
        root.getChildren().addAll(busqueda, cajaContacto);
        mostrarPrimero();
        Button btnSig = new Button("Siguiente");
        btnSig.setOnAction(e -> {
            if (!contactos.isEmpty()) {
                if (iterator.hasNext()) {
                    System.out.println("pa delante");
                    Contacto contacto = iterator.next();
                    mostrarContactoActual(contacto);
                } else {
                    // Volvemos al principio de la lista
                    iterator = contactos.listIterator();
                    if (iterator.hasNext()) {
                        Contacto contacto = iterator.next();
                        mostrarContactoActual(contacto);
                    }
                }
            }
        });

        HBox botones = new HBox();
        botones.getChildren().addAll(btnSig);
        root.getChildren().add(botones);

        Scene scene = new Scene(root, 600, 250);
        primaryStage.setTitle("Ver Contactos");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void mostrarVentanaDetalles() {
        try {
            VentanaDetalles VentanaDetalles = new VentanaDetalles();
            VentanaDetalles.start(new Stage());
        } catch (Exception ex) {
        }
    }

    private void mostrarContactoActual(Contacto c) {
        cajaContacto.getChildren().clear();
        if (c instanceof ContactoPersona) {
            ContactoPersona cp = (ContactoPersona) c;
            Label lblNombre = new Label("Nombre: " + cp.getNombre());
            Label lblApellido = new Label("Apellido: " + cp.getApellido());
            Label lblTelefono = new Label(" ");
            if (!cp.getNumerosTelefonicos().isEmpty()) {
                lblTelefono.setText("Telefono: " + cp.getNumerosTelefonicos().getFirst());

            }
            Button ver = new Button("Ver Detalles");
            ver.setOnAction(e -> {
                contactoSeleccionado = cp;
                mostrarVentanaDetalles();

            });
            cajaContacto.getChildren().addAll(lblNombre, lblApellido, lblTelefono, ver);

        }
    }

    private void mostrarPrimero() {
        System.out.println(contactos.size());
        if (!contactos.isEmpty()) {
            if (iterator.hasNext()) {
                System.out.println("hola");
                Contacto c = iterator.next();
                mostrarContactoActual(c);

            }
        }
    }

}
