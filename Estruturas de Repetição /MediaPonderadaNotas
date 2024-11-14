import java.util.Scanner;

public class MediaPonderadaNotas {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3,n4;

		do{ 
			System.out.println("Primeira nota:");
			n1=ler.nextInt();
		}while (n1<0 || n1>100);

		
		do {
			System.out.println("Segunda nota:");
			n2=ler.nextInt();
		} while(n2<0 || n2>100);
		

		do {
			System.out.println("Terceira nota:");
			n3=ler.nextInt();
		} while(n3<0 || n3>100);
		

		do {
			System.out.println("Quarta nota:");
			n4=ler.nextInt();
		} while(n4<0 || n4>100);

		
		int media=((n1*2+n2*2+n3*3+n4*3)/10);
		
		if(media>=60) {
			System.out.println("Média:"+media);
			System.out.println("Situação: Aprovado(a)");
		}else {
			System.out.println("Média:"+media);
			System.out.println("Situação: Reprovado(a)");
		}

		ler.close();
	}
}
