package recursion;

import java.util.ArrayList;

public class AllPossibleSubString {
    public static void main(String[] args) {
        String input="abb";
        ArrayList<String> finalAns=new ArrayList<>();
        System.out.println(subString(input,"",finalAns,0));
    }

    public static ArrayList<String> subString(String input, String currentString, ArrayList<String> finalAns,int pointer){
        //base case

        if(pointer>=input.length())
        {
            if(currentString.length()>=1)
            finalAns.add(new String(currentString));
            return  finalAns;
        }

        //1st case include
        currentString+=String.valueOf(input.charAt(pointer));
        subString(input,currentString,finalAns,pointer+1);
        currentString=currentString.substring(0,currentString.length()-1);

        //2nd case exclude

        subString(input,currentString,finalAns,pointer+1);

        return finalAns;
    }
}
