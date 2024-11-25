import java.util.Scanner;

//class demo
//{
//     int add(int[]a)
//    {
//         int num=0;
//        for(int val:a)
//        {
//            num=num+val;
//        }
//        return num;
//    }
//}


class guess
{
    int guessNum;

    int guessNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" please wait guesser guess the number ");
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class guessNumPl
{
    int pGuessNum;

    int inputFromPla()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("please wait ! player guess the number ");
        pGuessNum=sc.nextInt();
        return pGuessNum;
    }
}

class umpare
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumFromGuesser()
    {
        guess g=new guess();
        numFromGuesser=g.guessNumber();
    }

    public void collectNumFromPlayer()
    {
        guessNumPl p1=new guessNumPl();
        guessNumPl p2=new guessNumPl();
        guessNumPl p3=new guessNumPl();


        numFromPlayer1=p1.inputFromPla();
        numFromPlayer2=p2.inputFromPla();
        numFromPlayer3=p3.inputFromPla();
    }

    void compare() {

        if (numFromGuesser == numFromPlayer1)
        {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
            {
                System.out.println("game is tired three player guess correctly so won the all players ");
            }
            else if (numFromGuesser == numFromPlayer2) {
                System.out.println("so player 1 and player 2 won the match ");
            }
            else if (numFromGuesser == numFromPlayer3) {
                System.out.println("so player 1 and player 3 won the match ");
            }
            else {
                System.out.println("player 1 won the match ");
            }
        }

        else if (numFromGuesser == numFromPlayer2)
        {
            if (numFromGuesser == numFromPlayer3)
            {
                System.out.println("player 2 and player 3 won the match ");
            }
            else {
                System.out.println("player 2 won the match ");
            }
        }

        else if (numFromGuesser == numFromPlayer3)
        {
            System.out.println("player 3 won the match ");
        }
        else {
            System.out.println("i'm so sorry ! to all game lost , please try again later !!");
        }

    }


}
//
//




public class guessNumberProject {
    public static void main(String[] args) {



      //  System.out.println(arr);

//        int []arr={5,1,2,8};
//        for(int i=0; i<arr.length; i++)
//        {
//            System.out.println(arr[i]);
//           // System.out.println(i);
//        }
        //System.out.println(arr[arr.length-1]);
//        for(int n:arr)
//        {
//            System.out.println(n);
//        }

//         demo obj=new demo();
         //int[]a={23,4,0,};
//         int result=obj.add(new int []{4,4,8,1});
//         System.out.println(result);


//        int []arr={5,2,6,9,8};
//        System.out.println(arr.length);
//
//        int[][]arr1={
//                     {4,1,5,8 },
//                {6,2,69,8},
//                { 21,85,26}
//
//                    };
//        System.out.println(arr1.length);
//        System.out.println(arr1[0].length);

//        String name="Amit lal";
//        System.out.println(name.length());
//
//        String[]names={"Rahul","amit","anita","sunita"};
//        System.out.println(names[0].length());
//
//        String[][]maa={
//
//                {"samindra","kamindra","rajesh","pramod"},
//                {"raja","vikram","shantanu","manu"},
//                {"sunidhi","megha","sapna","kajal","rani"},
//                {"khesari","vidyanand","rajiv","kaushal"}
//
//                      };
//
//         System.out.println(maa.length);
//
//         String soem="amit Lal Yadav chhapanna";
//         System.out.println(soem.length());



        umpare u=new umpare();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }
}
