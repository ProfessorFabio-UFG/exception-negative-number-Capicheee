import java.util.Scanner;

public class Main{
    private static double raizQuadrada(double x){
        if(x<0){
            throw new NumeroNegativo("Raíz de número negativo.");
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args){
        System.out.println("Digite um número não negativo: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double r = 0;
        try{

        }
    }
}