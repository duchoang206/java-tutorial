
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class bai55 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,6,4,5,6));
        // contains kiem tra arraylist có chứa pt nào đó hay k 
        boolean ktra = list.contains(4);
        System.out.println(ktra);
        // Collection.sort() sx tang dan
        Collections.sort(list);
        System.out.println(list);
        // indexOf() tim vi tri dau tien cua element trong list k tim thay return -1
        
        System.out.println(list.indexOf(12));
        //duyet list
        //cach 1 : duyệt bằng for 
        for ( int vl : list) {
            System.out.println(vl);
        }

    }
    
}
