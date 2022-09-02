import java.util.InputMismatchException;
import java.util.Scanner;

public class VitaminaC {
    public static Integer opcion;
    public static boolean salir;
    public static Integer cantProdc;
    public static Integer valorProdc;
    public static Integer valorTotal;
    public static String nombreProduc;

    public static void vitaminaC() {
        Scanner input = new Scanner(System.in);

        salir = false;

        while (!salir) {
            System.out.println("1. Vitamina c 500 mg tabletas masticables Lab COASPHARMA = $ 4.000");
            System.out.println("2. Vitamina c 500 mg tabletas masticables Lab LASANTE = $ 4.900");
            System.out.println("Elija una opcion:");
            System.out.println("1. Comprar prodcuto");
            System.out.println("2. Regresar al menu anterior");
            
            try {
                opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite el numero del producto que desea añadir al carro:");
                    opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                            nombreProduc = "Vitamina c 500 mg tabletas masticables Lab COASPHARMA";
                            valorProdc = 4000;
                            System.out.println("Por favor digite la cantidad que desea comprar:");
                            cantProdc = input.nextInt();
                            valorTotal = valorProdc * cantProdc;
                            Carrito.carrito(nombreProduc, cantProdc, valorTotal);
                            System.out.println("-----Producto agregado correctamente al carrito-----");
                            break;
                        case 2:
                            nombreProduc = "Vitamina c 500 mg tabletas masticables Lab LASANTE";
                            valorProdc = 4900;
                            System.out.println("Por favor digite la cantidad que desea comprar:");
                            cantProdc = input.nextInt();
                            valorTotal = valorProdc * cantProdc;
                            Carrito.carrito(nombreProduc, cantProdc, valorTotal);
                            System.out.println("-----Producto agregado correctamente al carrito-----"); 
                            break;
                        default:
                            System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                            break;
                    }  
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                    break;
            }
                
            } catch (InputMismatchException e) {
                System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                input.next();
            }           
        }     
    } 
}
