/* Cho xâu s được nhập vào từ bàn phím, 
bạn hãy viết chương trình hiển thị ra màn hình số các ký tự in hoa trong xâu s.

Ví dụ

Nếu bạn nhập s = "CodeLearn" thì màn hình sẽ hiển thị ra 2.
Giải thích: trong xâu s có 2 ký tự in hoa.
Nếu bạn nhập s = "ABC123" thì màn hình sẽ hiển thị ra 3 */

import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int kq = 0;
    for ( int i =0; i< s.length() ; i ++) {
        if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
            kq++;
        }
    }
    System.out.println(kq);
    
}
}
