package ChainofResponsability;

public class Tienda {

    public static void main(String[] args){
        Department d1 = new CustomerServiceDepartment();
        Department d2 = new TechnicalDepartment();
        Department d3 = new Inventory();
        Department d4 = new Management();
        Articulo articulo = new Articulo();
        d1.setNext(d2);
        d2.setNext(d3);
        d3.setNext(d4);
        d1.consultar(articulo);
    }
    
}
