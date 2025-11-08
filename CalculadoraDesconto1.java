import java.util.Scanner;

public class CalculadoraDesconto {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Valor do produto: ");
 double valor = sc.nextDouble();

 System.out.print("Porcentagem de desconto (%): ");
 double desconto = sc.nextDouble();

 double valorDesconto = valor * (desconto / 100);
 double precoFinal = valor - valorDesconto;

 System.out.println("Valor do desconto: R$ " + valorDesconto);
 System.out.println("Preço final: R$ " + precoFinal);

 sc.close();
 }
}