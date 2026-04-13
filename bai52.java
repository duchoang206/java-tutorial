import java.util.Arrays;

public class bai52 {
    public static void main(String[] args) {
        int[] mang9 = {1,2,3,4};
        int[] mang10 = mang9;
        mang9[0] = 101;
        System.out.println(Arrays.toString(mang9));
        System.out.println(Arrays.toString(mang10)); 
        // -> mảng là kiểu dữ liệu tham chiếu vào cùng 1 ô nhớ  , nên khi thay đổi 1 pt trong mảng 9 , gán mảng 10 = mảng 9 thì 2 mảng có giá trị bằng nhau  
        // muốn tạo mảng mới cùng giá trị phải clone mảng 
        
        int[] mang11 = mang9.clone();
        mang11[0] = 1212;
        System.out.println(Arrays.toString(mang9));
        System.out.println(Arrays.toString(mang11)); 
    }
}
