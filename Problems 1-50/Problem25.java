import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any Number : ");
        int number = sc.nextInt();
        int count = 0;

        while(number > 0) {
            number = number / 10;
            count ++;
        }
        System.out.println("Number of Digits are : "+count);
    }
}
