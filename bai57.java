/* viet ct nhap vao 1 list va tao ra 1 list mới bằng 
bình phương pt list cũ   */


import java.util.ArrayList;
import java.util.Scanner;

public class bai57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for ( int i = 0; i < n ; i++) {
            int sonhap = sc.nextInt();
            list.add(sonhap*sonhap);
        }
        System.out.println(list);
    }
    
}
