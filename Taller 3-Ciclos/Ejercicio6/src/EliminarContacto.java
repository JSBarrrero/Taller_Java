import java.util.Scanner;

public class EliminarContacto {
    public static Integer opcion;

    public static void eliminarContacto() {
        Scanner input = new Scanner(System.in);

        if (RegistrarContanto.cont == 0) {
            System.out.println("Usted no ha registrado ningun contacto, por favor registre uno");
        } else {
            System.out.println("Esta es la lista de contactos que actualmente tiene");
            for (Integer i=0 ; i<3 ; i++) {
                if (RegistrarContanto.contactos[i][0].equals("")) {
                }else{
                    for (Integer j=0 ; j<4 ; j++) {
                        if (j == 0) {
                            System.out.print(i+1 +". numero " + RegistrarContanto.contactos[i][j]);
                        }
                        if (j == 1) {
                            System.out.print(" nombre " + RegistrarContanto.contactos[i][j]);
                        }
                        if (j == 2) {
                            System.out.print(" " + RegistrarContanto.contactos[i][j]);
                        }
                        if (j == 3) {
                        System.out.print(" organizacion " + RegistrarContanto.contactos[i][j]);
                        }
                    }
                    System.out.println("");
                }
            }  

            System.out.println("4. Volver al menu anterior");
            System.out.println("Elija el contacto que desea eliminar");
            opcion = input.nextInt();

            if (opcion > 0 & opcion <= 3) {
                for (Integer i=0 ; i<4 ; i++) {
                    RegistrarContanto.contactos[opcion-1][i]="";
                }
                for (Integer i=opcion-1 ; i<opcion ; i++) {
                    for (Integer j=0 ; j<4 ; j++) {
                        RegistrarContanto.contactos[i][j] = RegistrarContanto.contactos[i+1][j];
                    }
                }
                for (Integer i=opcion ; i<3 ; i++) {
                    for (Integer j=0 ; j<4 ; j++) {
                        RegistrarContanto.contactos[i][j] = "";
                    }
                }
                RegistrarContanto.cont--;           
            } else {
                if (opcion == 4) {               
                } else {
                    System.out.println("La opcion que ingreso no es valida, por favor intentelo nuevamente");
                } 
            } 
        }
    }
}
