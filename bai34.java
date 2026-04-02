/* Bài tập
Cho số nguyên n được nhập từ bàn phím, bạn hãy viết phương thức đệ quy trả về tổng các số lẻ từ 1 tới n.

Ví dụ nếu bạn nhập n = 5 thì chương trình sẽ hiển thị lên màn hình 9 (do 1 + 3 + 5 = 9). */

import java.util.Scanner;

public class bai34 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(sum(n));
	}
 
    public static int sum(int n ) {
        if ( n == 1) 
            return 1;
        else if ( n % 2 ==0 ) {
            return sum(n-1);
        } else {
            return sum(n-1) +n; 
        }
    }
    
}
