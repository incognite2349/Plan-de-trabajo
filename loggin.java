import java.util.Scanner;
import java.util.ArrayList;

public class loggin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("por favor indique el numero de la accion que desea realizar: ");
            System.out.println("1.registrar");
            System.out.println("2.Ingresar");
            int entrada = sc.nextInt();
            if (entrada == 1) {
                System.out.println("ingrese el nombre que desea utilizar:");
                String username = sc.next();

                System.out.println("Bienvenido " + username + " por favor cree una contraseña:");
                String password = sc.next();

                Usuario usuario = new Usuario(username, password);
                System.out.println("Usuario creado exitosamente!, Bienvenido " + username);
            }
            if (entrada == 2) {//sql en proceso
                System.out.println("ingrese el Usuario: ");
                String username = sc.next();
                System.out.println("Ingrese la contraseña: ");
                String password = sc.next();
                Usuario usuario = new Usuario(username, password);
                System.out.println("Ingreso permitido, Bienvenido");
            }
        }
    }
}

class Usuario {
    private String[] username;
    private String[] password;

    public Usuario(String[] username, String[] password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(String username2, String password2) {
    }

}
