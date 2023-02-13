import java.util.Scanner;

public class MainConsole {

    public MainConsole() {
       about();
       task();
       doit();
        
    }
    private void task(){
        System.out.println("Feladat 0251 megoldas");
        System.out.println("Paralelogramma terület");
    }
    private void about(){
        System.out.println("Molnar Csenge Anna");
        System.out.println("Szoft I-1-N");
        System.out.println("2023-02-06");
    }
    private String input(String msg)
    {
        System.out.print(msg);
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();

        return value;
    }
    private void doit(){
        String aStr = input("A oldal: ");
        String bStr = input("B oldal: ");
        String gammaStr = input("Gamma: ");

        double a = Double.parseDouble(aStr);
        double b = Double.parseDouble(bStr);
        double gamma = Double.parseDouble(gammaStr);

        Paralelogramma para = new Paralelogramma();
        double area = para.calcArea(a, b, gamma);
        System.out.printf("%.2f\n", area);
    }
    
}
