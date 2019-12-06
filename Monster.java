
public abstract class Monster {

	private String name;
	private int damage;
	private int life;
	protected String type;

	// Constructor
	public Monster(String name, int damage, int life) {
		super();
		this.name = name;
		this.damage = damage;
		this.life = life;
		this.type = "Normal";
	}

	public Monster() {
		this.name = "";
		this.damage = 0;
		this.life = 0;
		this.type = "Normal";
	}

	// Getters+Setters
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	private void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public String getType() {
		return type;
	}

	private void setType(String type) {
		this.type = type;
	}

// Functions
	public void takeHit(Monster gegner) {
		int helpDamage;

		helpDamage = gegner.getDamage(gegner.getType(), gegner.getDamage());

		this.setLife(this.getLife() - helpDamage);
		if (this.getLife() > 0) {
			if (this.getLife() < 10)
				System.out.println(this.getName() + " has  " + this.getLife() + " points remaining");
			else
				System.out.println(this.getName() + " has " + this.getLife() + " points remaining");
		} else
			System.out.println(this.getName() + " ist KO!");

	}

	public String toString() {
		return this.getName() + " Damage: " + this.getDamage() + " Life: " + this.getLife();
	}

	abstract int getDamage(String type, int damage);

}
