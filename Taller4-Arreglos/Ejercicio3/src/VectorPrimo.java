public class VectorPrimo {
    public static Integer [] vectorPrimo = new Integer [1000];
    public static Integer cont = 1;

    public static void vectorPrimo() {
        for (Integer i=0;i<1000;i++) {
            vectorPrimo[i]=cont;
            cont++;
        }
        cont = 0;
        System.out.print("Los numeros primos del 1 al 1000 son: ");
        for (Integer i=0;i<1000;i++) {
            for (Integer j=1; j <= vectorPrimo[i]; j++) {
                if (vectorPrimo[i] % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.print(vectorPrimo[i]+", ");
            }
            cont = 0;
        }
    }
}
