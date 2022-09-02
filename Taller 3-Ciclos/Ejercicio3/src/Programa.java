public class Programa {
    public static Integer control1 = 11;
    public static Integer control2 = 0;
    public static Integer control3 = 0;
    public static String simbolo="*";

    public static void programa() {

        do {
            do {
                System.out.print(" ");
                control2++;
            } while (control2 < control1);
            do {
                System.out.print(simbolo);
                control2++;
            } while (control2 < 12);
            System.out.println(" ");
            control2 = 0;
            control1--;
        } while (control1 > 10);

        do {
            do {
                System.out.print(" ");
                control2++;
            } while (control2 < control1);
            do {
                System.out.print(simbolo);
                control2++;
            } while (control2 < 13);
            System.out.println(" ");
            control2 = 0;
            control1--;
        } while (control1 > 9);

        control2 = 0;

        do {
            do {
                System.out.print(" ");
                control2++;
            } while (control2 < control1);
            do {
                System.out.print(simbolo);
                control2++;
            } while (control2 < 11);
            System.out.print(simbolo);
            do {
                System.out.print(simbolo);
                control2--;
            } while (control2 > control1);
            System.out.println(" ");
            control2=0;
            control1--;
        } while (control1 > 0);

        do {
            control1 = 10;
            do {
                do {
                    System.out.print(" ");
                    control2++;
                } while (control2 < control1);
                do {
                    System.out.print(simbolo);
                    control2++;
                } while (control2 < 13);
                System.out.println(" ");
                control2=0;
                control1--;   
            } while (control1 > 9);
            control3++;
        } while (control3 < 2);

        do {
            do {
                System.out.print(" ");
                control2++;
            } while (control2 < control1);
            do {
                System.out.print(simbolo);
                control2++;
            } while (control2 < 11);
            System.out.print(simbolo);
            do {
                System.out.print(simbolo);
                control2--;
            } while (control2 > control1);
            System.out.println(" ");
            control2 = 0;
            control1--;
        } while (control1 > 7);
    }
}
