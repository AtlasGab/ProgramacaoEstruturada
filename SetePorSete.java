package Arrays;

public class SetePorSete {

	public static void main(String[] args) {
		char matriz[][]=new char[7][7];
		int j,k;
		
		for(j=0;j<7;j++) {
			for(k=0;k<7;k++) {
				matriz[j][k]='*';
				System.out.print(matriz[j][k]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(j=0;j<7;j++) {
			for(k=0;k<7;k++) {
				if(k>=j) {
					matriz[j][k]='#';
					}
				System.out.print(matriz[j][k]);
			}
			System.out.println();
		}
	}
}	