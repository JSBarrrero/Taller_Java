public class MostrarPareseImpares {
    public static Integer [] vectorPar = new Integer [20];
    public static Integer [] vectorImpar = new Integer [20];
    public static Integer cont1=0;
    public static Integer cont2=0;

    public static void mostrarPareseImpares() {

        for (Integer i=0;i<20;i++) {
            if (Vector20.vector[i] % 2 == 0) {
                vectorPar[cont1] = Vector20.vector[i];
                cont1++;
            }else{
                vectorImpar[cont2] = Vector20.vector[i];
                cont2++;
            }
        }

        if (cont1 != 0) {
            System.out.print("Numeros pares: " );
            for (Integer i=0;i<cont1;i++) {
                if (i < cont1-1) {
                    System.out.print(vectorPar[i] + ", ");
                } else {
                    System.out.print(vectorPar[i]);
                }
            }
        }else{
            System.out.println("No hay numeros pares");
        }
        System.out.println("");
        if (cont2 != 0) {
            System.out.print("Numeros impares: " );
            for (Integer i=0;i<cont1;i++) {
                if (i < cont1-1) {
                    System.out.print(vectorImpar[i] + ", ");
                } else {
                    System.out.print(vectorImpar[i]);
                }
            }
        }else{
            System.out.println("No hay numeros impares");
        }
    }
}
