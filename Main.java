import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner gr=new Scanner(System.in);
        System.out.println("enter your marks in maths:");
        int m= gr.nextInt();
        System.out.println("enter your marks in english:");
        int en=gr.nextInt();
        System.out.println("enter your marks in physics:");
        int phy=gr.nextInt();
        System.out.println("enter your marks in chemistry");
        int ch=gr.nextInt();
        int total= m+en+phy+ch;
        float avg=total/4;
        float per= (total*100)/400;
        if(per>=90){
            System.out.println("you have scored:"+per+"%");
            System.out.println("you got an A grade");
        }
        else if(per>=80){
            System.out.println("you have scored:"+per+"%");
            System.out.println("you got B grade");
        }
        else if(per>=70){
            System.out.println("you have scored:"+per+"%");
            System.out.println("you got c grade");
        }
        else if(per>=50){
            System.out.println("you have scored:"+per+"%");
            System.out.println("you got d grade");
        }
        else{
            System.out.println("you have scored:"+per+"%");
            System.out.println("you have failed");
        }
    }
}