import java.util.InputMismatchException;
import java.util.Scanner;

public class Loratadina {
    public static Integer opcion;
    public static boolean salir;
    public static Integer cantProdc;
    public static Integer valorProdc;
    public static Integer valorTotal;
    public static String nombreProduc;

    public static void loratadina() {
        Scanner input = new Scanner(System.in);

        salir = false;

        while (!salir) {
            System.out.println("1. Loratadina 10 mg Lab COASPHARMA = $ 3.800");
            System.out.println("2. Loratadina 10 mg Lab LASANTE = $ 3.350");
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
                            nombreProduc = "Loratadina 10 mg Lab COASPHARMA";
                            valorProdc = 3800;
                            System.out.println("Por favor digite la cantidad que desea comprar:");
                            cantProdc = input.nextInt();
                            valorTotal = valorProdc * cantProdc;
                            Carrito.carrito(nombreProduc, cantProdc, valorTotal);
                            System.out.println("-----Producto agregado correctamente al carrito-----");
                            break;
                        case 2:
                            nombreProduc = "Loratadina 10 mg Lab LASANTE = $ 3.350";
                            valorProdc = 3350;
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
