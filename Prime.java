import Math;
import java.util.*;
class Prime{
int num;
bool prime(int n)
{
if(n%2==0)
{
return false;
}
else{
for(int i=3;i<Math.sqrt(n,2);i++)
{
if(n%i==0) return false;
}
return true;
}
public static void main(String[] args)
{
System.out.println("Enter a number : ");

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(prime(n));
<<<<<<< HEAD
System.out.println("Jai Jagannath");
=======
System.out.println("This is a prime number program");
>>>>>>> main
}
}
