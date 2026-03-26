/* bài học này cta sẽ xử lý ngoại lệ trong java 
ngoại lệ là gì ? , ngoại lệ là những lỗi có thể xảy ra khi mà ta chạy chương trình mới biết 
VD mở 1 file mà k tồn tại , hay kết nối với 1 database k có sẵn  */
public class bai8 {
    public static void main(String[] args) {
        int a =10;
        int b =5;
        
        /* nhận thấy output Exception in thread "main" java.lang.ArithmeticException: / by zero 
        lỗi ngay ở dòng số 9 và dòng 10 k được thực hiện  */
        /* đưa phần code có thể phát sinh lỗi vào khối try*/
        try {
            int c = a/b;
        System.out.println("c="+c);

        }
        catch (Exception ex) { // Xu ly ngoai le 
            System.out.println("Co loi~ roi"); // Dua ra thong bao
            ex.printStackTrace();
        }
        finally { 
        System.out.println("abasdfa"); // co loi hay k van chay
        }
        System.out.println(5);
    }
}
    

