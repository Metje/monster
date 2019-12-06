
public class SnowMonster extends Monster {

	public SnowMonster(String name, int damage, int life) {
		super(name, damage, life);
		this.type = "snow";
	}

	public int getDamage(String type, int damage) {
		if (type.equals("water"))
			damage = 0;
		if (type.equals("fire"))
			damage += 10;
		return damage;
	}

}
