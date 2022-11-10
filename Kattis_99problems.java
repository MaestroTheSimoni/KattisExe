import java.util.Scanner;
public class Kattis_99problems {

	static void a(int num) {
		if(num<149) {
			System.out.println("99");
			return;
		}
		int base;
		if(num%100<49) {
			base = (num/100)-1;
		}
		else{
			base = (num/100);
		}
		System.out.println(""+base+"99");
	}
	static void b(int num) {
		int base;
		if(num%100<49) {
			base = Math.max((num/100)-1, 0);
		}
		else{
			base = (num/100);
		}
		System.out.println(""+(base>0?base:"")+"99");
	}
	static void c(int num) {
		System.out.println(""+((num%100<49?Math.max((num/100)-1, 0):(num/100))>0?(num%100<49?Math.max((num/100)-1, 0):(num/100)):"")+"99");
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		int r = (int)(Math.random()*3);
		switch(r) {
			case 0:
				a(num);
				break;
			case 1:
				b(num);
				break;
			case 2:
				c(num);
				break;
		}
	}

}
