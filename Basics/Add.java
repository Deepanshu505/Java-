import java.util.Scanner;
class Add
{
    public static void main (String args[])
    {
        Scanner Sc = new Scanner (System.in) ;
        System.out.println("Enter two numbers to add:");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }   
}