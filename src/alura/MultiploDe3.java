package alura;

public class MultiploDe3 {
    public static void main(String[] args) {
        System.out.println("Multiplos de 3: ");
        for(int multiplo = 3; multiplo <= 100; multiplo ++){ if (multiplo % 3 == 0){
                System.out.print( multiplo);
            System.out.print(" ");
            }
        }
    }
}
