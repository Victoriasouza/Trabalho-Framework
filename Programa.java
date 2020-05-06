package cliente;

import java.util.Scanner;

public class Programa{

public static void main(String []args)
    {
	Hexadecimal hexadecimal = new HexadecimalService().getHexadecimalPort();
	Scanner sc =new Scanner(System.in);
    
    System.out.println("Digite um numero: ");
    int hx= sc.nextInt();
        
    System.out.println(hexadecimal.decimalParaHexa(hx));
       
    }
} 
   
