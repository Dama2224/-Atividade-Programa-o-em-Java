import java.util.Scanner;

public class CalculadoraAposentadoria {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.print("Idade: ");
 int idade = sc.nextInt();

 System.out.print("Sexo (M/F): ");
 char sexo = sc.next().toUpperCase().charAt(0);

 System.out.print("Anos de contribuição: ");
 int contribuicao = sc.nextInt();

 int idadeMin = (sexo == 'M') ? 65 : 62;
 int contribMin = (sexo == 'M') ? 35 : 30;

 boolean aposentaPorIdade = idade >= idadeMin;
 boolean aposentaPorContrib = contribuicao >= contribMin;

 if (aposentaPorIdade || aposentaPorContrib) {
 System.out.println("Pode se aposentar.");
 } else {
 int faltamIdade = idadeMin - idade;
 int faltamContrib = contribMin - contribuicao;

 System.out.println("Não pode se aposentar ainda.");
 System.out.println("Falta(m) " + faltamIdade + " ano(s) por idade.");
 System.out.println("Falta(m) " + faltamContrib + " ano(s) por contribuição.");
 }

 sc.close();
 }
}