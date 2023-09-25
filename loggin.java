import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu nombre de usuario:");
        String username = scanner.nextLine();

        System.out.println("Por favor, ingresa tu contraseña:");
        String password = scanner.nextLine();

        Usuario usuario = new Usuario(username, password);

        System.out.println("Usuario creado exitosamente!");
    }
}

class Usuario {
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
