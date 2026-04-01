/* Bài tập
Cho xâu s được nhập và từ bàn phím, bạn hãy viết chương trình đảo ngược xâu s và hiển thị ra màn hình.

Ví dụ

Nếu bạn nhập s = "Codelearn" thì màn hình sẽ hiển thị ra "nraeledoC"
Nếu bạn nhập s = "ABC" thì màn hình sẽ hiển thị ra "CBA" */

import java.util.Scanner;

public class bai27 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String kq = "";
    for ( int i = s.length() -1  ; i >=0 ; i--){
        kq = kq + s.charAt(i);
    }
    System.out.println(kq);
        
} 
}
