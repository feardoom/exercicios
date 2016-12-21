package nivel3;

import tools.easyIO;

public class exercicio10 {
	
	static easyIO c = new easyIO();

	public exercicio10() {
		
		char op;
		int n1,n2;
		float res = 0;
		
		do {
			c.writeLine("Introduza o primeiro numero");
			n1 = c.readN();
			
			c.writeLine("Escolha uma opção:\n+ \n- \n* \n/ \n0 para sair do programa");
			op = c.readC();
			
			if(op=='0') {
				break;
			}
			
			c.writeLine("Introduza o segundo numero");
			n2 = c.readN();
			
			switch(op) {
				case '+':
					res = n1+n2;
					break;
				case '-':
					res = n1-n2;
					break;
				case '*':
					res = n1*n2;
					break;
				case '/':
					res = n1/n2;
					break;
				default:
					break;
			}
			
			c.writeLine("\nO resultado da conta é " + res);
			
		}while(op!='0');
	}
	
}
