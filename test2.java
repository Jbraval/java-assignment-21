import java.util.*;
import java.util.Scanner;
public class test2{
        static int level = -1;
        public static void main(String[] args){
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the length of array: ");
                int n = scn.nextInt();
                int[] arr = new int[n];
                System.out.println("Enter the elements of array: ");
                for(int i = 0; i < n; i++){
                        arr[i] = scn.nextInt();
                }
                printTriangle(arr);
        }
        public static void printTriangle(int[] arr) {
                if (arr.length < 1)
                        return;
                // Creating new array which contains the sum of consecutive elements in the array passes as parameter.
                int[] temp = new int[arr.length - 1];
                for (int i = 0; i < arr.length - 1; i++) {
                        int x = arr[i] + arr[i + 1];
                        temp[i] = x;
                }
                // Make a recursive call and pass the newly created array
                printTriangle(temp);
                // Print current array in the end so that smaller arrays are printed first
                System.out.println(Arrays.toString(arr));
        }
}
