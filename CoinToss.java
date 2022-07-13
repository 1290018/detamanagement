import java.util.Random;
import java.util.Scanner;

public class CoinToss {
    public static void main(String args[]){
        System.out.println("Who are you?");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        int a=0,b=0;
        String[] hands = { "Head", "Tail" };
        Random random = new Random();
        System.out.println("Tossing a coin...");
        for(int i = 0; i < 3; i++){
            String hand = hands[random.nextInt(2)];
            if(hand.equals("Head")){
                a++;
            } else {
                b++;
            }
            System.out.println("Round " + (i+1) + ": " + hand); 
        }
        System.out.println("Head: " + a + ", Tail: " + b);
        if(a>b) { 
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost!");
        }
    }
}
