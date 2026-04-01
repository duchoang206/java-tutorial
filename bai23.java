/* 
Cho xâu s và ký tự c được nhập từ bàn phím, 
bạn hãy viết chương trình in ra vị trí đầu tiên mà ký tự c xuất hiện trong xâu s, nếu ký tự c không xuất hiện trong s thì in ra -1.
Ví dụ nếu bạn nhập s = "codelearn" và c = 'o' như bên dưới:
codelearn o
thì màn hình sẽ hiển thị ra:
1
Giải thích: ký tự s[1] chính là ký tự 'o'
Ví dụ khác nếu bạn nhập:
codewar z
Thì màn hình sẽ hiển thị ra:
-1
Giải thích: ký tự 'z' không xuất hiện trong xâu "codewar". */

import java.util.Scanner;

public class bai23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char c = sc.next().charAt(0);
    for ( char x : s.toCharArray()) {
        if ( c == x ) {
            System.out.println(s.charAt(x));
        } else {
            System.out.println(-1);
        }
    }
    }    
}
