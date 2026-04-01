/* Bạn hãy viết phương thức hiển thị ra màn hình các số chia hết cho 3 
mà không chia hết cho 5 trong mảng các số nguyên arr được nhập vào từ bàn phím.

Ví dụ:
Nếu bạn nhập n = 4, arr = [3, 7, 15, 18] thì màn hình sẽ hiển thị ra:
3 18 ​
Ví dụ nếu bạn nhập n = 5, arr = [30, 20, 21, 15, 30] thì màn hình sẽ hiển thị ra:
21 ​ */

import java.util.Scanner;

public class bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for ( int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }
        method(arr);
    }
    public static void method(int[] arr ) {
        for ( int i = 0 ; i < arr.length ; i++) {
            if ( arr[i] %3 == 0 && arr[i] % 5 != 0) {
                System.out.print(arr[i]+ " ");
            }
            
        } 

    }

    
}
