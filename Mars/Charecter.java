
public class Charecter{
    private String name;
    private int hp;
    private int level;
    private int damage;

    public Charecter(String name){
        name = name;
        hp = 0;
        level = 0;
        damage = 0;
    }
	public String getName(){
		return name;
	}

	public boolean isDead(){
		if(hp == 0)
			return true;
		return false;
	}

	public int getHp(){
		return hp;
	}

	public int getLevel(){
		return level;
	}

	public int getDamage(){
		return damage;
	}



	public void print(){
		System.out.println("Name..................." + name);
		System.out.println("Hp....................." + hp);
		System.out.println("Level.................." + level);
	}
}
