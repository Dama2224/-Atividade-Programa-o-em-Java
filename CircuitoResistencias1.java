import java.util.Scanner;

public class CircuitoResistencias {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 double[] resistencias = new double[4];
 double soma = 0;

 for (int i = 0; i < 4; i++) {
 System.out.print("Valor da resistência " + (i + 1) + ": ");
 resistencias[i] = sc.nextDouble();
 soma += resistencias[i];
 }

 double maior = resistencias[0];
 double menor = resistencias[0];

 for (double r : resistencias) {
 if (r > maior) maior = r;
 if (r < menor) menor = r;
 }

 System.out.println("Resistência equivalente: " + soma);
 System.out.println("Maior resistência: " + maior);
 System.out.println("Menor resistência: " + menor);

 sc.close();
 }
}