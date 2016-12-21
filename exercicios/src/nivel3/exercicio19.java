package nivel3;
import tools.easyIO;

public class exercicio19 {

	static easyIO c = new easyIO();
	
	public int fact(int f, int i) {
		return (i>1?fact(f*--i, i):f);
	}
	
	public exercicio19() {		
		c.writeLine("Introduza um numero de 2 a 10");
		int n = c.readN();
		// método função recursiva
		c.writeLine("O factorial do numero introduzido é " + fact(n,n));
		
		// método for
		for (int i=n-1; i>0; i--) {
			n*=i;
		}
		c.writeLine("\nO factorial do numero introduzido é " + n);
		
	}
}
