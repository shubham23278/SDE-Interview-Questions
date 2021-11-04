import java.util.*;

public class Question_3 {
    public static String InttoRoman(int n) {
        String[] romans = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] numerals = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        if (n > 3999 || n < 1) {
            throw new IllegalArgumentException();
        }

        StringBuilder new_roman = new StringBuilder();

        int i = 0;
        while(n > 0) {
            if(n - numerals[i] >= 0) {
                new_roman.append(romans[i]);
                n = n - numerals[i];
            }
            else {
                i++;
            }
        }
        return new_roman.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(InttoRoman(n));
    }
}
