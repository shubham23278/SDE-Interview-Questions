import java.util.*;

public class Main {
    public static void main(String[] args){

        int arr[] = {3 , 4 , 8 , 1 , 6 , 9};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        for (int i = 0; i<arr.length ; i++){
            for(int j = i; j < arr.length ; j++){
                if(arr[i] * arr[j] == x){
                    count++;
                }
            }
        }
        System.out.println("There are " + count + " pair with product equal to " + x);
    }
}
