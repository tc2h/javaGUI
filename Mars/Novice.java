public class Novice extends Charecter{

    private int exp;
    private int rank;
    private int killmonster;
    private int hp;
    private int level;
    private int damage;

    public Novice(String name){
        super(name);
        exp = 0;
        rank = 0;
        killmonster = 0;
        hp = 100;
        level = 0;
        damage = 10;
    }
    
	public int getExp(){
		return exp;
	}
	
	public int getKillMonster(){
		return killmonster;
	}

	public int getRank(){
		return rank;
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
	// private void levelUp(){
	// 	for(int i = levelUpExperiences.length;
	// 			i>0;
	// 			--i)
	// 		if(experience > levelUpExperiences[i])
	// 			level = i;
	// }

	// public void gianExperience(int experience){
	// 	this.experience += experience;
	// 	levelUp();
	// }

	// public void keepItem(Item item){
	// 	bag.addItem(item);
	// }

	// public void print(){
	// 	super.print();
	// 	System.out.println("KillMonster.................." + killmonster);
	// 	System.out.println("Exp.........................." + exp);
		
	// }
   
}