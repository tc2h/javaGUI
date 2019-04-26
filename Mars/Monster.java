public class Monster extends Charecter{
    private int hp;
    private int damage;

    public Monster(String name, int hp, int damage){
        super(name);
        this.hp = hp;
        this.damage = damage;
    }

    public void print(){
        System.out.println("Monster ");
        super.print();
    }

    public int getHp(){
		return hp;
    }
    
    public int getDamage(){
		return damage;
	}

}