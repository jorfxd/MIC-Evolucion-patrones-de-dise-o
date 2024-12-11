package ChainofResponsability;

public class Management implements Department{

    Department next;

    @Override
    public void setNext(Department d){
        this.next = d;
    }

    @Override
    public void consultar(Articulo a){
        //si el valor del artículo supera los $1000
        System.out.println("Esperando la aprobación del gerente");
        if(next != null)
            next.consultar(a);
        //si no lo supera, sigue o termina la cadena sin problemas
    }
    
}
