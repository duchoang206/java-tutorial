/* Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím. 
Bạn hãy viết chương trình hiển thị ra tổng của phần tử đầu tiên và cuối cùng trong mảng arr. Ví dụ nếu bạn nhập n = 5, arr = [2, 7, 6, 8, 9] như bên dưới:

5
2 7 6 8 9
Thì màn hình sẽ hiển thị:

11
Nếu bạn chưa làm được bài này thì có thể xem hướng dẫn ở bên dưới.

 */

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for ( int i = 0; i < n ; i ++) {
        arr[i] = sc.nextInt();
    } 
    System.out.println(arr[0] + arr[n-1]);
    }    
}
