package ChainofResponsability;

public class Inventory implements Department{

    Department next;

    @Override
    public void setNext(Department d){
        this.next = d;
    }

    @Override
    public void consultar(Articulo a){
        //verificar si hay stock del producto
        System.out.println("Existen más productos para realizar el cambio");
        if(next != null)
            next.consultar(a);
        //si no hay stock, la cadena termina aquí.
    }
    
}
