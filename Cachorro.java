package ExercicioPolimorfismoHerança;

import java.util.Scanner;

public class Cachorro  extends Animal{
	
public Cachorro(String parTipo, String parNome) {
		
		super("Cachorro", parNome);
	
	}
	
	Scanner ler = new Scanner (System.in);
	
	
	
	public void setIdade(int paraIdade) {
		
		System.out.println("Digite a idade do cachorro: ");
		paraIdade = ler.nextInt();
		
	}
		
		
		public void setSom(String tipoSons)
		{
			System.out.println("AU, AU, AU, AUUUUU! ");
		}
		
		
		
		public void setCorrer(int paraVelocidade)
		{
				
			System.out.println("A velocidade de um cachorro pode chegar até 45km/h");
				
		}
}
