import java.util.Scanner;

public class SumofNums {

    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Digite um número (-1 para sair): ");
        int number = console.nextInt();

        while (number != -1) {
            sum = sum + number;     // moved to top of loop
            System.out.print("Digite um número (-1 para sair) ");
            number = console.nextInt();
        }

        System.out.println("A soma é " + sum);

    }
}