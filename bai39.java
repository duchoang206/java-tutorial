// Trong java String la 1 lop quan ly du lieu van ban duoc khia bao trong 1 chuoi " "
public class bai39 {
    public static void main(String[] args) {
        String s = "Anh yeu em";
        System.out.println(s);
        /* Các phương thức thường dùng trong String 
        append(string ) thêm phần tử vào cuối 
        insert(index, string) chèn phần tử vào vị trí index 
        delete(start , end ) xóa các ký tự từ vị trí st đến end-1
        string.length() trả về độ dài của chuỗi tính cả space
         */
        StringBuilder chuoi = new StringBuilder();
        chuoi.append(s);
        System.out.println(s);
        chuoi.insert(0,"a");
        System.out.println(chuoi);







    }
    
}
