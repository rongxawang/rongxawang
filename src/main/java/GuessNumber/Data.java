package GuessNumber;

public class Data {

    public static boolean containRepeatNum(String str)
    {
        if(str==null||str.isEmpty())
        {
            return false;
        }
        char[] elements=str.toCharArray();
        for(char e:elements){
            if(str.indexOf(e)!=str.lastIndexOf(e)){
                return true;
            }
        }
        return false;
    }

    public static String getNoSpaceString(String s)
    {
        return s.replace(" ","");
    }

    public static String getStringwithSpace(String str)
    {
        return str.replace(""," ").trim();
    }

}
