package PACIAL6;
import java.util.Scanner;
public class PREGUNTA_6 {
	
	

		public static void main(String[] args) {
			
			Scanner teclado=new Scanner(System.in);
			
			 int c=0;
		
			 System.out.println("Ingrese la cantidad del conjunto de numeros:");
			 
			c=teclado.nextInt();
			
			int M[]=new int [c];
			
			int N[]=new int[M.length-3];
			
			int A=M.length;
			
			System.out.println("Ingrese los numeros del conjunto:");
			
			
	        for (int i=0;i<A;i++) {
	        	
	        	M[i]=teclado.nextInt();
	        	
	        }
	      
	        for(int i=0;i<A-3;i++) {
	        	
	        	N[i]=M[i]*M[i+1]*M[i+2]*M[i+3];	
	        	
	        }
	        int pmax=N[0];
	       
	        
	        for (int i=0;i<A-3;i++) {
	        	
	        	if( pmax< N[i]);
	        
	        
	        }
	 
	        System.out.println("Producto maximo: " + pmax);
	       
		}
		
		
	}


