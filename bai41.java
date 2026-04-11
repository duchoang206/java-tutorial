/* phương thức replace 
replace ("str old" , "str new") thay thế toàn bộ chuỗi cũ bằng chuỗi mới */
public class bai41 {
    public static void main(String[] args) {
        String s14 = " hoc hoc nua hoc mai    ";
        String s15 = s14.replace("hoc", "ngu");
        System.out.println(s15);
        // replace first thay the string đầu tiên bằng chuỗi mới
        String s16 = s14.replaceFirst("hoc", "ngu");
        System.out.println(s16);
        // trim() xóa toàn bộ khoảng trắng ở đầu và cuối 
        String s17 = s14.trim();
        System.out.println(s17);
        // \s+$ xóa toàn bộ khoảng trắng ở cuối 
        String s20 = s14.replaceAll("\\s+$", "");
        System.out.println(s20.length());
        System.out.println(s14.length());


    }
}