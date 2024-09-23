package ventas;

public class Orden {
    private final int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    private static int contadorOrdenes;


    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; // inicializo e indico cuantos elementos va a tener
    }
    public void agregarProducto(Producto producto){
        if(contadorProductos < MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha llegado al limite de productos :" + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i< this.contadorProductos ; i++){
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("id Orden: " + this.idOrden );
        double totalOrden = this.calcularTotal();
        System.out.println("\tEl total de la orden es : $ " + totalOrden);
        System.out.println("\tProductos de la Orden: ");
        for(int i=0; i< this.contadorProductos; i++ ){
            System.out.println("\t\t" + this.productos[i]);
        }
    }
}
