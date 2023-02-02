
import java.util.Scanner;
public class BancoTerminal { 
    Scanner info = new Scanner(System.in);
    public int numberAccount;
    public String agency;
    public String client;
    public float money;

    public void Sign_up(){
        System.out.println("Hello! to register you, we need some information's:");
        System.out.println("firstly, we need your NAME:");
        client = info.next();
        System.out.println("Well done, " + client + ", tell us your AGENCY");
        agency = info.next();
        System.out.println("Great, now enter your NUMBER-ACCOUNT");
        numberAccount = info.nextInt();
        System.out.println("How much MONEY have in your account");
        money = info.nextFloat();
        System.out.println("Congratulations, now see your information's\n\n");
        System.out.println("ªº°ªº°ªº° INFO ªº°ªº°ªº°");
        System.out.println("NAME: " + client);
        System.out.println("NUMBER ACCOUNT: " + numberAccount);
        System.out.println("AGENCY: " + agency);
        System.out.println("MONEY: " + money + "R$");
    }
}
