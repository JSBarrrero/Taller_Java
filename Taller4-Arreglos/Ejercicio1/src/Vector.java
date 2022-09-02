public class Vector {
    public static Integer [] vector = new Integer [5];

    public static void vector() {
        vector[0] = 55;
        vector[1] = 99;
        vector[2] = 11;
        vector[3] = 56;
        vector[4] = 69;

        for (Integer i=0;i<5;i++) {
            System.out.println("["+i+"]"+" = "+ vector[i]);
        }
    }
}
