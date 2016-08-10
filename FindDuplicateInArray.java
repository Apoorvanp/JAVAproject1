package subpackage;

import java.util.Scanner;


public class FindDuplicateInArray {
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
  int arr[] = new int[5];
  for (int i = 0; i < 5; i++) {
  arr[i] = in.nextInt();
  if (arr[i] >= 10 && arr[i] <= 100) {
  if (!isDup(arr, arr[i], i)) {
  System.out.println(arr[i]);
  } else {
  System.out.println("Duplicate");
  }
  printArray(arr,i);
  }
  else
  {
  i--;
  System.out.println("Enter number between 10 and 100");
  }
  }
  }

  public static Boolean isDup(int[] arr, int num, int length)
  {
  for(int i = 0;i < length; i++)
  {
  if (arr[i] == num)
  return true;
  }
  return false;
  }

  public static void printArray(int[] arr, int length)
  {
  System.out.println("Non duplicate elements:");
  for(int i=0; i <= length; i++)
  {
  if(!isDup(arr, arr[i], i))
  System.out.print(arr[i]+" ");
  }
  System.out.println();
  }

}
