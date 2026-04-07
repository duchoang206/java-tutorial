/*
Thư viện calendar trong java */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class bai35 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
       System.out.println(cal);
       int nam = cal.get(Calendar.YEAR);
       System.out.println(nam);
       // get lấy thông tin ngày tháng năm 
       // set ngay thang nam theo y muon
       cal.set(Calendar.YEAR,1987);
       int namsinh = cal.get(Calendar.YEAR);
       System.out.println(namsinh);
       //Xuất theo định dạng ngày tháng năm , giờ phút giây 
       SimpleDateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy");
       Date d = cal.getTime();
       String s = dinhdang.format(d);
       System.out.println(s);
       intuoi();

    }
    

// viet chuong trinh nhap vao ngay thang nam sinh , cho biet so tuoi va in ra man hinh 

    public static void intuoi() {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        // khởi tạo biến liên quan đến ngày tháng 
        Calendar birthday = Calendar.getInstance();
        // set ngay thang nam sinh do nguoi dung nhap vao
        birthday.set(year, month-1, day);
        // xuat ngay thang nam sinh
        int namsinh = birthday.get(Calendar.YEAR);
        int thangsinh = birthday.get(Calendar.MONTH);
        int ngaysinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngay thang nam sinh" 
            + ngaysinh +"/"
            +(thangsinh+1) +"/"
            +namsinh);
        Calendar now = Calendar.getInstance();
        int namhientai = now.get(Calendar.YEAR);
        int tuoi = namhientai - namsinh ;
        System.out.println(tuoi);
        
    }
}
