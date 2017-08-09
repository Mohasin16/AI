
package ai;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;


class AI {

    static String address_me = "Sir";
    static String greet_me   = "Good Morning";
    String time_format;
    int time;
    
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
        } else if (op=='/') {
            ans = v1 / v2;
        } else if (op == '*') {
            ans = v1 * v2;
        }
        System.out.println("The answer is " + ans);
    }*/

    void settings() {

        address_me = " Ma'm ";
    }
    
    /*
     * This method is used to greet the user
     * eg are gud morning,good evening etc.
     */
    void greeting(){                     
        if (time>=1&&time<12)
            greet_me = "Good Morning";     
        else if (time>=12&&time<=15)        
            greet_me = "Good Afternoon"; 
        else 
            greet_me = "Good Evening";
        System.out.println(greet_me+" "+address_me+" ");
        System.out.println("What can i help u with?");
    }
    
    void get_time() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd/mm/yyyy hh:mm:ss"); 
         time_format = sdf.format(date); 
          time = date.getHours();         
    }
    
    public void disp_time(){
        System.out.print(address_me+"here's the time & date: \n "+time_format);        
    }
            
}