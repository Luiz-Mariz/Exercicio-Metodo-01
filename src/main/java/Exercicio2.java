import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o saldo: ");
        double saldoUser = sc.nextDouble();
        System.out.println("Informe o valor do saque: ");
        double saqueUser = sc.nextDouble();

        boolean verificacaoSaque = veri(saldoUser,saqueUser);
        showResult(verificacaoSaque);

    }

    public static boolean veri(double saldoUser, double saqueUser){
        boolean verificacaoSaque;
        if (saqueUser <= saldoUser){
            verificacaoSaque = true;
        }
        else {
            verificacaoSaque = false;
        }
        return  verificacaoSaque;
    }

    public static void showResult (boolean value){
        if (value == true){
            System.out.println("Você pode sacar");
        }
        else {
            System.out.println("Você não pode sacar");
        }
    }
}
