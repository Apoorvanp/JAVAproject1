import java.util.Scanner;


public class SalesCommission {


  public static void main(String[] args) {
  int numberOfSalesPerson;
  int salary = 200;
  System.out.println("Enter no.of employees");
  Scanner in = new Scanner(System.in);
  numberOfSalesPerson = in.nextInt();
  int[] sales = new int[numberOfSalesPerson];
  int[] grossSalary = new int[numberOfSalesPerson];
  System.out.println("Enter gross sales");
  for (int i=0; i<sales.length; i++ )
  {
  sales[i] = in.nextInt();
  grossSalary[i] = 200;
  }
  calcGross(sales, grossSalary);
  int[] counter = new int[9];
  int[] range = {200, 300, 400, 500, 600, 700, 800, 900, 1000};
  getCount(grossSalary, counter, range);
  System.out.println("Range\tCount");
  for(int i=0; i<counter.length-1; i++)
  {
  System.out.println(range[i]+"-"+range[i+1]+"\t"+counter[i]);
  }
  System.out.println(range[range.length-1]+"+"+"\t"+counter[range.length-1]);

  }

  public static void calcGross(int[] sales, int[] salary)
  {
  for(int i=0; i<sales.length; i++)
  {
  salary[i] += 0.09 * sales[i];
  }
  }

  public static void getCount(int[] salary, int[] counter, int[] range)
  {
  for( int i=0; i<salary.length; i++)
  {
  int j;
  for( j=0; j<range.length-1; j++)
  {
  if( salary[i] >= range[j] && salary[i] < range[j+1])
  counter[j]++;
  }
  if( salary[i] >= range[j])
  counter[j]++;
  }

  }

}
