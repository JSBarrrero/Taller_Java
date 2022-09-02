import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductoDisp {
    public static Integer opcion;
    public static boolean salir;
    public static String producto;

    public static void productoDisp() {
        Scanner input = new Scanner(System.in);

        salir = false;

        while (!salir) {
            System.out.println("Productos disponiles:");
            System.out.println("- Acetaminofen");
            System.out.println("- Loratadina");
            System.out.println("- Vitamina C");
            System.out.println("Elija una opcion:");
            System.out.println("1. Comprar producto");
            System.out.println("2. Ver carrito");
            System.out.println("3. Regresar al menu anterior");
            
            try {
                opcion = Integer.parseInt(input.nextLine());
            switch (opcion) {
                case 1:
                System.out.println("Escriba el nombre del producto que desea consultar");
                producto = input.nextLine();
                
                if(producto.equals("Acetaminofen")||producto.equals("acetaminofen")) {
                    Acetaminofen.acetaminofen();
                } else {
                    if (producto.equals("Vitamina C")||producto.equals("vitamina c")) {
                        VitaminaC.vitaminaC();
                    } else {
                        if (producto.equals("Loratadina")||producto.equals("loratadina")) {
                            Loratadina.loratadina();                        
                        } else {
                            System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                        }                        
                    }
                }
                    break;
                case 2:
                    VerCarrito.verCarrito();
                    break; 
                case 3:
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
