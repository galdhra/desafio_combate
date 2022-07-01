package entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;
	public int rounds;
	
	
	public Champion() {
		
	}
	

	public Champion(String name, int life, int attack, int armor) {
		super();
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;	
	}
	
	public Champion(int life, int attack, int armor) {
		
	}
	
	

	public String getName() {
		return name;
	}



	public int getLife() {
		return life;
	}



	public int getAttack() {
		return attack;
	}	
	

	public void setAttack(int attack) {
		this.attack = attack;
	}


	public void setLife(int life) {
		this.life = life;
	}


	public int getArmor() {
		return armor;
	}




	public void takeDemage(int attack, int armor) {
		this.life -= attack - armor;
	}
					
	
	public String toString() {
		return  getName()
			+ " : "
			+ getLife()
			+ " de vida";
		
	}



	
}