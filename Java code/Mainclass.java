import java.util.*;
 public class Mainclass{
    public Mainclass(){
        System.out.println("mainclass cosntructor");
    }
 public static void main(String []args){

       System.out.println("Hello World to guys");
       Scanner sc=new Scanner(System.in);
       int age =sc.nextInt();
       if(age>=18) System.out.println("we can vote for election");
       else System.out.println("we cannot vote in election");
   

   }
}