package anystep;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java_10699 {
    //오늘 날짜
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        System.out.println(format.format(d));
    }
}
