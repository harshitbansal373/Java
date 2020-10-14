import java.util.Scanner;
  public class pelindrom
  {
      public static void main(String []args)
      {

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int a = kb.nextInt();
        int temp = a;
        int b = 1,c = 0;
          while(a>0)
          {
            b = a%10;
            c = (c*10)+b;
            a = a/10;
          }
          if (temp==c)
          System.out.println("Your number is palindrom");
          else
          System.out.println("Your number is not palindrom   :(");

      }
  }
