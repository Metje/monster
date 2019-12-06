
public class WaterMonster extends Monster {

	public WaterMonster(String name, int damage, int life) {
		super(name, damage, life);
		this.type = "water";
	}

	public int getDamage(String type, int damage) {
		if (type.equals("fire"))
			damage *= 2;
		if (type.equals("grass"))
			damage /= 2;
		return damage;
	}

}
