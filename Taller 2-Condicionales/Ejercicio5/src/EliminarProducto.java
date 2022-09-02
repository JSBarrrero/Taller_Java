import java.util.Scanner;

public class EliminarProducto {
    public static Integer opcion;
    public static Integer cont2;

    public static void eliminarProducto(Integer cont) {
        Scanner input = new Scanner(System.in);

        System.out.println("Elija el producto que desea eliminar:");
        opcion = input.nextInt();

        Carrito.nomProd[opcion-1] = "";
        Carrito.cantYValor[opcion-1][0] = 0;
        Carrito.cantYValor[opcion-1][1] = 0;

        for (int i=opcion-1; i<cont-1; i++) {
            Carrito.nomProd[i] = Carrito.nomProd[opcion];
            for (int j=0; j<2; j++) {
                if (j == 0) {
                    Carrito.cantYValor[i][j] = Carrito.cantYValor[opcion][j]; 
                }
                if (j == 1) {
                    Carrito.cantYValor[i][j] = Carrito.cantYValor[opcion][j];
                }   
            }    
        }

        for (int i=opcion; i<8; i++) {
            Carrito.nomProd[i] = "";
            for (int j=0; j<2; j++) {
                if (j == 0) {
                    Carrito.cantYValor[i][j] = 0; 
                }
                if (j == 1) {
                    Carrito.cantYValor[i][j] = 0;
                }   
            }   

        }

        Carrito.cont--;
    }
    
}
