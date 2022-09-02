import java.util.InputMismatchException;
import java.util.Scanner;

public class IngresarVehiculo {
    public static String [][] datos = new String [5][6];
    public static Integer opcion;
    public static Integer cont=0;
    public static Integer cont2=0;
    public static Integer cont3=0;
    public static String placa;


    public static void ingresarVehiculo() {
        Scanner input = new Scanner(System.in);

        System.out.println("Usted esta en la opcion ingresar vehiculo");
        System.out.println("Por favor elija en que estacionamiento se ubico el vehiculo");
        for (Integer i=1;i<=5;i++) {
            System.out.println(i.toString() + ". Estacionamiento " + i.toString());
        }
        opcion = Integer.parseInt(input.nextLine());

        if(cont3 == 0){
            for (Integer i=0;i<5;i++) {
                for (Integer j=0;j<6;j++) {
                    datos[i][j]="";
                }
            }
            cont3++;
        }

        if (cont < 5) {
            if (cont == 0) {
                datos[opcion-1][0] = opcion.toString();
                System.out.println("Por favor digite la placa del vehiculo");
                datos[opcion-1][1] = input.nextLine();
                for (Integer i=0;i<6;i++) {
                    if(i==2){
                        System.out.println("Por favor digite la marca del vehiculo");
                        datos[opcion-1][i] = input.nextLine();
                    }
                    if(i==3){
                        System.out.println("Por favor escriba el nombre del dueño del vehiculo");
                        datos[opcion-1][i] = input.nextLine();
                    }
                    if(i==4){
                        System.out.println("Por favor digite el apellido del dueño del vehiculo");
                        datos[opcion-1][i] = input.nextLine();
                    }
                    if(i==5){
                        System.out.println("Por favor digite el numero de contacto del dueño del vehiculo");
                        datos[opcion-1][i] = input.nextLine();
                    }
                }
                cont++; 
            }else{
                for (Integer i=0;i<5;i++) {
                    if (datos[i][0].equalsIgnoreCase(opcion.toString())) {
                        cont3++;
                    }    
                }
                if (cont3 == 2) {
                    System.out.println("Este estacionamiento ya se encuentra ocupado por un vehiculo, por favor registre el vehiculo en otro estacionamiento");
                    cont3--;
                }else{
                    datos[opcion-1][0] = opcion.toString();
                    System.out.println("Por favor digite la placa del vehiculo-");
                    placa = input.nextLine();
                    for (Integer i=0;i<5;i++) {
                        if (datos[i][1].equals(placa)) {
                            cont2++;
                        }  
                    }
                    if (cont2 == 1) {
                        System.out.println("El vehiculo que usted esta tratando de registrar ya se encuentra en un estacionamiento");
                        cont2--;
                    }else{
                        datos[opcion-1][1] = placa;
                        for (Integer i=0;i<6;i++) {
                            if(i==2){
                                System.out.println("Por favor digite la marca del vehiculo-");
                                datos[opcion-1][i] = input.nextLine();
                            }
                            if(i==3){
                                System.out.println("Por favor escriba el nombre del dueño del vehiculo-");
                                datos[opcion-1][i] = input.nextLine();
                            }
                            if(i==4){
                                System.out.println("Por favor digite el apellido del dueño del vehiculo-");
                                datos[opcion-1][i] = input.nextLine();
                            }
                            if(i==5){
                                System.out.println("Por favor digite el numero de contacto del dueño del vehiculo-");
                                datos[opcion-1][i] = input.nextLine();
                            }
                        }
                        cont++;
                        cont2--;
                        cont3--; 
                    }
                }
            }
        } else {
            System.out.println("El parqueadero llego a su capacidad maxima, por favor retire un vehiculo");
        }
    }
}
