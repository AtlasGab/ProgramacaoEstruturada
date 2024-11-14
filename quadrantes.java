package Arrays;

import java.util.Scanner;

public class quadrantes {
  public static void main(String args[]) {
     Scanner ler=new Scanner(System.in);
     
     int tamanho;
     do{
     System.out.println("Digite um valor par e maior que 0: ");
     tamanho=ler.nextInt();
     }while(tamanho%2==1 || tamanho<=0);
     
     int matriz[][]=new int[tamanho][tamanho];
     
     for(int i=0;i<tamanho;i++){
       for (int j=0;j<tamanho;j++){
         if(i<tamanho/2 && j<tamanho/2){
           matriz[i][j]=1;
           }else if(i>=tamanho/2 && j<tamanho/2){
           matriz[i][j]=3;
           }else if(i<tamanho/2 && j>=tamanho/2){
           matriz[i][j]=2;
           }else{
           matriz[i][j]=4;
           }
         System.out.print(matriz[i][j]);
         }
         System.out.println();
        }
     
  }
}
