/* bài 27 ví dụ 
viest chương trình tạo 1 mảng 1 chiều gồm các pt là số nguyên có n phần từ ,
 n do người dùng nhập từ bàn phím */

import java.util.Arrays;
import java.util.Scanner;

public class bai51{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap n");
        int n = sc.nextInt();
        // taoj mang co n phan tu 
        int[] mang = new int[n];
        // nhap du lieu cho tung phan tu
        for ( int i = 0 ; i < n ; i++ ){
            mang[i] = sc.nextInt();
        }
        Arrays.sort(mang);
        System.out.println(Arrays.toString(mang));
        

    }
 }