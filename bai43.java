/* giai bai tập java String 
bài 19 String str1 ="English = 78 Science = 83 Math = 68 History = 65 "
tính tổng các số trong chuỗi trên
tính trung bình cộng */
public class bai43 {
    public static void main(String[] args) {
        String str1 ="English = 78 Science = 83 Math = 68 History = 65 ";
        int sum =0;
        int count =0;
        String str2 = str1.replaceAll("[^0-9]+", " ").trim();
        System.out.println(str2);
        String[] mang = str2.split(" ");
        for (String num : mang) {
        try {
            int num1 = Integer.parseInt(num);
            sum += num1;
            count++;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
        System.out.println(sum);
        System.out.println(sum/count);
    }

}