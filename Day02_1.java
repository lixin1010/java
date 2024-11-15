import java.util.Scanner;

/**
 * 1.switch多重选择
 * 2.实现简单石头、剪子、布游戏
 */
public class Day02_1 {
    public static void main(String[] args) {
//        //switch多重选择
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input choice:1,2,3");
//        int option = sc.nextInt();
//        switch (option) {
//            case 1 -> System.out.println("selected 1");
//            case 2 -> System.out.println("selected 2");
//            case 3 -> System.out.println("selected 3");
//            default -> System.out.println("No selected");
//        }
        System.out.println("please choice:");
        System.out.println(" 1: Rock");
        System.out.println(" 2: Scissors");
        System.out.println(" 3: Paper");
        // 用户输入:
        Scanner sc = new Scanner(System.in);
        System.out.println("input choice:1,2,3");
        int choice = sc.nextInt();
        // 计算机随机数 1, 2, 3:
        int random = 1 + (int) (Math.random() * 3);
        System.out.println(random);
        switch (choice) {
            // TODO:
            case 1 -> {
                switch (random) {
                    case 1 -> System.out.println("平局");
                    case 2 -> System.out.println("输了");
                    case 3 -> System.out.println("你赢了");
                }
            }
            case 2 -> {
                switch (random) {
                    case 1 -> System.out.println("你输了");
                    case 2 -> System.out.println("平局");
                    case 3 -> System.out.println("你赢了");
                }
            }
            case 3 -> {
                switch (random) {
                    case 1 -> System.out.println("你赢了");
                    case 2 -> System.out.println("你输了");
                    case 3 -> System.out.println("平局");
                }
            }
            default -> System.out.println("结束");
        }
    }
}
