

public class Carrito {
    public static String nomProd[] = new String [8];
    public static int  [][] cantYValor = new int [8][2];
    public static Integer cant2;
    public static Integer valor2;
    public static int cont = 0;

    public static void carrito(String nombreProduc, Integer cant, Integer valor) {

        if (cont == 0) {
            for (int i=0; i<8; i++) {
                nomProd[i] = "";
            }
        }

            for (int i=0; i<8; i++) {
                if (nomProd[i] == nombreProduc) {
                    for (int j=0; j<2; j++) {
                        if (j == 0) {
                            cant2 = cantYValor[i][j];
                            cantYValor[i][j] = cant2 + cant;
                        }
                        if (j == 1) {
                            valor2 = cantYValor[i][j];
                            cantYValor[i][j] = valor2 + valor;
                        }   
                    } 
                    break;  
                }else{
                    nomProd[cont]=nombreProduc;
                    for (int j=0; j<2; j++) {
                        if (j == 0) {
                            cantYValor[cont][j] = cant;
                        }
                        if (j == 1) {
                        cantYValor[cont][j] = valor;
                        }   
                    }
                    cont++;
                    break;
                } 
            }
        
    }
}
