public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE PEDIDOS ===");

        pedido pedido1 = new pedido("Nicolas", 120.50);
        pedido pedido2 = new pedido("Matias", 300.00);

        pedido1.mostrarInformacion();
        pedido2.mostrarInformacion();

        System.out.println("\n--- Confirmando el pedido 1 ---");
        pedido1.confirmar();
        pedido1.mostrarInformacion();

        System.out.println("\n--- Intentando confirmar el pedido 1 de nuevo (prueba de duplicados) ---");
        pedido1.confirmar(); // No debería sumar ventasTotales otra vez
        pedido1.mostrarInformacion();

        System.out.println("\n--- Estadísticas Finales ---");
        System.out.println("Total de pedidos: " + pedido.getContadorPedidos());
        System.out.println("Ventas totales: $" + pedido.getVentasTotales());
    }
}