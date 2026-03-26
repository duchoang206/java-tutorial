/* viet chuong trinh tinh tong 
S = 1!+2! + ....10! */
public class bai4 {
    public static void main(String[] args) {
        
    
    int tong = 0;
    int m=1;
    for ( int i =1 ; i<=10 ; i++) {
        m*= i;
        tong +=m;

    }
    System.out.println(tong);
    
}
}
