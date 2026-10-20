public class pedido {
    private int numero;
    private String cliente;
    private double total;
    private String estado;
    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    public pedido(String cliente, double total) {
        contadorPedidos++;
        this.numero = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente";
    }

    public void confirmar() {
        if (!this.estado.equals("Confirmado")) {
            this.estado = "Confirmado";
            ventasTotales += this.total;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Pedido N°: " + numero + " | Cliente: " + cliente + " | Total: $" + total + " | Estado: " + estado);
    }

    public static int getContadorPedidos() {
        return contadorPedidos;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }
}
