import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsultarInscritos {
    public static Boolean [][] incritosRealizado = new Boolean [8][2];
    public static Integer cont;
    public static Integer cont2=0;
    public static boolean salir;
    public static Integer opcion;

    public static void consultarInscritos() {
        Scanner input = new Scanner(System.in);
        salir = false;

        if (RegistrarEstudiante.cont > 0) {
            while (!salir) {
                cont=1;
                System.out.println("Usted ingreso a la opcion de consultar estudiantes y registrar si el estudiante ya realizó y aprobó el curso");
                System.out.println("Acontinuacion se le mostrara todos los estudiantes inscritos al curso");
                System.out.println("Por favor seleccione los que ya lo realizaron, de ser asi por favor seleccione si lo aprobo o no lo aprobo");
                for (Integer i=0;i<8;i++) {
                    if (!RegistrarEstudiante.estudiantes[i].equals("")) {
                        System.out.println(cont.toString()+". " + RegistrarEstudiante.estudiantes[i]);
                        cont++;
                    }
                }
                System.out.println(cont.toString() + ". Volver al menu anterior");
                opcion = Integer.parseInt(input.nextLine());
                if (opcion > 0 & opcion < cont) {
                    System.out.println("Escribir true para realizo el curso o false para no realizo el curso");
                    for (Integer i=0;i<2;i++) {
                        if(i == 0){
                            incritosRealizado[opcion-1][i] = Boolean.parseBoolean(input.nextLine());
                        }
                        if(i == 1 & incritosRealizado[opcion-1][0] == true){
                            System.out.println("Escribir true para aprobo el curso o false para reprobo el curso");
                            incritosRealizado[opcion-1][i] = Boolean.parseBoolean(input.nextLine());
                        }
                    }
                } else {
                    if (opcion == cont) {
                        salir = true;
                    } else {
                        System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                    }
                }
                System.out.println(incritosRealizado[0][0]);
            }
        } else {
            System.out.println("Usted no ha registrado ningun estudiante al curso");
        }
    }
}
