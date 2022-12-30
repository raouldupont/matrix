import java.util.Scanner;
public class Multimatrix{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int dimv, spav;
		int zeile, spalte ;
		int[][] result = new int[10][10];
		
		
		System.out.println ("Geben sie die Anzahl von Zeile der Matrix oder des vectors");
		dimv =sc.nextInt();
		System.out.println ("Geben sie die Anzahl von Spalte der Matrix oder des Vetors");
		spav =sc.nextInt();
		
		System.out.println("Genben Sie die Anzahl der Zeile der Matrix oder des Vectors");
		zeile = sc.nextInt();
		System.out.println("Geben Sie die Anzahl der Spalte der Matrix  oder des Vectors");
		spalte = sc.nextInt();
		
		if(spalte!=dimv){
			System.out.println("Die Multiplikation von der Matrix mit dem Vector ist unmoeglich!!");
		}
		else{
			System.out.println("Die Multiplikaton is moeglich und wird jetz ausgefeuhrt :) !!");
			
			int vec [][]= new int [10][10];
		
		System.out.println("Geben sie die Zahlen des Vectors ein");
		for(int i= 0; i<dimv; i++){
			for(int j=0; j<spav; j++){
			vec[i][j]=sc.nextInt();
			}
		}
		
		
		int mat[][]=new int [10][10];
		System.out.println("Geben Sie die Zahlen der Matrix ein");
		for(int i=0; i<zeile; i++){
			for(int j=0; j<spalte; j++){
				mat[i][j]=sc.nextInt();	
			}
		}
		System.out.println("Das System führt die Multiplikation von der Matrix mit dem Vector aus");
		int res =0;
		for(int i=0; i<zeile; i++){
			for(int j=0; j<spav; j++){
				for(int k=0; k<dimv; k++){
					res +=mat[i][k]*vec[k][j];
				}
				result[i][j]=res;
				res = 0;
			}
		}
		for(int i =0; i<zeile; i++){
			for(int j=0; j<spav; j++){
				System.out.printf("%d\t", result[i][j]);
			
			}
			System.out.println();
		}
		}
		
		
		
		
		
		
	}
}