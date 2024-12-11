package ChainofResponsability;

public class TechnicalDepartment implements Department{

    Department next;

    @Override
    public void setNext(Department d){
        this.next = d;
    }

    @Override
    public void consultar(Articulo a){
        //verificar que el fallo lo cubre la garantía
        System.out.println("La garantía cubre dicho problema");
        if(next != null)
            next.consultar(a);
        //si no lo cubre, la cadena termina aquí.
    }
    
}
