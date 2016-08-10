package date;
import java.util.Scanner;
public class DateTest{

public static void main(String[] args) {
  int date, month, year;
  Scanner in = new Scanner(System.in);


// using constructor
  System.out.println("Enter date");
  date = in.nextInt();
  System.out.println("Enter month");
  month = in.nextInt();
  System.out.println("Enter year");
  year = in.nextInt();

  Date d1 = new Date(date, month, year);
  d1.displayDate();
// using getter and setter
  date = 12;
  month = 8;
  year = 1997;

  Date d2 = new Date();
  d2.setDate(date);
  d2.setMonth(month);
  d2.setYear(year);
  d2.displayDate();


  }

}


