/* bai tap 13 
viet chuong trinh nhap so a tu ban phim neu a chan thi tinh tong cac so tu 0 den a , neu a le thi in ra dong chu " toi khong tinh tong le 
*/
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a : ");
        int a = sc.nextInt();
        int sum = 0;
        if ( a %2 ==0){
            for ( int i =0 ; i<=a ; i++){
                sum += i;
            }
            System.out.println(sum);
            } else {
                System.out.println("toi khong tinh tong le");
            }    
            }
        }

    
