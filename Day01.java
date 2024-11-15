import java.util.Scanner;

/**
 * 可以用来自动创建文档的注释
 */
public class Day01 {
    public static void main(String[] args) {
        //向屏幕输出文本
        System.out.println("hello world!");
        int x = 1;
        System.out.println(x);
        int y = x * x + 100;
        System.out.println(y);
        /*多行注释
        注释内容
        注释结束*/
        int n = 100;
        int sum = (1 + n) * n / 2;
        System.out.println(sum);
        var ns = new int[5];
        ns[0] = 111111;
        ns[1] = 2;
        System.out.println(ns[0]);
        System.out.println(ns.length);
        int[] ts = new int[]{12, 34, 56, 78, 33, 22, 55};
        System.out.println(ts.length);
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
        Scanner scanner = new Scanner(System.in);
        System.out.print("name:");
        String name = scanner.nextLine();
        System.out.print("age:");
        int age = scanner.nextInt();
        System.out.printf("name %s,age %d",name,age);
    }
}
