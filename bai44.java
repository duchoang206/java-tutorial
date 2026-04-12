/* giải bài tập 20 
 viết chương trình kiểm tra tính hợp lệ của mật khẩu aaaaAAAAA1
 mật khẩu hợp lệ khi có ít nhất 6 ký tự 
 chứa ít nhất 1 chữ cái 
 chứa ít nhất 1 chữ số
 2. cho người dùng nhập vào mật khẩu để login nếu đúng thì login 
 nếu sai quá 5 lần thì khóa */

import java.util.Scanner;

public class bai44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pw = "";
        //Thiết lập mật khẩu để kiểm tra tính hợp lệ 
        while (true) {
            System.out.println("moi nhap vao mk");
            System.out.println("Mat khau phai thoa man yeu cau");
            String newpw = sc.nextLine();
            if(checkMK(newpw) ==true) {
                pw = newpw;
                break;
            }
            else {
                System.out.println("mat khau khong hop le");
            }
        }
    }
    public static boolean checkMK (String password){
        if ( password.length() < 6) {
            return false;
        }
        boolean hasletter = false;
        for ( char c : password.toCharArray()) {
            if ( Character.isLetter(c)) {
                hasletter = true;
                break;
            }
        }
        if ( !hasletter) return false;
        boolean hasnumber = false;
        for ( char c : password.toCharArray()) { 
            if ( Character.isDigit(c)) {
                hasnumber = true;
                break;
            }
        }
        if ( !hasnumber) return false;
        return true;
    }
}
