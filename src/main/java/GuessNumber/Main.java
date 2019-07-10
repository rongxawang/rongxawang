package GuessNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Guess Number game,You have 6 chances to guess!");

        int count = 6;
        int i;

        String guessNum;
        String numberIn;
        String guessNumWithSpace;
        String numberInWithNoSapce;

        Scanner sc=new Scanner(System.in);

        GuessResult gresult = new GuessResult();
        GuessNumber gnumber= new GuessNumber();

        guessNum=gnumber.getNumber();
        guessNumWithSpace=Data.getStringwithSpace(guessNum);

        for(i=0;i<count;i++)
        {
            numberIn=sc.nextLine();
            if(numberIn.length()!=guessNumWithSpace.length()){
                System.out.println("Wrong Input,Input again");
                continue;
            }

            numberInWithNoSapce = Data.getNoSpaceString(numberIn);
            if(Data.containRepeatNum(numberInWithNoSapce))
            {
                System.out.println("Wrong Input,Input again");
                continue;
            }

            gresult.getResult(numberIn,guessNum);
            if(gresult.getA()==gnumber.getSize()){
                System.out.println("Congratulations！You are right！");
            }
            else{
                int j=count-i-1;
                if(j>1) {
                    System.out.println("You have " + j + " chances!");
                }
                else {
                    System.out.println("You only have one chance!");
                }
            }

        }
        if(i>=count){
            System.out.println("Sorry，you are failed. The string is "+guessNumWithSpace);
        }

    }


}
