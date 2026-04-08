// ngẫu nhiên trong java 

import java.util.Random;

public class bai37 { 
    public static void main(String[] args) {
        Random rd = new Random();
        // lấy ngẫu nhiên số nguyên 
        int songuyen = rd.nextInt(-50,51); //  chạy từ âm 50 đến nhỏ hơn 51
        System.out.println(songuyen);
        int songuyen2 = rd.nextInt(51); //  nếu có 1 đối số chạy từ 0 đến dưới 51
        System.out.println(songuyen2);
        // chay ngẫu nhiên số thực 
        double sothuc = rd.nextDouble(50);
        System.out.println(sothuc);
    
    
    }


    
}
