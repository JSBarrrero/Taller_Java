import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer opcion;
    public static boolean salir;

    public static void menu() {
        Scanner input = new Scanner(System.in);
        salir = false;

        while (!salir) {
            System.out.println("Bienvenido a la escuela automovilistica El Maestro");
            System.out.println("Elija una opcion");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Consultar estudiantes inscrito y registrar si realizó y aprobó el curso");
            System.out.println("3. Consultar estudiantes que han realizado el curso");
            System.out.println("4. Consultar resultados de los cursos");
            System.out.println("5. Salir del programa");
            try {
                opcion = Integer.parseInt(input.nextLine());

                switch (opcion) {
                    case 1:
                        RegistrarEstudiante.registrarEstudiante();
                        break;
                    case 2:
                        ConsultarInscritos.consultarInscritos();
                        break;
                    case 3:
                        ConsultarRealizo.consultarRealizo();
                        break;
                    case 4:
                        ConsultarResultados.consultarResultados();
                        break;              
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("La opcion que ingreso no es valida por favor intenlo nuevamente");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("La opcion que ingreso no es valida por favor intenlo nuevamente");
                input.next();
            }
        }
    }  
}
