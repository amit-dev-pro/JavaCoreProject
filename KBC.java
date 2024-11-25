import java.util.*;

  class input
{
     String[]ar1={"1. WHO WAS THE FIRST PRIME MINISTER OF INDIA ?","2. WHO WAS THE FIRST PRESIDENT OF INDIA ?"};
     int[]ar={10000000,20000000};
    public   void heading()
    {
        System.out.println(",,,,,,,,,,,,,,,,WELCOME TO KBC,,,,,,,,,,,,,,,\n.................................................... ");
       langOption();

    }
       public   void option()
       {
           int num;
            System.out.println("If You Want Terminate This Game Any Time You Press 3 \nYou Can Press 1 For First Question or 2  For Second Question ");
           Scanner sc=new Scanner(System.in);
           num=sc.nextInt();
           if(num==1)
           {
               question1();
           }
           else if(num==2)
           {
               question2();
           }
           else if(num==3)
           {
               System.out.println("This Game Is Terminate You Can Go To Home ");
           }
           else{
               System.out.println("Have You Non-Sense or Not ");
               option();
           }
       }
       public  void question1()
       {
           System.out.println(STR."\nYOUR FIRST QUESTION IS \{ar[0]} /-\n\{ar1[0]}");
           System.out.println("a."+"Pandit JLN  "+" b.Narendra modi "+" c. Lalu prasad "+ " d.Nitish kumar");
           System.out.println("you can write here answer , it's mandatory");
           Scanner sc=new Scanner(System.in);
           String ans=sc.nextLine();
           if(ans.equalsIgnoreCase("pandit jln"))
           {
               System.out.println(STR."good answer thanks \n you win \{ar[0]} /-");
               //option();
               try
               {
                   System.out.println("PLEASE WAIT... AFTER 15sec. YOUR SECOND QUESTION IS DISPLAY ON YOUR SCREEN");
                   Thread.sleep(15000);
               }
               catch (InterruptedException e)
               {
                   throw new RuntimeException(STR."Error \{e}");
               }
               question2();

           }
           else{
               System.out.println("wrong answer try again later");

           }
       }
       public void question2()
      {
         System.out.println(STR."\nYOUR FIRST QUESTION IS \{ar[1]} /-\n\{ar1[1]}");
         System.out.println("a."+"pandit jln  "+"b. Narendra modi "+" c. Lalu prasad "+ " d.Rajendra prasad");
         System.out.println("you can write here answer it's mandatory");
         Scanner sc=new Scanner(System.in);
         String ans=sc.nextLine();
        if(ans.equalsIgnoreCase("rajendra prasad"))
        {
        System.out.println(STR."good answer thanks\nyou win \{ar[1]} /-");
        System.out.println("i hope that you will feel so adourable to play KBC  ,, THANKS");
        }
        else
        {
        System.out.println("wrong answer try again later");
        option();
        }
  }

  public void langOption()
  {
      System.out.println("FOR ENGLISH PRESS (a) OR FOR HINGLISH PRESS (b)");
      Scanner sc=new Scanner(System.in);
      String nam=sc.nextLine();
      if(nam.equalsIgnoreCase("a"))
      {
          engQuestion();
      }
      else
      {
          hingQuestion();
      }

  }
  public void hingQuestion()
  {
      System.out.println("FOR EXIT , YOU WROTE HERE EXIT\n"+"1.INDIA KE RAJDHANI KAHAN HAI !\na.GUJRAT b.JAMMU "+"c."+"DELHI d.PATNA");
      System.out.println("you can write here answer , it's mandatory");
      Scanner sc=new Scanner(System.in);
      String ans=sc.nextLine();
      if(ans.equalsIgnoreCase("delhi"))
      {
          System.out.println("good answer thanks \n you win "+ar[0]);
          System.out.println("i hope that you will feel so adourable to play KBC  ,, THANKS");
      }
      else if(ans.equalsIgnoreCase("exit"))
      {
          System.out.println("your program is terminate ");
      }
      else
      {
      System.out.println("wrong answer try again later");
          hingQuestion();
      }
  }
    public void engQuestion()
    {
        System.out.println("FOR EXIT , YOU WROTE HERE EXIT\n"+"1.WHERE IS CAPITAL OF BIHAR !\na.GUJRAT b.JAMMU "+"c."+"DELHI d.PATNA");
        System.out.println("you can write here answer , it's mandatory");
        Scanner sc=new Scanner(System.in);
        String ans=sc.nextLine();
        if(ans.equalsIgnoreCase("delhi"))
        {
            System.out.println("good answer thanks \n you win "+ar[0]);
            System.out.println("i hope that you will feel so adourable to play KBC  ,, THANKS");
        }
        else if(ans.equalsIgnoreCase("exit"))
        {
            System.out.println("your program is terminate ");
        }
        else
        {
            System.out.println("wrong answer try again later");
            hingQuestion();
        }
    }
}

public class KBC {
    public static void main(String[]args){
        input in=new input();
        in.heading();

        System.out.println("Hi..Ray G Thanks For Coding Journey ");
    }
}
