
public class GrassMonster extends Monster {

	public GrassMonster(String name, int damage, int life) {
		super(name, damage, life);
		this.type = "grass";
	}

	public int getDamage(String type, int damage) {
		if (type.equals("water"))
			damage *= 2;
		if (type.equals("fire"))
			damage /= 2;
		return damage;
	}

}