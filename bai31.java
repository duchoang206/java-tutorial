/* Bạn hãy viết phương thức trả về số lớn nhất trong 3 số được nhập và từ bàn phím.

Ví dụ

Nếu bạn nhập a = 6, b = 2, c = 8 thì màn hình sẽ hiển thị ra 8.
Nếu bạn nhập a = 4, b = 4, c = 4 thì màn hình sẽ hiển thị ra 4. */

import java.util.Scanner;

public class bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ( a >= b && a >= c) {
            System.out.println(a);
        } else if ( b >= a && b>=c ) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        

    }
    
}
