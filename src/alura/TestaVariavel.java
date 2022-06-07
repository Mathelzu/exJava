package alura;

public class TestaVariavel {
    public static void main(String[] args) {

        System.out.println("ola novo teste");

        int idade = 18;
        System.out.println("minha idade é " + idade);

        double salario = 2700.50;

        System.out.println("Seu sálario é de " + salario);

        int valorSarario = (int) salario;
        System.out.println("Seu sálario arredondado é " + valorSarario);

        double divisaoFloat = 5.0 / 2;
        System.out.println(divisaoFloat);

        double divisaoInt = 5 / 2;
        System.out.println(divisaoInt);

        int divisaoSemPonto = 5 / 2;
        System.out.println(divisaoSemPonto);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
    }
}
