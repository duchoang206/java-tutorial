public class bai41phuongthuc {
    /* compareto va comparetoIgnoreCase so sánh 2 chuỗi trong java 
    comparetoIgnoreCase so sánh 2 chuỗi bỏ qua viết hoa viết thường */
    /* nối chuỗi bằng dấu cộng +  */ 
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = s1 + "b";
        System.out.println(s2);
        //đảo ngược chuỗi dùng reserve()
        StringBuilder sb = new StringBuilder(s2);
        String s3 = sb.reverse().toString();
        System.out.println(s3);
        // split tách chuỗi
        String s4 = " Hello , world ";
        String[] mang = s4.split(",");
        for ( int i = 0; i < mang.length ; i ++) {
            System.out.println(mang[i]);
        }
        //lowercase() chuyển thành chữ viết thường uppercase chuyển thành in hoa
        String s5 = " HoangXuanDuc";
        String s6 = s5.toLowerCase();
        System.out.println(s6);
        System.out.println(s5.toUpperCase());
        // toCharArray() tach chuoi thanh ky tu cho vaof mangr 
        String s42 = "abcdef12@";
        char[] mang2 = s42.toCharArray();
        // duyet mang 
        for ( int i = 0; i < mang2.length ; i ++) {
            System.out.println(mang2[i]);
        }
        // reverse() phuong thuc dao nguoc chuoi~ 
        String s43 = "12345abc";
        // Bắt buộc khai báo đối tượng thuộc class StringBuilder
        StringBuilder sb1 = new StringBuilder(s43);
        sb1.reverse();
        String s44 = sb1.toString(); // chuyển sang chuỗi 
        System.out.println(s44);


    }
}