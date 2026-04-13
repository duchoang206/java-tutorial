/* array list trong java 
hai lớp collection thường gặp
arraylist và hashmap 
arraylist nó giống như 1 mảng nhưng có thể co giãn kích thước pt
hashmap cho phép bạn lưu trữ các cặp ( key, value) và tìm kiếm các giá trị bằng key  */

import java.util.ArrayList;
import java.util.List;

public class bai54 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // khai bao voi so luong pt ban dau 
        ArrayList<Integer> list2 = new ArrayList<>(5);
        // khai báo với các pt sẵn có 
        ArrayList<Integer> list3 = new ArrayList<>(List.of(1,2,3,4,5));
        // Xuat list
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        // add them phan tu 
        list3.add(6);
        System.out.println(list3);
        // add (index , element ) 
        list3.add(0,6);
        System.out.println(list3);
        // size() tra ve kich thuoc length
        int i = list3.size();
        System.out.println(i);
        // get(index ) : tra ve gia tri cua list tai vi tri index   
        System.out.println(list3.get(2));
        // remove (index ) : xoa pt o vi tri index 
        list3.remove(3);
        System.out.println(list3);
        list3.remove(Integer.valueOf(3));
        System.out.println(list3);
        //set(index , element ) thay doi thong tin 
        list3.set(1, 123);
        System.out.println(list3);


    }
}
