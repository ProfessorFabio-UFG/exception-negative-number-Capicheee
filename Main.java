import java.util.Scanner;

public class Main {
    private static double raizQuadrada(double x) {
        if (x < 0){
            throw new NumeroNegativo("Raiz de numero negativo nao permitida.");
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero nao negativo: ");
        double x = sc.nextDouble();
        
        try{
            double r = raizQuadrada(x);
            System.out.println("Raiz quadrada: " + r);
        } 
        catch (NumeroNegativo e){
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
