//Done using string array for mapping 

import java.util.*;

public class Question_4 {
    public static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<String>();
        if(digits.length() == 0 || digits == null){
            return result;
        }

        String[] mapping = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        letterCombinationsrecursion(digits, result, "", mapping, 0);
        
        return result;
    }
    public static void letterCombinationsrecursion(String digits, List<String> result, String current, String[] mapping, int index){
            if(digits.length() == index){
                result.add(current);
                return;
            }

            String letters = mapping[digits.charAt(index) - '0'];
            for(int i = 0; i < letters.length(); i++){
                letterCombinationsrecursion(digits, result, current + letters.charAt(i), mapping, index + 1);
            }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int d = sc.nextInt();

        String digits = String.valueOf(d);

        System.out.println(letterCombinations(digits));
    }
}
