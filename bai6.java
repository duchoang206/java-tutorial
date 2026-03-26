/* viet chương trình nhập vào số nguyên a từ bàn phím kiểm tra xem số đó có phải số nguyên tố hay không */
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int DemUoc =0;
        
        for (int i=2; i<=a ; i++) {
            if ( a%i == 0) {
                DemUoc++;
            }
        }
            if (DemUoc==2) {
                System.out.println(a +" la so nguyen to");
            } else {
                System.out.println(a+ "khong la so nguyen to");
            }

            }
    }
    


