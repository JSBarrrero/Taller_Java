import java.util.Scanner;

public class RegistrarEstudiante {
    public static String [] estudiantes = new String [8];
    public static Integer cont=0;

    public static void registrarEstudiante() {
        Scanner input = new Scanner(System.in);

        if (cont == 0) {
            for (Integer i=0;i<8;i++) {
                estudiantes[i] = "";
            }
            for (Integer i=0;i<8;i++) {
                for (Integer j=0;j<2;j++){
                    ConsultarInscritos.incritosRealizado[i][j] = false;

                }
        
            }
        }
        
        if (cont < 8) {
            System.out.println("Usted ingreso a la opcion registrar estudiante");
            System.out.println("Por favor digite el nombre del estudiante");
            estudiantes[cont] = input.nextLine();
            System.out.println("El estudiante quedo correctamente registrado");
            cont++;
        } else {
            System.out.println("Usted llego a la capacidad maxima de estudiante registrados");
        }
    }
}
