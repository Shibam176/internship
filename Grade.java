import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Enter number of Subjects you Have ");
        int n = in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.println ("Enter Subject Name");
            String sub=in.next();
            System.out.println ("Enter Your Marks of "+sub+" out of 100 ");
            int m=in.nextInt();
            sum=sum+m;       // sum denotes sum of all subjects

        }
        int a=sum/n;  // a denotes average of all subjects
        System.out.println ("Your Total Marks of all "+n+" subject is "+sum);
        System.out.println ("Percentage Obtained By you "+a+ "%");
        if (a>=90){
            System.out.println ( "Congratulation You Recieved Grade \"A\"" );
        }
        else if (a>=75 && a<90) {
            System.out.println ("Very Good You Recieved Grade \"B\"");
        }
        else if (a>=60 && a<75) {
            System.out.println ("Good You Recieved Grade \"C\"");
        }
        else if (a>=40 && a<60) {
            System.out.println (" You Recieved Grade \"D\"");
        }
        else{
            System.out.println ("Oh-no! You Failed");
        }
    }
}
