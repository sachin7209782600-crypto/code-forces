import java.util.Scanner;
public class AElephant{
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    int input=sc.nextInt();
int answer=input/5;
int rem=input%5;
if(rem==0)
{
    System.out.println(answer);
}
else{
    System.out.println(answer+1);
}
}
}