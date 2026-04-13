/* giải bt  */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class bai53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("moi nhap so pt cua mang");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for ( int i = 0; i <n ; i ++) {
            mang[i] = rd.nextInt(0,4);
        }
        System.out.println(Arrays.toString(mang));
        // đảo ngược mảng và xuất mảng khi đảo ngược 
        for ( int i =0 , j = n -1 ; i <j ; i++ , j--) {
            int temp = mang[i];
            mang[i] =mang[j];
            mang[j] = temp;
        }
        
        System.out.println(Arrays.toString(mang));
        Arrays.sort(mang);
        System.out.println(Arrays.toString(mang));
        int tong = 0;
        for ( int i =0 ; i < n ; i++ ) {
            tong = tong +mang[i];
        }
        System.out.println(tong);
        System.out.println("Moi nhao vao so k ");
        int k = sc.nextInt();
        for ( int i = 0 ; i < n ; i++ ) {
            if ( k == mang[i] ) {
                System.out.println(i);
            }
        }
        }
        // Cho người dùng nhập 1 số bất kỳ kt xem  có tồn tại k , nếu có chỉ ra index 
        
    }
    

