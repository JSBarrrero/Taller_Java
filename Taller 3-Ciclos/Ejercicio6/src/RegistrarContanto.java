import java.util.Scanner;

public class RegistrarContanto {
    public static String [][] contactos = new String [3][4];
    public static String numero;
    public static Integer cont=0;
    public static Integer cont2=0;

    public static void registrarContacto() {
        Scanner input = new Scanner(System.in);

        if (cont < 3) {
            System.out.println("Usted ingreso a la opcion registrar contacto");
            System.out.println("Por favor digite el numero del contacto que desea registrar");
            numero = input.nextLine();

            if (cont2 == 0) {
                for (Integer i=0; i<3; i++) {
                    for (Integer j=0; j<4; j++) {
                        contactos[i][j]="";
                    }
                }
            cont2++;
        }
        if (cont == 0) {
            for (Integer j=0; j<4; j++) {
                if (j == 0) {
                    contactos[0][j]= numero;
                }
                if (j == 1) {
                    System.out.println("Por favor ingrese el nombre del contacto");
                    contactos[0][j]= input.nextLine();
                }
                if (j == 2) {
                    System.out.println("Por favor ingrese el apellido del contacto");
                    contactos[0][j]= input.nextLine();
                }
                if (j == 3) {
                    System.out.println("Por favor ingrese la organizacion del contacto");
                    contactos[0][j]= input.nextLine();
                }
            }
            cont++;
        } else {
            for (Integer i=0 ; i<3 ; i++) {
                if (contactos[i][0].equals(numero)) {
                        cont2++;
                } 
            }
            if (cont2 == 2) {
                System.out.println("Usted ya registro este contacto por favor ingrese otro numero o elija otra opcion");
                cont2--;
            }else{
                for (Integer j=0; j<4; j++) {
                    if (j == 0) {
                        contactos[cont][j]= numero;
                    }
                    if (j == 1) {
                        System.out.println("Por favor ingrese el nombre del contacto");
                        contactos[cont][j]= input.nextLine();
                    }
                    if (j == 2) {
                        System.out.println("Por favor ingrese el apellido del contacto");
                        contactos[cont][j]= input.nextLine();
                    }
                    if (j == 3) {
                        System.out.println("Por favor ingrese la organizacion del contacto");
                        contactos[cont][j]= input.nextLine();
                    }
                }
                cont++;
                } 
            }
        }else {
            System.out.println("Usted llego a la capacidad maxima de contactos, si desea agregar otro, por favor elimine uno");
        }
    }
}
