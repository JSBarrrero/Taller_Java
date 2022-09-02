import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Mascota mascota = new Mascota();
        Persona persona = new Persona();

        Scanner input = new Scanner(System.in);

        //Datos del dueño
        System.out.println("Por favor digite su nombre");
        persona.nombre = input.nextLine();
        System.out.println("Por favor digite su apellido");
        persona.apellido = input.nextLine();
        //Datos mascota
        System.out.println("Por favor digite el nombre de su mascota");
        mascota.nombre = input.nextLine();
        System.out.println("Por favor digite el tipo de animal que es su mascota");
        mascota.tipo = input.nextLine();
        System.out.println("Por favor digite la edad de su mascota");
        mascota.edad = input.nextInt();

        System.out.println(mascota.nombre + " es un(a) " + mascota.tipo + " el cual tiene " + mascota.edad.toString() + " años de edad y " + persona.nombre + " " + persona.apellido + " es actualmente su dueño");
    }
}
