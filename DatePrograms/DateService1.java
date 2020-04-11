package services;
import java.util.Calendar;
import java.util.Date;

public class DateService1{
public static Date nextDate(Date d1){
    long t=d1.getTime();
    Date d2=new Date(t+1);
    return d2;
}
public static void main(String[] args) {
    //System.out.println(nextDate(new Date()));
    Calendar c1=Calendar.getInstance();
    c1.roll(Calendar.DAY_OF_MONTH,1);
    System.out.println(new Date(c1.getTimeInMillis()));

}
}