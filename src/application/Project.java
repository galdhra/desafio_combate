package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Project {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Champion champion = new Champion();

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Name: ");
		String name1 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life1 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack1 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor1 = sc.nextInt();
		sc.nextLine();
		Champion champion1 = new Champion(name1, life1, attack1, armor1);

		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Name: ");
		String name2 = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life2 = sc.nextInt();
		System.out.print("Ataque: ");
		int attack2 = sc.nextInt();
		System.out.print("Armadura: ");
		int armor2 = sc.nextInt();
		Champion champion2 = new Champion(name2, life2, attack2, armor2);

		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		champion.rounds = sc.nextInt();

		for (int i = 0; i < champion.rounds && champion1.getLife() != 0 && champion2.getLife() != 0; i++) {

			if (champion1.getAttack() <= champion2.getArmor()) {
				champion1.setAttack(champion2.getArmor() + 1);
			}

			if (champion2.getAttack() <= champion1.getArmor()) {
				champion2.setAttack(champion1.getArmor() + 1);
			}
		
			
			champion1.takeDemage(champion2.getAttack(), champion1.getArmor());
			champion2.takeDemage(champion1.getAttack(), champion2.getArmor());
			
			if (champion1.getLife() <= 0) {
				int l1 = 0;
				champion1.setLife(l1);
				System.out.println("Resultado do turno " + (i+1) + " :");
				System.out.println(champion1 + "(morreu)");
				System.out.println(champion2);

			} else if (champion2.getLife() <= 0) {
				int l2 = 0;
				champion2.setLife(l2);
				System.out.println("Resultado do turno " + (i+1) + " :");
				System.out.println(champion1);
				System.out.println(champion2 + "(morreu)");
			}else {
				System.out.println("Resultado do turno " + (i+1) + " :");
				System.out.println(champion1);
				System.out.println(champion2);
			}
		}

		System.out.println();
		System.out.print("FIM DO COMBATE");

		sc.close();
	}

}
