/* Viết chương trình trích lọc string 
từ đường dẫn D:\Desktops\OOP java\ bai48.java
yêu cầu 
tách tên tệp bao gồm cả đuôi bai48.java
tách tên file bai48  */
public class bai48 {
    public static void main(String[] args) {
        String s = "D:* Desktops * OOP java * bai48.java";
        int lastSlashindex = s.lastIndexOf('*');
        String fileName = s.substring(lastSlashindex +1  );
        System.out.println(fileName);
        int x = fileName.lastIndexOf('.');
        String file = fileName.substring(0, x);
        System.out.println(file);

    }
}
