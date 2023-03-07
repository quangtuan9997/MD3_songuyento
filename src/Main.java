import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        System.out.println("nhập số lượng số nguyên tố cần in ra");
        int n= sr.nextInt();
        int count=0;
        int i=2;
        while (count<n){
             if(isPrimeNumber(i)){
                 System.out.print(i + " ");
                 count++;
             }
            i++;
        }
        }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
