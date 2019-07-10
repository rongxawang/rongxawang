package GuessNumber;

public class GuessResult {
    private int A=0;
    private int B=0;

    GuessNumber guessNum= new GuessNumber();
    int size = guessNum.getSize();

    String numberInWithNoSpace;

    public void getResult(String numberIn,String guessNumber){
        A=0;
        B=0;
        numberInWithNoSpace = Data.getNoSpaceString(numberIn);

        for(int i= 0;i<size;i++){
            if(numberInWithNoSpace.charAt(i)==guessNumber.charAt(i)){
                A++;
            }
        }
        for(int j =0;j<size;j++){
            for(int k = 0;k<size;k++){
                if(numberInWithNoSpace.charAt(j)==guessNumber.charAt(k)){
                    B++;
                    break;
                }
            }
        }
        B= B - A;
        System.out.println(A + "A" + B + "B");
    }

    public int getA()
    {
        return A;
    }
}

