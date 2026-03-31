/*Cho một mảng các số nguyên n phần tử arr.
 Bạn hãy viết chương trình tính tổng các số lẻ lớn hơn 0 trong mảng.

Ví dụ nếu bạn nhập:

8
3 -7 2 5 9 -6 10 12
Thì màn hình hiển thị lên:

17
Giải thích: 3 + 5 + 9 = 17.
 */

import java.util.Scanner;

public class bai16 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int tong =0;
        for ( int i =0 ; i <n ; i++ ) {
            if ( arr[i] > 0 && arr[i] % 2 != 0) {
                tong = tong + arr[i];
            }
        }
        System.out.println(tong);
    }
    
}
