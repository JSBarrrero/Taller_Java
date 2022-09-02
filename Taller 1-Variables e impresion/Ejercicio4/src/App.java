import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Pais paisYCapital = new Pais();

        System.out.println("Por favor digite un país");
        paisYCapital.pais = input.nextLine();
        System.out.println("Por favor digite la ciudad capital del país que escribio anteriormente");
        paisYCapital.ciudad = input.nextLine();
        System.out.println("La ciudad " + paisYCapital.ciudad + ", es la capital del país "+ paisYCapital.pais);

        
    }
}
