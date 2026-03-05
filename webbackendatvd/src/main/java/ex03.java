import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){

        int carrosvendidos;
        double totalvendido;
        double salariofixo;
        int comissao = 300;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos carros foram vendidos?: ");
        carrosvendidos = entrada.nextInt();

        System.out.println("Valor total vendido: ");
        totalvendido = entrada.nextDouble();

        System.out.println("Qual seu salario fixo?: ");
        salariofixo = entrada.nextDouble();

        double valorComissao = carrosvendidos * comissao;
        double valorPorcentagem = totalvendido * 0.05;

        double salarioFinal = salariofixo + valorComissao + valorPorcentagem;

        System.out.println("O valor total que ira receber será: " + salarioFinal);










    }
}
