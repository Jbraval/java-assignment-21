import java.util.*;
import java.util.Scanner;
public class Test1{
        static int level = -1;
        public static void main(String[] args){
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter the dimensions of the matrix: ");
                int m = scn.nextInt();
                int n = scn.nextInt();
                int sum = 0;
                int i = 0;
                int j = 0;
               System.out.println(NumberOfPaths(m , n , i , j));
        }
        public static int NumberOfPaths(int m , int n , int i , int j){
                if(i >= m || j >= n)
                        return 0;
                if(i == m - 1 && j == n - 1)
                        return 1;
 
                return NumberOfPaths(m , n , i + 1 , j) + NumberOfPaths(m , n , i , j + 1);
        }
}
