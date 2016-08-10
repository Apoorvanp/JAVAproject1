package date;

import java.util.Scanner;


public class Date {

  int date;
  int month;
  int year;

  public Date(int date, int day, int year) {
  this.date = date;
  this.month = day;
  this.year = year;
  }

  public Date() {
  }


  public int getDate() {
  return date;
  }

  public int getMonth() {
  return month;
  }

  public int getYear() {
  return year;
  }

  public void setDate(int date) {
  this.date = date;
  }

  public void setMonth(int month) {
  this.month = month;
  }

  public void setYear(int year) {
  this.year = year;
  }

  public void displayDate()
  {
  System.out.println(this.date + "/" + this.month + "/" + this.year);
  }

}