import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Digite um nome: ");
            String nome = scanner.next();
    
            System.out.println("Digite um sobrenome: ");
            String sobrenome = scanner.next();
    
            System.out.println("Digite uma idade: ");
            Integer idade = scanner.nextInt();
    
            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble(); 
    
           System.out.println("Olá me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
           System.out.println("Tenho " + idade + " ano(s) ");
           System.out.println("Minha altura é " + altura + " cm.");
           scanner.close();
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser númericos.");
        }
    }
}
