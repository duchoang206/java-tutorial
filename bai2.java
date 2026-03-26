/* viet chuong trinh tinh tong cac so le tu 1 den n , n nhap tu ban phim 
1. Nhap n = 7 bo qua cong tong voi 3 => in ra ket qua 
VD :  1+5+7 =13)
2. thu break khi vong lap chay den gia tri n = 3 */ 
import java.util.Scanner;
public class bai2{ 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for ( int i=1 ; i <=n ; i+= 2) {
            if (i ==3 ){
                continue; // bỏ qua , nhảy cóc qua giá trí i==3 sau đó quay lại vòng lặp , còn break thì sẽ làm dừng vòng lặp;
            } else {
                sum +=i;
            }

           
            
        }System.out.println(sum);
        


    }

    }
    

