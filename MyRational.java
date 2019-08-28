import java.lang.*;
import java.util.Scanner;
class Rational
  {
    int p,q;
    public int getRational (int x, int y)
      {
        if (y!=0)
          {
            p=x;
            q=y;
            return 1;
          }
        else
          {
            System.out.print("Value of q can't be 0");
            return 0;
          }
          }
      public void showRational()
          {
            System.out.print("Answer: "+p/q+"\n");
          }
    }
class MyRational
  {
    static Scanner ip;

    public static void main(String args[])
      {
        Rational obj = new Rational();
        System.out.print("Enter your number x: ");
        ip = new Scanner(System.in);
        int x = ip.nextInt();
        System.out.print("Enter your number y: ");
        ip = new Scanner(System.in);
        int y = ip.nextInt();
        obj.getRational(x,y);
        obj.showRational();
      }

  }
