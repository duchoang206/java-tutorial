/* Cho hình tròn có bán kính r được nhập từ bàn phím, 
bạn hãy viết phương thức trả về chu vi của hình tròn này biết π = 3.14.
Ví dụ nếu bạn nhập:
3.5
Thì chương trình sẽ hiển thị ra:
21.98 */

import java.util.Scanner;

public class bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(Tinh(r));
        
    }
    public static double Tinh( double r ){
        return 2 * 3.14 * r;
    }

}