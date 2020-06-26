package Average.average;
import java.util.Scanner;
import java.util.ArrayList;
public class App
{
  public static void main (String[]args)
  {
    int n, s = 0, avg = 0;
    Scanner sc = new Scanner (System.in);
      System.out.println("Enter the number of elements you want to add into the list :");
      n = sc.nextInt ();
      ArrayList < Integer > list = new ArrayList < Integer > ();
      System.out.println ("Enter the elements you want to add to the list :");
    for (int i = 0; i < n; i++)
      {
	
	list.add (sc.nextInt());
      }
    for (int i:list)
      {
	s += i;
      }
    avg = s / n;
    System.out.println ("The average of elements in the list is : "+avg);

  }
}

