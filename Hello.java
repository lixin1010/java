import java.util.Scanner;

public class Hello{
	public static void main(String[] args){
		System.out.println("hello,world!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("input your name");
		String name = scanner.nextLine();
		System.out.println("input your age");
		int age = scanner.nextInt();
		if (age>18){
//			System.out.println("成年人");
			System.out.printf("Hi,%s,you are %d 已经成年\n",name,age);
		}else {
//			System.out.println("未成年");
			System.out.printf("Hi,%s,you are %d 未成年\n",name,age);
		}
		System.out.println("选择1,2,3");
		int option = scanner.nextInt();
		switch (option) {
			case 1 -> System.out.println("Select 1");
			case 2 -> System.out.println("Select 2");
			case 3 -> System.out.println("Select 3");
			default -> System.out.println("Not select");
		}
}
}