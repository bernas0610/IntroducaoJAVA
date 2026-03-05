import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){

        int num1;
        int num2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num1 = entrada.nextInt();

        System.out.println("Digite outro número inteiro: ");
        num2 = entrada.nextInt();


        double resultadoExato = (double) num1 / num2;


        int parteInteira = num1 / num2;


        int resto = num1 % num2;

        System.out.println("Resultado exato: " + resultadoExato);
        System.out.println("Parte inteira: " + parteInteira);
        System.out.println("Resto: " + resto);







    }
}
