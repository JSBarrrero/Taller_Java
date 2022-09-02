import java.util.Scanner;

public class TabladeMultiplicar {
    public static Integer [][] matriz = new Integer [10][10];
    public static Integer [] vector = new Integer [10];
    public static Integer cont1=1;
    public static Integer cont2=1;
    public static Integer fila;
    public static Integer columna;

    public static void tabladeMultiplicar() {
        Scanner input = new Scanner(System.in);

        System.out.println("                                      Tablas de multiplicar" + "\n");

        for (Integer i=0;i<10;i++) {
            if (i == 0) {
                System.out.print("        columna" + i);
            } else {
                System.out.print("  columna"+ i);
            }
            
        }
        System.out.println("");

        for (Integer i=0;i<10;i++) {
            System.out.print("fila " + i + " ");
            for (Integer j=0;j<10;j++) {
                matriz[i][j] = cont1 * cont2;
                if (i == 9) {
                    if (j == 9) {
                        System.out.print("| " + cont2 + " x "+ cont1 + " ");
                    } else {
                        System.out.print("| 0" + cont2 + " x "+ cont1 + " ");
                    } 
                }else{
                    if (j == 9) {
                        System.out.print("| " + cont2 + " x 0"+ cont1 + " ");
                    } else {
                        System.out.print("| 0" + cont2 + " x 0"+ cont1 + " ");
                    }
                }
                cont2++;
            }
            vector[i] = cont1;
            cont1++;
            cont2 = 1;
            System.out.print("|");
            System.out.println("");
        }
        
        System.out.println("Por favor ingrese la fila y luego la columna de la operacion que desea consultar");
        System.out.println("Fila:");
        fila = Integer.parseInt(input.nextLine());
        System.out.println("Columna:");
        columna = Integer.parseInt(input.nextLine());
        if (fila == 9 & columna == 9) {
            System.out.println("El resultado de " + vector[columna] + " x " + vector[fila] + " es: " + matriz[fila][columna]);
        }else{
            if (fila == 9 ) {
                System.out.println("El resultado de 0" + vector[columna] + " x " + vector[fila] + " es: " + matriz[fila][columna]);
            }else{
                if (columna == 9) {
                    System.out.println("El resultado de " + vector[columna] + " x 0" + vector[fila] + " es: " + matriz[fila][columna]);
                } else {
                    System.out.println("El resultado de 0" + vector[columna] + " x 0" + vector[fila] + " es: " + matriz[fila][columna]);
                }
            }
        }
    }
}
