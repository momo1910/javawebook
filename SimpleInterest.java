import java.util.*;
 
public class SimpleInterest{
 
    public static void main(String []args)
    {
        double p=0,r=0,t=0,si=0;
         
        //Scanner class to take user input.
        Scanner X = new Scanner(System.in);
         
        System.out.print("Enter Principle : ");
        p = 1000;
         
        System.out.print("Enter Rate of Interest: ");
        r =  4;
         
        System.out.print("Enter Time in years : ");
        t =  3;
         
        //Formula of simple interest.
        si = (p*r*t)/100;
         
        System.out.print("Simple Interest is :"+si+"\n");
                 
    }
}
