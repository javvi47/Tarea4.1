public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
    public static void mostrarFechaHoraActual() {
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaHoraActual = formato.format(fechaActual);
        System.out.println("La fecha y hora actual es: " + fechaHoraActual);
    }
}

