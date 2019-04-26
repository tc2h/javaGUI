import java.util.*;

public class Game{

    private Scanner sc;
    private Boolen running;
    private Novice player;

    public Game(){
        sc = new Scanner(System.in);
        running = false;
    }

    public void run(){
        running = true;
        createPlayer();

    }

    private void createPlayer(){
        System.out.println("Enter name :");
        String name = sc.next();
        player = new Novice(name);        
    }

    private void printFristMessage(){
        System.out.println("");
    }

}