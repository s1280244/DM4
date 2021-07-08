import java.util.Random;

public class ex4 {
        public static void main(String args[]){
            Random rnd = new Random();

            int a = rnd.nextInt(7) + 1;
            int b = rnd.nextInt(7) + 1;
            int total = a + b;

            System.out.println("Rolling the dice...");
            System.out.println("Dice A:" + a);
            System.out.println("Dice B:" + b);
            System.out.println("Total value:" + total);
                
            //７以上で"Won",７以下で"lost"
            System.out.println(" ");
            if(total>7){
                System.out.println("You won");
            }
            else{
                System.out.println("You lost");
            }
        }
}
