import java.util.Scanner;

public class BuscarContacto {
    public static String nombre;
    public static String apellido;
    public static Integer cont=0;
    public static Integer j=0;

    public static void buscarContacto() {
        Scanner input = new Scanner(System.in);

        if (RegistrarContanto.cont == 0) {
            System.out.println("Usted no ha registrado ningun contacto, por favor registre uno");
            
        } else {
            System.out.println("Por favor digite el nombre del contacto que desea buscar");
            nombre = input.nextLine();

            System.out.println("Por favor digite el apellido del contacto que desea buscar");
            apellido = input.nextLine();

            for (Integer i=0 ; i<3 ; i++) {
                if (RegistrarContanto.contactos[i][1].equalsIgnoreCase(nombre) & RegistrarContanto.contactos[i][2].equalsIgnoreCase(apellido) ) {
                j = i;
                cont++;
                }
            }
            if (cont > 0) {
                System.out.println("El numero del contacto " + nombre + " " + apellido + " es " + RegistrarContanto.contactos[j][0] + " y pertenece a la organizacion " + RegistrarContanto.contactos[j][3]);
                cont--;
            }else {
                System.out.println("El contacto que usted esta buscando aun no se encuentra registrado");
            }      
        }
    }   
}
