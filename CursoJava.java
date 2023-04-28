import java.security.SecureRandom;

public class CursoJava{
    public static void main(String[]args){
       
        final int linhas=3;
        final int colunas=5;

        int[][] matriz=new int[linhas][colunas];
        
        for(int l=0; l<linhas;l++){
            for (int c=0; c<colunas;c++){
                matriz[l][c]=new SecureRandom().nextInt(100);
            }
        }
        System.out.println("Matriz 01 - Loop For tradicional");
        for(int l=0; l<linhas;l++){
            for(int c=0;c<colunas;c++){
                System.out.printf("%2d | ",matriz[l][c]);
                }
                System.out.printf("%n");
        }
        System.out.println("\nMatriz 02 - Loop for simplificado:");

        //for simplificado para arrays
        for (int[] m:matriz){
            for(int v:m){
                System.out.printf("%2d | ", v);
            }
            System.out.printf("%n");
        }
       

    }
}