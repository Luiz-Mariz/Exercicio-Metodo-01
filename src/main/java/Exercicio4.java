import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a temperatura em Celsius: ");
        double temperatura = sc.nextInt();

        System.out.print("Deseja converter em Fahrenheit ou Kelvin (F/K): ");
        char escolhaTemperatura = sc.next().charAt(0);

        double converção = (char) converTemp(escolhaTemperatura, temperatura);
        showResult(converção,(char) escolhaTemperatura);
    }


    public static double converTemp(char escolhaTemperatura, double temperatura){
        double convertido = 0;
        if (escolhaTemperatura == 'F'){
            convertido = temperatura * 1.8 + 32;
        } else if (escolhaTemperatura == 'K') {
            convertido = temperatura + 273;
        }
        return (char) convertido;
    }

    private static void showResult(double value, char escolhaTemperatura) {
        if (escolhaTemperatura == 'F'){
            System.out.println("Temperatura convertidas em Fahrenheit: " + value);
        } else if (escolhaTemperatura == 'K') {
            System.out.println("Temperatura convertida em Kelvin: " + value);
        }else {
            System.out.println("Error");
        }

    }
}