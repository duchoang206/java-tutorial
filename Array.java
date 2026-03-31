/* Bạn hãy viết chương trình nhập vào từ bàn phím 10 số nguyên và hiển thị ra 10 số vừa nhập.

Ví dụ nếu nhập:

2 7 6 3 4 8 9 7 6 10
Thì màn hình sẽ hiển thị:

2 7 6 3 4 8 9 7 6 10 */ 
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
        for ( int i =0; i <10 ; i++) {
            a[i] = sc.nextInt();

        }
         for ( int i =0; i <10 ; i++)
        System.out.print(a[i] + " ");
	}
}
