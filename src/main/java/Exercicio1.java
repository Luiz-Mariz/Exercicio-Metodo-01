import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "1234";

        System.out.print("Insira a senha correta: ");
        String senhaUser = sc.nextLine();

        String verificadorSenha = veri(senhaCorreta,senhaUser);
        showResult(verificadorSenha);
    }



    public static String veri(String senhaCorreta, String senhaUser){
        String verificadorSenha;
        if (senhaCorreta.equals(senhaUser)){
            verificadorSenha = "Senha correta";
        }
        else {
            verificadorSenha = "Senha incorreta";
        }
        return verificadorSenha;
    }


    public static void showResult(String value){
        System.out.println(value);
    }
}