package nivel2;

import tools.easyIO;

public class exercicio6 {
	
	static easyIO c = new easyIO();
	
	public exercicio6() {
		int var1, var2;
		c.writeLine("Introduza dois números");
		var1 = c.readN();
		var2 = c.readN();
		c.writeLine("Vão aparecer todos os números pares entre os números introduzidos");
		for (int i=var1; i<=var2; i++) {
			if (i%2==0) {
				c.writeLine(i + " ");
			}
		}
	}
}
