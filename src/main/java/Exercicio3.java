import java.util.Scanner;


public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int idade = sc.nextInt();

        int categoria = ABC(idade);
        showResult(categoria);
    }

    public static int ABC(int idade){
        int categoria;
        if (idade >= 1 && idade <= 10){
            categoria = 1;
        } else if (idade >= 11 && idade <= 20) {
            categoria = 2;
        } else if (idade >= 21 && idade <= 30) {
            categoria = 3;
        }else {
            categoria = 4;
        }
        return categoria;
    }

    public static void showResult(int value){
        if (value == 1){
            System.out.println("O número pertence a categoria A");
        } else if (value == 2) {
            System.out.println("O número pertence a categoria B");

        } else if (value == 3) {
            System.out.println("O número pertece a categoria C");

        }else {
            System.out.println("O número não pertence a nenhuma categoria");
        }
    }
}
