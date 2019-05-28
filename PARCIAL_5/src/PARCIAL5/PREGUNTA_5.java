package PARCIAL5;


	
	import java.util.Scanner ;
	public class PREGUNTA_5 {
		
		public static void main(String[] args) {
			
		Scanner teclado =new Scanner(System.in);
	        
	        System.out.println("Escriba una palabra");	
		
			String palabra= teclado.nextLine();
			
			int j=palabra.length();
			
			char A[] = new char[j];
			
			
			
			for(int i=0;i<palabra.length();i++) {
				
				A[j-i-1]= palabra.charAt(i);
				 
				 
			}
			String palabra2 =String.valueOf(A);
			if(palabra2.equalsIgnoreCase(palabra)) {
				System.out.println("Palindromo");
			
			}else
			{
				System.out.println(" No es Palindromo");
			}
	            
				
		}
	}

