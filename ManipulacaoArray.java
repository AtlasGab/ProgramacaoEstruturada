package Arrays;

import java.util.Scanner;

public class ManipulacaoArray {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int []numeros = new int[5];
        
        int soma=0;
        int i;

        for(i=0; i < numeros.length; i++){
            numeros[i]=ler.nextInt();
        }

        int maior=numeros[0];
        int menor=numeros[0];

        for(i=0; i < numeros.length ; i++){
            soma += numeros[i];

            if(numeros[i]<menor){
                menor=numeros[i];
            }

            if(maior<numeros[i]){
                maior=numeros[i];
            }
        }


        System.out.println("Soma: "+soma);
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);

    }

}
