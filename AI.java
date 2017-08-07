
import java.io.IOException;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

class AI {

    static String address_me = "Sir";

    public static void main(String args[]) throws Exception {
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Good Day " + address_me + " how can i help u with?");
        AI o1 = new AI();
        System.out.println("1.Flip a coin");
        System.out.println("2.Roll a die");
        System.out.println("3.Do math");
        int ch = Integer.parseInt(br1.readLine());
        if (ch == 1) {
            o1.flip();
        } else if (ch == 2) {
            o1.roll();}
            /*
         else if (ch == 3) {
            o1.calc(); */
         else {
            System.out.print("invalid input");
        }
    }

    void flip() {
        Random toss = new Random();
        int flip = toss.nextInt(2);
        if (flip==0) System.out.println("heads");
        else System.out.println("tails");               
    }

    void roll() {
       Random rand = new Random();
       int die;
       for (int i=1;i<=10;i++) {
           die = 1+rand.nextInt(6);
           System.out.println (die);                   
       }            
    } 
       
           

    void calendar() {
        GregorianCalendar gcal = new GregorianCalendar();
        System.out.println();
    }
/*
    void calc() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        System.out.println("LOADING THE CALULATOR MODULE....");
        System.out.println(address_me + ", Please enter the value 1");
        int v1 = Integer.parseInt(br.readLine());
        System.out.println(address_me + ", Please enter the operator");
        char op = (char) br.read();
        System.out.println(address_me + ", Please enter the value 2");
        int v2 = Integer.parseInt(br.readLine());
        if (op == '+') {
            ans = v1 + v2;
        } else if (op == '-') {
            ans = v1 - v2;
        } else if (op == '/') {
            ans = v1 / v2;
        } else if (op == '*') {
            ans = v1 * v2;
        }
        System.out.println("The answer is " + ans);
    }*/

    void settings() {

        address_me = "Ma'm";
    }
}