import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your First Name: ") ;
        String name1 = input.nextLine();
        System.out.println("Enter Your Second Name: ") ;
        String name2 = input.nextLine();
        System.out.println("Welcome " + name1 );
        System.out.println("Enter Your Principle Amount: ") ;
        float prin = input.nextFloat();
        System.out.println("Enter Your Interest Rate: ") ;
        float rate = input.nextFloat();
        System.out.println("Enter the Time(in Years) for Simple Interest: ") ;
        float time = input.nextFloat();
        float inter = prin*rate*time/100 ;
        float simp = prin + inter ;
        System.out.println("Your Interest for " + time + " years is: " + simp) ;

        if (simp % 2 ==0)
            System.out.println("YOUR INTEREST NO: "+ simp +" IS EVEN") ;

        else
            System.out.println("YOUR INTEREST NO: "+ simp +" IS ODD") ;
        float curr = simp/80 ;
        System.out.println("Your Interest in Dollars: " + curr) ;

    }
}
