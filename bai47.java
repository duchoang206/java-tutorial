/* viết chương trình nhập vào chuỗi và tách ra thành 2 chuỗi vd 
abc123 thành abc và 123 */

import java.util.Scanner;

public class bai47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();
        for ( int i =0 ; i < a.length() ; i++) {
            char c = a.charAt(i);
            if ( Character.isDigit(c) ) {
                so.append(c);
            }
            if ( Character.isLetter(c)) {
                chuoi.append(c);
            }
        }
        System.out.println(chuoi);
        System.out.println(so);
    }
    
}
