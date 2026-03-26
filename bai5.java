/* so hoanf hảo là số mà tổng các ước thực của nó bằng chính nó 
vd 6 =3+2+1 
tìm tất cả các số hoàn hảo hoàn thiện từ 1 đến 1000 */

public class bai5 {
    public static void main(String[] args) {
        //ktra xem 1 số có phải số hoàn hảo không ???
        for ( int n=1; n<=1000; n++) {
            int tong =0;
            for (int i=1;i <n; i++) {
                if (n%i ==0) {
                    tong +=i;
                }    
            }if ( n ==tong) {
                    System.out.println(n); 
                    
                    ;
                }       
        }
    }
}
    

