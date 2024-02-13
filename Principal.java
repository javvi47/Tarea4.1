import java.util.Scanner;

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
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de usuarios a crear: ");
        int numeroUsuarios = scanner.nextInt();
        
        Usuario[] usuarios = crearUsuarios(numeroUsuarios);
        
        System.out.println("\nUsuarios creados:");
        mostrarUsuarios(usuarios);
    }
    
    public static Usuario[] crearUsuarios(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            Usuario usuario = new Usuario();
            System.out.println("\nIngrese los datos para el usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            usuario.nombre = scanner.next();
            System.out.print("Apellidos: ");
            usuario.apellidos = scanner.next();
            System.out.print("Email: ");
            usuario.email = scanner.next();
            
            usuarios[i] = usuario;
        }
        
        return usuarios;
    }
    
    public static void mostrarUsuarios(Usuario[] usuarios) {
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println();
        }
    }
}

