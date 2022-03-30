import java.util.Scanner;

public class Calc {
	
	public int Soma(int num1, int num2) {
	  
		return num1 + num2;
		
	}
	public int Subtracao(int num1, int num2){
	   
		return num1 - num2;
		
	}
	public int Divisao(int num1,int num2){
	    
		return num1 / num2;
		
	}
	public int Multiplicacao(int num1, int num2){
	     
		return num1 - num2;
		
	}
	
	
	
	public static void main (String args[]){
		
		
		Calc c = new Calc();
		
		int opcao = 5;
		int num1;
		int num2;
		
	      Scanner input = new Scanner(System.in);  
	      
	      
		System.out.println("A seguir escolha qual operação deseja");
	    System.out.println("1 Somar");  
	    System.out.println("2 Subtrair");  
	    System.out.println("3 Multiplicar");  
	    System.out.println("4 Dividir");  
	    System.out.println("0 Para sair");  
	    System.out.println("Operação: ");  
	    
	    opcao = input.nextInt();
	    
	    while (opcao != 0) {
	    
	    	if (opcao == 1) {
	    		
	    	    Scanner input1 = new Scanner(System.in);  
	  	      
	    		System.out.println("Primeiro numero: ");
	    		 num1 = input1.nextInt();
	    		System.out.println("Segundo numero: ");
	    		 num2 = input1.nextInt();
	    		 
	    			int operacao = c.som(num1, num2);
	    			
	    			System.out.println(operacao);
	    		break;
	    	}
	    	 	if (opcao == 2) {
		    		
	    	 		  Scanner input1 = new Scanner(System.in);  
	    	  	      
	  	    		System.out.println("Primeiro numero: ");
	  	    		 num1 = input1.nextInt();
	  	    		System.out.println("Segundo numero: ");
	  	    		 num2 = input1.nextInt();
	  	    			int operacao = c.sub(num1, num2);
	  	    			
	  	    			System.out.println(operacao);
		    		
		    		break;
		    		}
		    	 	if (opcao == 3) {
		    	 		  Scanner input1 = new Scanner(System.in);  
		    	  	      
		  	    		System.out.println("Primeiro numero: ");
		  	    		 num1 = input1.nextInt();
		  	    		System.out.println("Segundo numero: ");
		  	    		 num2 = input1.nextInt();
		  	    			int operacao = c.mult(num1, num2);
		  	    			
		  	    			System.out.println(operacao);
			    		break;
		    	 	}
			    	 	if (opcao == 4) {
			    	 		  Scanner input1 = new Scanner(System.in);  
			    	  	      
			  	    		System.out.println("Primeiro numero: ");
			  	    		 num1 = input1.nextInt();
			  	    		System.out.println("Segundo numero: ");
			  	    		 num2 = input1.nextInt();
			  	    			int operacao = c.div(num1, num2);
			  	    			
			  	    			System.out.println(operacao);
				    		break;
				    		}
	    }
	}
}
