import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        Persona hijo = new Persona();
        System.out.println("Por favor digite su nombre");
        hijo.nombre = input.nextLine();
        System.out.println("Por favor digite su apellido");
        hijo.apellido = input.nextLine();
        
        Persona madre = new Persona();
        System.out.println("Por favor digite el nombre de su madre");
        madre.nombre = input.nextLine();
        System.out.println("Por favor digite el apellido de su madre");
        madre.apellido = input.nextLine();

        Persona padre = new Persona();
        System.out.println("Por favor digite el nombre de su padre");
        padre.nombre = input.nextLine();
        System.out.println("Por favor digite el apellido de su padre");
        padre.apellido = input.nextLine();

        System.out.println("Yo " + hijo.nombre + " " + hijo.apellido + ", soy hijo de " + madre.nombre + " " + madre.apellido + " y " + padre.nombre + " " + padre.apellido );
    }
}
