/* Cho một mảng 2 chiều các số nguyên n hàng m cột arr được nhập từ bàn phím.
 Bạn hãy viết chương trình tính tổng các phần tử chia hết cho 5 trong arr.

Ví dụ nếu bạn nhập n = 3, m = 4, arr = [[10, 4, 8, 2], [5, 6, 4, 9], [20, 3, 8, 1]] như bên dưới:

3 4
10 4 8 2
5 6 4 9
20 3 8 1
Thì màn hình sẽ hiển thị ra:

35
Giải thích: Tổng các phần tử chia hết cho 5 trong arr là 10 + 5 + 20 = 35. */

import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for ( int i = 0 ; i < n ; i ++) {
            for ( int j = 0 ; j < m ; j ++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int tong =0;
        for ( int i = 0 ; i < n ; i ++) {
            for ( int j = 0 ; j < m ; j ++) {
                if ( arr[i][j] %5 ==0 ) {
                    tong = tong + arr[i][j];
                }
            }    
        }
        System.out.println(tong);

    }    
}
