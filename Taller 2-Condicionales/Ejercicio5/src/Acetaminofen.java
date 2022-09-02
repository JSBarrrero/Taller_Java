import java.util.Scanner;

public class Acetaminofen {
    public static Integer opcion;
    public static boolean salir;
    public static Integer cantProdc;
    public static Integer valorProdc;
    public static Integer valorTotal;
    public static String nombreProduc;

    public static void acetaminofen() {
        Scanner input = new Scanner(System.in);

        salir = false;

        while (!salir) {
            System.out.println("1. Acetaminofen 500 mg 300 tabletas Lab COASPHARMA = $ 25.800");
            System.out.println("2. Acetaminofen 500 mg 300 tabletas Lab LAPROFF = $ 24.993");
            System.out.println("3. Acetaminofen jarabe 60 mL Lab COASPHARMA = $ 1.972");
            System.out.println("4. Acetaminofen jarabe 60 mL Lab LAPROFF = $ 2.534");
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
                            nombreProduc = "Acetaminofen 500 mg 300 tabletas Lab COASPHARMA";
                            valorProdc = 25800;
                            System.out.println("Por favor digite la cantidad que desea comprar:");
                            cantProdc = input.nextInt();
                            valorTotal = valorProdc * cantProdc;
                            Carrito.carrito(nombreProduc, cantProdc, valorTotal);
                            System.out.println("-----Producto agregado correctamente al carrito-----");
                            break;
                        case 2:
                            nombreProduc = "Acetaminofen 500 mg 300 tabletas Lab LAPROFF";
                            valorProdc = 24993;
                            System.out.println("Por favor digite la cantidad que desea comprar:");
                            cantProdc = input.nextInt();
                            valorTotal = valorProdc * cantProdc;
                            Carrito.carrito(nombreProduc, cantProdc, valorTotal);
                            System.out.println("-----Producto agregado correctamente al carrito-----");
                            break;
                        case 3:
                            nombreProduc = "Acetaminofen jarabe 60 mL Lab COASPHARMA";
                            valorProdc = 1972;
                            System.out.println("Por favor digite la cantidad que desea comprar:");
                            cantProdc = input.nextInt();
                            valorTotal = valorProdc * cantProdc;
                            Carrito.carrito(nombreProduc, cantProdc, valorTotal);
                            System.out.println("-----Producto agregado correctamente al carrito-----");
                            break;
                        case 4:
                            nombreProduc = "Acetaminofen jarabe 60 mL Lab LAPROFF = $ 2.534";
                            valorProdc = 2534;
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
                
            } catch (Exception e) {
                System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                input.next();
            }
                 
        }
    }
    
}
