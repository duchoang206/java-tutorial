/* viet chuong trinh nhap tu ban phim tao ra 1 list co n pt 
n phan tu ban phim , cac pt la so ngau nhien tu ( 1,100) */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class bai56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        for ( int i = 0; i < n ; i ++) {
            int ngaunhien = rd.nextInt(1,101);
            list.add(ngaunhien);
        }
        System.out.println(list);

    }
    
}
