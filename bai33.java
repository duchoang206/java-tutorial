/* Bài tập
Cho số nguyên dương n được nhập từ bàn phím, bạn hãy viết phương thức đệ quy trả về n! (n giai thừa).

Ví dụ nếu bạn nhập n = 5 thì chương trình sẽ hiển thị lên màn hình 120.

Lý thuyết
Phương thức đệ quy là phương thức mà gọi tới chính nó, ví dụ một phương thức đệ quy sẽ trông giống như sau:

public static void recurse() {
    ...
    recurse();
    ...
}
Do tính chất tự gọi lại chính nó nên để tránh việc chạy không bao giờ dừng bạn luôn cần có điểm dừng (điểm dừng được hiểu đơn giản là tới một lúc nào đó, phương thức đệ quy sẽ không gọi lại chính nó nữa).

Mô tả phương thức đệ quy tính 5!:

factorial(5)
= 5 * factorial(4)
= 5 * 4 * factorial(3)
= 5 * 4 * 3 * factorial(2)
= 5 * 4 * 3 * 2 * factorial(1)
= 5 * 4 * 3 * 2 * 1
= 120
Điểm dừng ở ví dụ trên chính là khi đầu vào của phương thức factorial bằng 1 thì phương thức factorial sẽ trả về 1 thay vì gọi tiếp tới chính nó.

Để hiểu rõ hơn bạn hãy xem ví dụ tiếp theo về phương thức đệ quy tính tổng các số từ 1 tới n:

import java.util.Scanner;

public class Method {
	public static int sum(int n) {
		if (n == 0) {
			return 0;
		}
		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		System.out.print(sum(10));
	}
}
Kết quả khi chạy chương trình:

55
Điểm dừng ở đây chính là khi n = 0 thì phương thức sum sẽ trả về 0 thay vì gọi tiếp tới chính nó. */

import java.util.Scanner;

public class bai33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int giaithua = 1;
        for ( int i =1 ; i <= n ; i ++){
            giaithua = giaithua *i;
        }
    }
}