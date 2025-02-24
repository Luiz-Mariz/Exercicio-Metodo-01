import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        double idade = sc.nextInt();

        System.out.print("Informe seu peso: ");
        double peso = sc.nextDouble();

        String apto = aptoDoar(idade,peso);
        showResult(apto);

    }

    public static String aptoDoar(double idade, double peso){
        String resp;
        if ((idade >= 18 && idade <=65) && (peso >=50)){
            resp = "Você esta apto a doar sangue";
        }else {
            resp = "Você não esta apto a doar sangue";
        }
        return resp;
    }

    public static void showResult (String apto){
        System.out.println(apto);
    }
}