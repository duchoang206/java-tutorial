public class bai46 {
    public static void main(String[] args) {
        /* cho chuỗi a = "tôi chăm học tôi chịu khó tôi đẹp trai"
        đếm từ tôi trong chuỗi trên" */
        String a = "tôi chăm học tôi chịu khó tôi đẹp trai";
        // tách chuỗi thành các từ riêng biệt
        String[] words = a.split(" ");
        int count =0;
        for ( String tu : words ) {
            if ( tu.equals("tôi")) {
                count++;
            }
        }
        System.out.println(count);
        
    }
}
