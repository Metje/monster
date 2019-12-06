
public class FireMonster extends Monster {

	public FireMonster(String name, int damage, int life) {
		super(name, damage, life);
		this.type="fire";

	}

	public int getDamage(String type, int damage) {

		if (type.equals("grass"))
			damage *= 2;
		if (type.equals("water"))
			damage /= 2;

		return damage;
	}

}
