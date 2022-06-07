package alura;

public class TestaCondicionais {
    public static void main(String[] args) {
        int idade = 16 ;
        int quantidadePessoas = 0;
        if (idade >=  18) {
            System.out.println("Você é maior de idade, pode entrar!");
            System.out.println("bem vindo!");
        }
        else {
            if (quantidadePessoas >= 2) {
                System.out.println("voce nao tem 18, mas pode entrar, pois está acompanhado");
        }
            else {
                System.out.println("você é menor, Não pode entrar");
            }
    }
}
}
