/* nhập vào 1 chuỗi => tối ưu hóa chuỗi theo quy tắc
không có khoảng trắng dư thừa
các từ cách nhau bởi 1 khoảng trắng
ký tự đầu tiên mỗi từ viết hoa
vd input "      Gà lẠi Lập TRÌNH    "
output "Gà Lại Lập Trình" */
public class bai49 {
    public static void main(String[] args) {
        String input = "      Gà lẠi Lập TRÌNH    ";
        String kq = chuanhoa(input);
        System.out.println(kq);
        
    }
    public static String chuanhoa ( String input ) {
        input = input.trim();
        String[] mang = input.split("\\s+"); // tacsh theo dấu cách liên tiếp nhau
        for ( int i =0 ; i < mang.length ; i++ ) {
            mang[i] = mang[i].toLowerCase();
            String firstchar = mang[i].substring(0,1);
            firstchar = firstchar.toUpperCase();
            mang[i] = firstchar + mang[i].substring(1);
        }
        return String.join(" ", mang);
    }
    
}
