import java.util.Scanner;

public class ConsultarVehiculo {
    public static String placa;

    public static void consultarVehiculo() {
        Scanner input = new Scanner(System.in);

        if (IngresarVehiculo.cont==0) {
            System.out.println("El parquedero aun no cuenta con vehiculos en los estacionamientos");
        }else{
            System.out.println("Usted esta en la opcion consultar vehiculo");
            System.out.println("Por favor digite la placa de vehiculo");
            placa = input.nextLine();
            for (Integer i=0;i<5;i++) {
                if (IngresarVehiculo.datos[i][1].equals(placa)) {
                    System.out.println("El vehiculo de placa " + placa + " se encuentra en el estacionamiento " + IngresarVehiculo.datos[i][0]);              
                }else{
                    System.out.println("El vehiculo que usted esta consultando no se encuentra dentro del parqueadero");
                }
            }
        }
    } 
}
