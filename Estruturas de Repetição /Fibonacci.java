import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int penultimo=0;
		int ultimo=1;
		int aux;
		
		System.out.println("Posição da sequência de Fibonacci:");
		int posicao=ler.nextInt();
		
		for(int i=posicao;i>=1;i--) {
			aux=penultimo+ultimo;
			penultimo=ultimo;
			ultimo=aux;
		}
		
		System.out.println(penultimo);

		ler.close();
	}

}
