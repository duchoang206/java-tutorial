public class bai40 {
    /* Phương thức 
    indexOf kiểm tra vị trí xuất hiện đầu tiên của ký tự hoặc chuỗi trả về -1 nếu k thấy
    lastIndexOf Trả về vị trí index xuất hiện cuối cùng của ký tự hoặc chuỗi -1 nếu k thấy
    contains kiểm tra chuỗi con
    substring lấy mỗi chuỗi con từ một chuỗi dài hơn   */
    public static void main(String[] args) {
        String s7 = " tôi đi tìm tôi";
        System.out.println(s7.indexOf("tôi"));
        System.out.println(s7.lastIndexOf("tôi"));
        // contains kiểm tra 1 chuỗi có phải chuỗi con của chuỗi lớn hay k 
        String s9 = ".mp3";
        String s10 ="tự học .mp3";
        boolean check = s10.contains(s9);
        if ( check ==true) {
            System.out.println("Co mp3 trong chuoi~");
        } else { 
            System.out.println("k tim thay");
        }
        String s11 = "abcdefgh";
        String s12 = s11.substring(4);
        String s13 = s11.substring(4,6);
        System.out.println(s12);
        System.out.println(s13);





    }
    
    
}
