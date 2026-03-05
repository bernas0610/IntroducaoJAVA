import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){

        double num1;
        double num2;
        double num3;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número qualquer: ");
        num1 = entrada.nextDouble();
        System.out.println("Digite um segundo número qualquer: ");
        num2 = entrada.nextDouble();
        System.out.println("Digite um terceiro número qualquer");
        num3 = entrada.nextDouble();

        double media = ((num1+num2+num3)/3);
        System.out.println("A média dos números digitados é igual a: "+ +media);
    }
}
