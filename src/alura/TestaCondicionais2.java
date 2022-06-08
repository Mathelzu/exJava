package alura;

public class TestaCondicionais2 {
    public static void main(String[] args) {
        int idade = 18 ;
        int quantidadePessoas =6;
        boolean acompanhado = quantidadePessoas >= 2;

        if (idade >=  18 && acompanhado){
            System.out.println("Seja bem vindo!");
        } else {
            System.out.println("infelizmente você Não pode entrar");
        }

    }
}


