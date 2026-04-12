/* nhập vào từ bàn phím kiểm tra xem 
1 . đếm xem có bao nhiêu ký tự thường 
2 . đếm xem có bao nhiêu in hoa
3 . bao nhiêu số 
4 . bao nhiêu khoảng trắng */

import java.util.Scanner;

public class bai42 {
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao chuoi~");
    String s = sc.nextLine();
    // khởi tạo biến đếm 
    int thuong = 0;
    int inhoa =0;
    int so =0;
    int khoangtrang =0;
    for ( int i = 0 ; i < s.length() ; i++) {
        char c = s.charAt(i);
        if ( Character.isLowerCase(c)) {
            thuong++;
        }
        if ( Character.isUpperCase(c)) {
            inhoa++;
        }
        if ( Character.isDigit(c)) {
            so++;
        }
        if ( Character.isWhitespace(c)) {
            khoangtrang++;
        }
    }
    System.out.println(thuong);
    System.out.println(so);
    System.out.println(khoangtrang);
    System.out.println(inhoa);

    
}
}
