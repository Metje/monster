import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Arena {


	public static void main(String[] args) {

		List<Monster> lMonster = new ArrayList<>();
		lMonster.add(new FireMonster("Fire1 ", 3, 12));
		lMonster.add(new FireMonster("Fire2 ", 5, 20));
		lMonster.add(new WaterMonster("Water1", 3, 20));
		lMonster.add(new GrassMonster("Grass1", 1, 20));
		lMonster.add(new SnowMonster("Snowy1", 3, 30));

		Monster myMonster = chooseMonster(lMonster);
		Monster oppositeMonster = oppositeMonster(lMonster); // das gewählte Monster wurde entfernt

		// Der Kampf
		while ((myMonster.getLife() > 0) && (oppositeMonster.getLife() > 0)) {
			myMonster.takeHit(oppositeMonster);
			if (myMonster.getLife() > 0)
				oppositeMonster.takeHit(myMonster);
		}

	}

	private static Monster chooseMonster(List<Monster> lMonster) {
		// Ausgabe Liste
		int n = 1;
		Monster returnMonster;
		for (Monster i : lMonster) {
			System.out.println(n + ": " + i.toString());
			n++;
		}
		// Abfrage
		Scanner s = new Scanner(System.in);
		System.out.println("Mit welchem Monster möchtest Du spielen? (1-" + (n - 1) + ")");
		int choose = s.nextInt();
		if ((choose >= 1) && (choose < n)) {
			// gültige Eingabe
			System.out.println(
					"Du hast Dich für Monster (" + lMonster.get(choose - 1).getName() + ") entschieden. Viel Glück!");

		} else {
			// zu doof zum auswählen, das erste Monster wird genommen
			System.out.println(
					"Zu doof zum Eingeben. Du spielst mit Monster (" + lMonster.get(0).getName() + ") Viel Glück!");
			choose = 1;

		}
		returnMonster = lMonster.get(choose - 1);
		lMonster.remove(returnMonster);
		s.close();
		return returnMonster;

	};

	private static Monster oppositeMonster(List<Monster> lMonster) {

		Random rand = new Random();
		Monster returnMonster;
		int zufall = rand.nextInt(lMonster.size());

		returnMonster = lMonster.get(zufall);
		lMonster.remove(returnMonster);
		System.out.println("Dein Gegner ist Monster (" + returnMonster.getName() + ")");
		System.out.println("*******************************");
		System.out.println("");

		return returnMonster;

	}

}
