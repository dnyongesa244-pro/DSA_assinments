import java.util.*;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dkoko
 */
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        float a, b, c, d, x1, x2;
        System.out.println("Enetre the value of a:");
        a = scan.nextFloat();
        System.out.println("Eneter the value of b:");
        b= scan.nextFloat();
        System.out.println("Eneter the value of c:");
        c = scan.nextFloat();
        
        d = (b*b)-(4*a*c);
        
        System.out.println("The value of d is "+d);
        
        if(d<0)
        {
            char i;
            d = -d;
            System.out.println("the value of d is "+d);
            float sqrtofd =(float) Math.sqrt(d);
            x1 = ((-b)/(2*a));
            x2 = x1;
            System.out.println(sqrtofd);
            float imaginary = (char) sqrtofd/(2*a);
            System.out.println("The roots of x are :");
            System.out.println("x1 = "+x1 +" + " + imaginary+" i");
            System.out.println("x2 = "+x2 +" - " + imaginary+" i");
        }
        else if(d == 0)
        {
            System.out.println("Executing the zero one"); //used for febuging the code
            x1 = (-b)/(2*a);
            System.out.println("x = "+x1);
        }
        else
        {
            float sqrtofd =(float) Math.sqrt(d);
            x1 = ((-b+sqrtofd)/(2*a));
            x2 = ((-b-sqrtofd)/(2*a));
            System.out.println("The roots of x are :");
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
}