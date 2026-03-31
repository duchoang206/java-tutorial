/* Cho một mảng các số nguyên n phần tử arr được nhập từ bàn phím. Bạn hãy viết chương trình hiển thị ra phần tử lớn nhất trong mảng.
 Ví dụ nếu bạn nhập n = 5, arr = [2, 7, 6, 8, 9] như bên dưới:

5
2 7 6 8 9
Thì màn hình sẽ hiển thị:

9
Giải thích: mảng này có 5 phần tử và 9 là phần tử lớn nhất trong mảng.

Nếu bạn chưa làm được bài này thì có thể xem hướng dẫn ở bên dưới. */

import java.util.Scanner;
public class bai12 {

public static void main ( String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // khai báo mảng 
        int[] arr = new int[n];
        for ( int i=0 ; i < n ; i++) {
            arr[i] = sc.nextInt(); // nhập từ bàn phím các phần tử của mảng 
        }
        int maxValue = arr[0];
        for ( int i = 0 ; i < n ; i++) {
            if ( maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println(maxValue);
    }
    }

