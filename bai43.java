/* giai bai tập java String 
bài 19 String str1 ="English = 78 Science = 83 Math = 68 History = 65 "
tính tổng các số trong chuỗi trên
tính trung bình cộng */
public class bai43 {
    public static void main(String[] args) {
        String str1 ="English = 78 Science = 83 Math = 68 History = 65 ";
        int sum =0;
        int count =0;
        for ( int i =0 ; i < str1.length() ; i++) {
            char c = str1.charAt(i);
            if ( Character.isDigit(c)) {
                sum+= c;
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(sum/count);
    }
    
}
