public class Programa {
    public static Integer control1=10;
    public static Integer control2=0;
    public static String simbolo="*";
    
    public static void programa() {
        while (control1 > 0) {
            while (control2 < control1-1) {
                System.out.print(" ");
                control2++;
            }
            while (control2 < 10) {
                System.out.print(simbolo);
                control2++;
            }
            control2 = 0;
            control1--;
            System.out.println("");
        }
    }
}
