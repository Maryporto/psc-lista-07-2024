
import java.util.Scanner;

public class Seller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counters = new int[9];

        System.out.println("Digite o número de vendedores:");
        int numVendedores = scanner.nextInt();

        for (int i = 0; i < numVendedores; i++) {
            System.out.println("Digite as vendas brutas do vendedor " + (i + 1) + ":");
            double vendasBrutas = scanner.nextDouble();
            double salario = 200 + (0.09 * vendasBrutas);

            if (salario >= 200 && salario <= 299) {
                counters[0]++;
            } else if (salario >= 300 && salario <= 399) {
                counters[1]++;
            } else if (salario >= 400 && salario <= 499) {
                counters[2]++;
            } else if (salario >= 500 && salario <= 599) {
                counters[3]++;
            } else if (salario >= 600 && salario <= 699) {
                counters[4]++;
            } else if (salario >= 700 && salario <= 799) {
                counters[5]++;
            } else if (salario >= 800 && salario <= 899) {
                counters[6]++;
            } else if (salario >= 900 && salario <= 999) {
                counters[7]++;
            } else {
                counters[8]++;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            int minRange = 200 + (100 * i);
            int maxRange = minRange + 99;
            if (i == counters.length - 1) {
                System.out.println("$" + minRange + " em diante: " + counters[i] + " vendedores");
            } else {
                System.out.println("$" + minRange + " - $" + maxRange + ": " + counters[i] + " vendedores");
            }
        }
    }
}
