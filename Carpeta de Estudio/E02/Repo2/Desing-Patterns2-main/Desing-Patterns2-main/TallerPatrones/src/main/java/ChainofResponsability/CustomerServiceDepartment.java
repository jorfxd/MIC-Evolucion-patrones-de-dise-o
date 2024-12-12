package ChainofResponsability;

public class CustomerServiceDepartment implements Department{

    Department next;

    @Override
    public void setNext(Department d){
        this.next = d;
    }

    @Override
    public void consultar(Articulo a){
        //verificar si está en periodo de garandía.
        System.out.println("Está en periodo de garantía");
        if(next != null)
            next.consultar(a);
        //si no lo está, termina la cadena aquí.
    }
    
}
