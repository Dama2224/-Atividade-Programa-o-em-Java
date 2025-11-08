import java.util.Scanner;

public class SistemaLogin {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 String loginCorreto = "java8";
 String senhaCorreta = "java8";

 int tentativas = 3;

 while (tentativas > 0) {
 System.out.print("Login: ");
 String login = sc.nextLine();

 System.out.print("Senha: ");
 String senha = sc.nextLine();

 if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
 System.out.println("Acesso permitido.");
 sc.close();
 return;
 } else {
 tentativas--;
 System.out.println("Credenciais incorretas. Tentativas restantes: " + tentativas);
 }
 }

 System.out.println("Acesso bloqueado.");
 sc.close();
 }
}