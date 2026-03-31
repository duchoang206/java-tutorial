/* 
Cho một mảng 2 chiều các số nguyên n hàng m cột arr được nhập từ bàn phím. 
Bạn hãy viết chương trình tính tổng các phần tử trong mảng arr.
Ví dụ nếu bạn nhập n = 2, m = 3, arr = [[5, 7, 3], [1, 2, 4]] như bên dưới:
2 3
5 7 3
1 2 4
Thì màn hình sẽ hiển thị ra:
22
Lý thuyết
Mảng 2 chiều hay còn được gọi là ma trận là một mảng các mảng 1 chiều. Mảng 2 chiều giống như một cái bảng,
 mảng 1 chiều là các dòng trong bảng và các phần tử của mảng là các ô.

Cú pháp để khai báo mảng 2 chiều với n hàng và m cột trong Java:

int[][] arr = new int[n][m];
 */

import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for ( int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
            arr[i][j] = sc.nextInt();
        }
    }   
        int tong = 0;
        for ( int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                tong = tong + arr[i][j];             
        }
    }
    System.out.println(tong);
    
}
}