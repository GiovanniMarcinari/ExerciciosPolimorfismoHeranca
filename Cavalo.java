package ExercicioPolimorfismoHerança;

import java.util.Scanner;

public class Cavalo extends Animal {
	
public Cavalo(String parTipo, String parNome) {
		
		super("Cavalo", parNome);
	}

	Scanner ler = new Scanner (System.in);
	
	
	
	
	public void setIdade(int paraIdade) {	
		
		paraIdade = ler.nextInt();
		
	}
	
	
	
	public void setSom(String tipoSons)
	{
		System.out.println(" iiiihhiiiiii ihiiiiii ! ");
	}
	

	
	public void setCorrer(int paraVelocidade)
	{
		
			System.out.println("A velocidade de um cavalo pode chegar até 80km/h");
			
	}
	
	

}
