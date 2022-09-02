import java.util.InputMismatchException;
import java.util.Scanner;

public class VerCarrito {
    public static Integer opcion;
    public static Integer valor;
    public static Integer valorTotal;
    public static Integer cont;

    public static void verCarrito() {
        Scanner input = new Scanner(System.in);
        valor = 0;
        valorTotal = 0;
        cont = 0;

        
        System.out.println("Productos agregados al carrito:");
        
        if (Carrito.cont != 0) {
            for (int i=0; i<8; i++) {
                if (Carrito.nomProd[i]!="") {
                    System.out.print(i+1 + ". " + Carrito.nomProd[i] + " ");
                    for (int j=0; j<2; j++) {
                        if (j==0) {
                            System.out.print("cantidad: " + Carrito.cantYValor[i][j] + " ");
                        }
                        if (j==1) {
                            valor = Carrito.cantYValor[i][j];
                            valorTotal = valorTotal + valor;
                            System.out.print("valor: " + Carrito.cantYValor[i][j] + " ");
                        }      
                                   
                    }
                    System.out.println("");
                    cont++;
                }           
            } 
        System.out.println("Usted lleva un total de $ " + valorTotal.toString());
        System.out.println("Elija una opcion:");
        System.out.println("1. Realizar compra");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Regresar al menu anterior");
        
        try {
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Compra realizada correctamente, hasta luego");
                    System.exit(0);
                    break;
                case 2:
                    EliminarProducto.eliminarProducto(cont);
                    break;    
        
                default:
                    System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                    break;
            }     
        } catch (InputMismatchException e) {
                System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                input.next();
        }
            
        } else {
            System.out.println("Usted no ha agredado productos al carrito");
        }
    }
}
