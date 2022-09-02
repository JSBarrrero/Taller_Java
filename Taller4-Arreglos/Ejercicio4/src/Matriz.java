public class Matriz {
    public static String [][] mat = new String [4][5];
    public static String [][] mat2 = new String [4][5];

    public static void matriz() {
        mat[0][0] = "01"; mat[0][1] = "02"; mat[0][2] = "03"; mat[0][3] = "04"; mat[0][4] = "05";
        mat[1][0] = "06"; mat[1][1] = "07"; mat[1][2] = "08"; mat[1][3] = "09"; mat[1][4] = "10";
        mat[2][0] = "11"; mat[2][1] = "12"; mat[2][2] = "13"; mat[2][3] = "14"; mat[2][4] = "15";
        mat[3][0] = "16"; mat[3][1] = "17"; mat[3][2] = "18"; mat[3][3] = "19"; mat[3][4] = "20";

        System.out.println("Matriz normal");

        for(Integer i=0;i<4;i++){
            for (Integer j=0;j<5;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Matriz modificada");

        for (Integer i=0;i<4;i++) {
            for (Integer j=0;j<5;j++) {
                if (i % 2 == 0) {
                    mat2[i][j] = mat[i][j];
                }else{
                    mat2[i][j] = mat[i][4-j];
                }
            }
        }
        for(Integer i=0;i<4;i++){
            for (Integer j=0;j<5;j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println("");
        }
    }
 
}
