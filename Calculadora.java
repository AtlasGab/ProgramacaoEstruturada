package EstrturasCondicionais;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner op=new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        int n1=op.nextInt();
        
        System.out.println("Digite o segundo número:");
        int n2=op.nextInt();
        
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        
        
        System.out.println("Sua opção:");
        int operacao=op.nextInt();
        
        System.out.println("Resultado:");
        
        switch(operacao){
            case 1:
                System.out.println(n1+n2);
                break;
                
            case 2:
            	System.out.println(n1-n2);
            	break;
            	
            case 3:
            	System.out.println(n1*n2);
            	break;
            
            case 4:
            	System.out.println(n1/n2);
            	break;
            	
            default:
            	System.out.println("Operação inválida.");
            	break;
        	}   	
            
            op.close();
	}

}
