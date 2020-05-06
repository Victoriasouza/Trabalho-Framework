package control;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class Hexadecimal {
	@WebMethod
	public String decimalParaHexa(@WebParam(name = "valor") int valor) {

		int i = 0, d = 0;
		
		String hx = "", h = "";
		
			d = valor % 16;
			valor /= 16;
			if (d == 10)
				h = "A";
			else if (d == 11)
				h = "B";
			else if (d == 12)
				h = "C";
			else if (d == 13)
				h = "D";
			else if (d == 14)
				h = "E";
			else if (d == 15)
				h = "F";
			else
				h = "" + d; 
			hx = "" + h + hx;
		

		return "O numero em hexadecimal e: " + hx;
	}
}
