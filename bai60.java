/* hashmap trong java 
giống với dictionary trong python có key và value 
Hashmap<typekey,typeValue> name = newHashMap<>() */

import java.util.HashMap;

public class bai60 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        // put() them pt vao hashmap
        map1.put(1, "as");
        System.out.println(map1);
        // get() lay gia tri cua hashmap 
        String s1 = map1.get(1);
        System.out.println(s1);
        // remove() xoa 1 pt o hashmap
        // map1.remove(1);
        // kiem tra pt co ton tai trong hashmap k 
        boolean check = map1.containsKey(1);
        System.out.println(check);
        // kiem tra gia tri co ton tai trong hashmap k
        boolean check2 = map1.containsValue("as");
        System.out.println(check2);
        // kiem tra hashmap co rỗng hay ko 
        boolean check3 = map1.isEmpty();
        System.out.println(check3);
        // in ra so luong pt
        System.out.println(map1.size());
        //duyet hashmap 
        for (Integer key : map1.keySet() ) {
            String vl = map1.get(key);
            System.out.println(vl);
        }
    }
    
}
