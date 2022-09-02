import java.util.Scanner;

public class RetirarVehiculo {
    public static Integer opcion;
    public static Integer cont;

    public static void retirarVehiculo() {
        Scanner input = new Scanner(System.in);
        cont = 1;

        if (IngresarVehiculo.cont==0) {
            System.out.println("El parquedero aun no cuenta con vehiculos en los estacionamientos");
        } else {
            System.out.println("Usted esta en la opcion retirar vehiculo");
            System.out.println("Los vehiculos registrados actualmente en el parqueadero son:");
            for (Integer i=0;i<5;i++) {
                if (!IngresarVehiculo.datos[i][0].equals("")) {
                    for (Integer j=0;j<6;j++) {
                        if(j==0){
                            System.out.print(cont + ". En el estacionamiento " + IngresarVehiculo.datos[i][j]);
                        }
                        if(j==1){
                            System.out.print(" se encuentra el vehiculo de placas " + IngresarVehiculo.datos[i][j]);
                        }
                        if(j==2){
                            System.out.print(" marca " + IngresarVehiculo.datos[i][j]);
                        }
                        if(j==3){
                            System.out.print(", el dueño es " + IngresarVehiculo.datos[i][j]);
                        }
                        if(j==4){
                            System.out.print(" " + IngresarVehiculo.datos[i][j]);
                        }
                        if(j==5){
                            System.out.print(" y el numero de contacto es " + IngresarVehiculo.datos[i][j]);
                        }
                    }   
                    cont++;
                    System.out.println(""); 
                }
            }
            System.out.println("Por favor seleccione el vehiculo que desea retirar");
            opcion = input.nextInt();

            for (Integer j=0;j<6;j++) {
                IngresarVehiculo.datos[opcion-1][j] = "";
            }
            for (Integer i=opcion-1 ; i<opcion ; i++) {
                for (Integer j=0;j<6;j++) {
                    IngresarVehiculo.datos[i][j] = IngresarVehiculo.datos[i+1][j];
                }
            }
            for (Integer i=opcion ; i<5 ; i++) {
                for (Integer j=0 ; j<6 ; j++) {
                    IngresarVehiculo.datos[i][j] = "";
                }
            }   
            IngresarVehiculo.cont--;    
        }
    }   
}
