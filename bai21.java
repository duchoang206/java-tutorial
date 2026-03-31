/*
Cho xâu s và số nguyên k được nhập từ bàn phím. Bạn hãy viết chương trình in ra màn hình ký tự thứ k trong xâu s.

Ví dụ nếu bạn nhập s = "Codelearn", k = 2 như bên dưới:

Codelearn
2
Thì màn hình sẽ hiển thị ra:

o
Giải thích: ký tự thứ 2 trong xâu Codelearn là ký tự o

Lý thuyết
String bản chất cũng giống như một mảng các ký tự, để lấy ra ký tự thứ k bên trong String bạn có thể dùng phương thức charAt(k - 1);
 (String cũng giống như mảng, ký tự thứ k có chỉ số là k - 1):

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		System.out.print(s.charAt(1));
	}
}
Sẽ hiển thị ra màn hình:

o */

import java.util.Scanner;

public class bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(s.charAt(k-1));
    }
    
}
