package exercicios;

import java.util.Random;
import tools.easyIO;

public class exercicio8 {
	
	static easyIO c = new easyIO();
	
	public exercicio8() {
		
		Random rand = new Random();
		boolean falha = false;
		int acertou = 0;
		int num = rand.nextInt(9)+1;
		int proximo;
		
		c.writeLine("Jogo \"Sobe e Desce\"! Introduza 'c' para indicar que o próximo número será maior ou 'b' se será menor.");
		
		while(!falha) {

			char guess;
			c.writeLine("O numero é " + num);
			guess = c.readC();
			
			do {
				proximo = rand.nextInt(9)+1;
			}while(proximo==num);
			
			switch(guess) {
				case 'c':
					if(proximo>num){
						acertou++;
					} else {
						falha = true;
					}
					break;
				case 'b':
					if(proximo<num){
						acertou++;
					} else {
						falha = true;
					}
					break;
				default:
					c.writeLine("Introduziu uma opcao invalida!");
					falha = true;
					break;
			}
			
			num = proximo;
			
		}
		
		c.writeLine("O jogo acabou, voce acertou " + acertou + " vezes!!!");
		
	}
}
