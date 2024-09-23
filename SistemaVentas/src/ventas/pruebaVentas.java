package ventas;

public class pruebaVentas {
    public static void main(String[] args) {
        System.out.println("***Sistema  deventas");
        Producto camisa1 = new Producto("camisa" , 50.00);
        System.out.println(camisa1);
        Producto pantalon1 = new Producto("Pantalon1", 100.00);
        System.out.println(pantalon1);

        //Primer orden
        var orden1 = new Orden();
        orden1.agregarProducto(camisa1);
        orden1.agregarProducto(pantalon1);
        orden1.mostrarOrden();

        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("calcetines", 20.00)); // este obejto no lo puedo utilizar por no se guiarda en memoria
        orden2.mostrarOrden();
    }
}
