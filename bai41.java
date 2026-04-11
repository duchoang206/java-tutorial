/* phương thức replace 
replace ("str old" , "str new") thay thế toàn bộ chuỗi cũ bằng chuỗi mới */
public class bai41 {
    public static void main(String[] args) {
        String s14 = " hoc hoc nua hoc mai";
        String s15 = s14.replace("hoc", "ngu");
        System.out.println(s15);
        // replace first thay the string đầu tiên bằng chuỗi mới
        String s16 = s14.replaceFirst("hoc", "ngu");
        System.out.println(s16);

    }
}