/* 
Cho hai xâu ký tự s1 và s2 được nhập vào từ bàn phím,
 bạn hãy viết chương trình hiển thị ra vị trí đầu tiên mà s2 xuất hiện trong s1 (không phân biệt hoa thường).

Ví dụ

Nếu bạn nhập s1 = "Codelearn", s2 = "LEARN" thì màn hình sẽ hiển thị ra 4.
Giải thích: xâu "LEARN" xuất hiện tại vị trí thứ 4 trong xâu "Codelearn" (không phân biệt hoa thường nên "LEARN" hay "learn" đều được coi là như nhau).
Nếu bạn nhập s1 = "blackcat", s2 = "lack" thì màn hình sẽ hiển thị ra 1.
Lý thuyết
Lớp String (bạn cũng có thể hiểu là kiểu dữ liệu String) đã cung cấp sẵn khá nhiều phương thức cho việc xử lý xâu, sau đây là một số phương thức hay được sử dụng:
Phương thức indexOf
Phương thức này trả về vị trí xuất hiện đầu tiên của một String trong String khác, nếu không tìm thấy thì trả về -1. Ví dụ:
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		String s = "Codelearn";
		System.out.println(s.indexOf("learn"));
		System.out.println(s.indexOf("black"));
	}
} */

import java.util.Scanner;

public class bai24 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    s1 = s1.toUpperCase();
    s2 = s2.toLowerCase();
    System.out.println(s1.indexOf(s2));
} 
}
