import java.util.*;

public class RuntimeException{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número não negativo: ");
        double n = sc.nextDouble();
        
        try{
            r = raizQuadrada(n);
            System.out.println(r);
        } 
        catch(NumeroNegativo e){
            System.out.println(e);
        }
    }
}