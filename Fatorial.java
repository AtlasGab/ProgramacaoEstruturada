import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
			Scanner ler=new Scanner(System.in);
			
			System.out.println("Número:");
			long num=ler.nextInt();
			long fatorial=num;

			for(long i=(num-1);i>=1;i--) {
				fatorial*=i;
			}

            if(num==0){
                fatorial=1;
            }
            
			System.out.println(num+"! = "+fatorial);

            ler.close();
	}

}
