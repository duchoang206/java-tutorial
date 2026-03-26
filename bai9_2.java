/* vi du giai phuong trinh bac 2 */

import java.util.Scanner;

public class bai9_2 {
    public static void main(String[] args) {
        String kq = gptbac2(1,2,3 );
        String kq1 = gptbac2(1,2,1 );
        System.out.println(kq);
        System.out.println(kq1);
    // cho nguoi dung nhap vao a, b , c
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao a,b,c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(kq);
        System.out.println(kq1);
        String kq4 = gptbac2(a, b, c);
        System.out.println(kq4);

        

        
    }
    public static String gptbac2(double a , double b , double c ) {
        // neu a =0 thi pt tri thanh ptbn bx+c =0
        if ( a==0 ) {
            if ( b==0 && c ==0) {
                return "PT bac nhat vo so nghiem";
            }
            else if ( b == 0 && c != 0) {
                return "PT vo nghiem";
            }
            else {
                return " PT bac nhat co nghiem"+(-c/b);
            
            }
        }
        else {
            // giai phuong trinh bac 2
            double delta = (b*b) -(4*a*c);
            if ( delta <0) {
                return "PTbac 2 vo nghiem";
            }
            else if (delta ==0) {
                double x = -b/(2*a);
                return "ptbac 2 co nghiem kep x = " +x;
            }
            else {
                double x1 = (-b+Math.sqrt(delta))/(2*a);
                double x2 = (-b-Math.sqrt(delta))/(2*a);
                return "ptbac 2 co nghiem x1 ="+x1 +"ptbac2 co nghiem x2 = "+x2;
                
        }
    }
    
}
}

