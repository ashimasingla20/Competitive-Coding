package spoj;
/*ADDREV SPOJ*/
import java.util.Scanner;

public class reverse {
	public static int rev(int num){
		int res = 0;
		while(num!=0){
			res = 10*res;
			res = res+(num%10);
			num = num/10;
		}
		return res;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int res = rev(rev(num1)+rev(num2));
			System.out.println(res);
			n--;
		}
		
	}
}
