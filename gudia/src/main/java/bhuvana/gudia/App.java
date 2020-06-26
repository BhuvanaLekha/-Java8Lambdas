package bhuvana.gudia;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        App obj=new App();
        obj.stringCheck();
    }
    void stringCheck() {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number of elements you want to add to the list: ");
			n=sc.nextInt();
			ArrayList<String> a=new ArrayList<String>();
			System.out.println("Enter the elements to add into the list: ");
			for(int i=0;i<=n;i++) 
			{
			 a.add(sc.nextLine());
			}
			a.forEach( str ->
			{  if(str.length()==3 && str.startsWith("a"))
			    System.out.println("String with length 3 and starts with \'a\': "+str);
			        });
		}
    }
}
