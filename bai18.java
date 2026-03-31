/* Cho một mảng các số nguyên n phần tử arr.
 Bạn hãy viết chương trình sắp xếp các phần tử của mảng theo thứ tự tăng dần và hiển thị ra màn hình mảng sau khi đã sắp xếp.

Ví dụ nếu bạn nhập n = 6, arr = [5,3,2,6,7,7] như bên dưới:

6
5 3 2 6 7 7
Thì màn hình hiển thị lên:

2 3 5 6 7 7 */

import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0 ; i < n ; i ++ ) {
            arr[i] = sc.nextInt();
        }
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = i+1 ; j < n ; j ++) {
                if ( arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j] ;
                    arr[j] = temp;  
                }
            }
        }
        for ( int i = 0 ; i < n ; i ++) {
        System.out.print(arr[i]+ " "); }
    }
    
}
