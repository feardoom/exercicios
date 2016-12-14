package exercicios;

import java.util.Random;
import tools.easyIO;

public class exercicio3 {
	
	static easyIO c = new easyIO();
	
	public exercicio3() {
	
		int array[] = new int[20];
		Random rand = new Random();	
		
		for(int i=0; i<20; i++) {
			array[i] = rand.nextInt(9)+1;
		}
		
		for(int i=1; i<=9; i++) {
			c.write(i + ": ");
			int cout = 0;
			for(int j=0; j<20; j++) {
				if (array[j]==i) {
					cout++;
				}
			}
			c.write(cout + "x " + (i==9?"":"| "));
		}
		
	}
}
