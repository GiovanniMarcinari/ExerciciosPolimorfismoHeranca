package ExercicioPolimorfismoHerança;

import java.util.Scanner;

public class ExercicioPolimorfismoHerançaAnimais {

	public static void main(String[] args) {
		
		String Nome;
		int escolhaTipo;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Nome do animal: ");
		Nome = ler.nextLine();
		System.out.print("Escolha o tipo do animal:\n1- Cavalo \n2- Cachorro \n3- Preguiça \nR: ");
		escolhaTipo = ler.nextInt();
		
		Cavalo cavalo = new Cavalo(null, null);
		Cachorro cachorro = new Cachorro(null, null);
		Preguica preguica = new Preguica(null, null);
		
		Animal animal = null;
		
		if(escolhaTipo == 1) {
			
			animal = cavalo;	
		}
		else if(escolhaTipo == 2) {
			
			animal = cachorro;
		}
		else if(escolhaTipo == 3){
			
			animal = preguica;
		}
		else {
			
			System.out.println("Número Inválido. Digite Novamente!");
		}
		
		animal.setAtrNome(null);
		animal.setAtrTipo(null);
		animal.setIdade(0);
		animal.setSom(null);
		animal.setCorrer(0);
	
	}
	}
