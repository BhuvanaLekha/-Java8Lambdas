package Palindrome.palindrome;
import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
       App obj=new App();
       obj.palindrome();
    }
    void palindrome() {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements you want to add to the list: ");
        n=sc.nextInt();
        ArrayList<String> palin = new ArrayList<String>();
        System.out.println("Enter the elements to add into the list: ");
        for(int i=1;i<=n;i++) {
            palin.add(sc.next());
        }
        palin.forEach(item ->
        {
         StringBuilder s = new StringBuilder(item);
   
         if(s.reverse().toString().equals(item))
         {    
             System.out.println("Palindromes in the list are : "+item);
         }}); 
        }
}