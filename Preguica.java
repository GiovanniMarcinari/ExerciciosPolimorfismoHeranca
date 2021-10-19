package ExercicioPolimorfismoHerança;

import java.util.Scanner;

public class Preguica extends Animal {

	public Preguica(String parTipo, String parNome) {
		
		super("Preguica", parNome);
	
	}
	
	Scanner ler = new Scanner (System.in);
	
	
	
		public void setIdade(int paraIdade) {
		
		System.out.println("Digite a idade da Preguica: ");
		paraIdade = ler.nextInt();
		
	}
	
	
	
	public void setSom(String tipoSons)
	{
		System.out.println(" fiiiiiiiuuuu , fiiiiiiuuuuuu ");
	}
	
	
	
	public void setCorrer(int paraVelocidade)
	{
		System.out.println(" A Preguica não corre, mas sobe em árvores! ");
	}
	

}
