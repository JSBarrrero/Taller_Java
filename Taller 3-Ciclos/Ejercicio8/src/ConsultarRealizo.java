public class ConsultarRealizo {
    public static Integer cont;
    public static Integer cont2;

    public static void consultarRealizo() {
        cont = 0;
        cont2 = 1;

        if (RegistrarEstudiante.cont > 0) {
            for (Integer i=0;i<8;i++) {
                if (!ConsultarInscritos.incritosRealizado[i][0]) {
                    cont++;
                }
            }
            if (cont == 8) {
                System.out.println("Ningun estudiante inscrito a realizado el curso");
            }else{
                System.out.println("Los estudiantes que realizaron el curso son:");
                for (Integer j=0;j<8;j++) {
                    if (ConsultarInscritos.incritosRealizado[j][0] == true) {
                        System.out.println(cont2 + ". "+ RegistrarEstudiante.estudiantes[j]);
                        cont2++;
                    }
                }
            }
        } else {
            System.out.println("Usted no ha registrado ningun estudiante al curso");
        }
    }
}
