// void la k can tra ve //
// ham thu tuc//
/* viet chuowng trinfh nhập từ bàn phím 2 số a và b ,
nhập 1 ký tự + - * / , 
viết function để nhập kết quả  */

import java.util.Scanner;

public class bai9giaibaitamham {
    public static int Cong( int a , int b) {
        int kq1 = a +b;
        return kq1;
        System.out.println(kq1);
    }
    public static int Tru (int a , int b ) {
        int kq2 = a -b;
        return kq2;
        System.out.println(kq2);
    }
    public static int Nhan( int a , int b) {
        int kq3 = a*b;
        return kq3;
        System.out.println(kq3);
    }
    public static double Chia( int a , int b ) {
        if ( b==0) {
            System.out.println("khong chia duoc");
            return 0;
        } else {
            double kq4 = a/b;
            return kq4;
            System.out.println(kq4);
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Moi nhap a ");
    int a = sc.nextInt();
    System.out.println(" Moi nhap b");
    int b = sc.nextInt();
    sc.nextLine();
    System.out.println("Moi nhap + , - , / , * ");
    String phepTinh = sc.nextLine();
    switch ( phepTinh) {
        case "+" :
            Cong(a,b);
            break;
        case "-" :
            Tru(a ,b);
            break;
        case "*" :
            Nhan(a,b);
            break;
        case "/" :
            Chia(a,b);
            break;
        default:
            System.out.println("Khong thoa man");      
    }
    

}
}
