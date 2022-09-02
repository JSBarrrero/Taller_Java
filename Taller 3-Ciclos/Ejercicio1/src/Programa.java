public class Programa {
    public static String simbolo="*";

    public static void progama() {
        for (Integer i=1; i<=10; i++) {
            for (Integer j=1; j<=i; j++) {
                System.out.print(simbolo);
            }
            System.out.println("");
        } 
    }
}
