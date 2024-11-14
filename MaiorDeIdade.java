package EstrturasCondicionais;

import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String [] args){
        Scanner ler=new Scanner(System.in);

        System.out.println("Digite a sua idade:");
        int idade=ler.nextInt();

        if(idade>=18){
            System.out.println("Você é maior de idade.");
        }else{
            System.out.println("Você é menor de idade");
        }

        ler.close();
    }
}
