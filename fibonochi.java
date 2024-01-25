import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the value");
      int x=scan.nextInt();
      int a=0;
      int b=0;
      int c=1;
      System.out.println(b);
      for(int i=0;i<x;i++){
        System.out.println(Math.abs(c));
        a=b+c;
        b=c;
        c=a;
      }
  }
}