public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---Sistema de Inventario de Tienda Digital---");

        Tienda miTienda = new Tienda("TIENDA TECH");

        Producto p1 = new ProductoTecnologico("TEC-001", "Laptop Gamer", 1500.00, 24);
        Producto p2 = new ProductoOficina("OFI-001", "Silla GAMER", 250.50, "OfiMuebles");
        Producto p3 = new ProductoTecnologico("TEC-002", "Monitor 4K 27\"", 450.75, 12);
        Producto p4 = new ProductoOficina("OFI-002", "Paquete de 500 hojas", 5.99, "Papelera Nacional");

        miTienda.agregarProducto(p1);
        miTienda.agregarProducto(p2);
        miTienda.agregarProducto(p3);
        miTienda.agregarProducto(p4);

        miTienda.mostrarInventario();

        System.out.println("Valor total del inventario: $" + miTienda.calcularValorTotal());

        System.out.println("\n--- Ordenando inventario por precio descendente ---");
        miTienda.ordenarPorPrecioDescendente();
        miTienda.mostrarInventario();

        System.out.println("\n--- Buscando productos de tipo Tecnológico ---");
        miTienda.buscarProductosPorTipo("Tecnologico");

        System.out.println("\n--- Buscando productos de tipo Oficina ---");
        miTienda.buscarProductosPorTipo("Oficina");
    }
}
