import java.util.Scanner;

public class bai45 {
    public static void main(String[] args) {
        String a = "abcdeg";
        String b = "nsakwq";
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao tin nhan can ma hoa");
        String input = sc.nextLine();
        String output = "";
        for ( int i = 0 ; i < input.length() ; i++ ) {
            char c = input.charAt(i);
            int index = a.indexOf(c);
        
        if ( index == -1) {
            output += c;
        }
        else {
            output += b.charAt(index);
        }
        } System.out.println(output);
}
}
