/* Cho xâu s và ký tự c được nhập từ bàn phím. Bạn hãy viết chương trình in ra số lần xuất hiện của ký tự c trong xâu s.
Ví dụ nếu bạn nhập s = "Codelearn", c = 'e' như bên dưới:
Codelearn
e
Thì màn hình sẽ hiển thị ra:
2
Giải thích: ký tự thứ 'e' xuất hiện 2 lần trong xâu "Codelearn"
Lý thuyết
Để lấy ra độ dài của một String bạn dùng phương thức length(). Ví dụ:
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		System.out.print(s.length());
	}
}
Kết quả khi chạy chương trình:
9
Kết hợp với phương thức chatAt() ở bài trước, bạn có thể dùng vòng lặp để duyệt qua các ký tự trong String giống như sau:
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}
Kết quả khi chạy chương trình:
C
o
d
e
l
e
a
r
n
Ngoài ra bạn cũng có thể dùng phương thức toCharArray() để chuyển String về mảng các ký tự và duyệt giống như sau:
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		for(char c:s.toCharArray()) {
			System.out.println(c);
		}
	}
}
Đọc tới đây bạn đã biết cách duyệt qua các ký tự của một String, hãy quay lại phần bài tập và làm thử. */

import java.util.Scanner;

// public class bai22 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String c = sc.nextLine();
//         int kq = 0;
//         for ( int i = 0 ; i < s.length() ; i ++) {
//             if ( c.charAt(0) == s.charAt(i)) {
//                 kq++;
//             }
//         }
//         System.out.println(kq);
//     }
    
// } 
// cách viết thứ 2 không cần vòng lặp , ta sẽ chuyển xâu thành mảng (arr)
public class bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        int kq = 0;
    for ( char x : s.toCharArray()) {
        if ( x == c) {
            kq++;
        }

    }
    System.out.println(kq);
}
}