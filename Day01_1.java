import java.util.Scanner;

public class Day01_1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("上一次成績：");
//        int last_grade = scanner.nextInt();
//        System.out.print("本次成績：");
//        int this_grade = scanner.nextInt();
//        int tmp = this_grade-last_grade;
//        if(tmp>0){
//            System.out.println("恭喜成绩提高");
//        }else {
//            System.out.println("继续努力！");
//        }
//        float n = (float)tmp/last_grade;
//        System.out.printf("成績提高了%.2f%%",n*100);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height(KG):");
        float hei = scanner.nextFloat();
        System.out.print("Weight(m):");
        float wei = scanner.nextFloat();
        float BMI = hei/(wei*wei);
        System.out.printf("%.2f",BMI);
        System.out.println();
        if(BMI<18.5){
            System.out.println("过轻");
        }else if(BMI>18.5&&BMI<25){
            System.out.println("正常");
        }else if(BMI>25&&BMI<28){
            System.out.println("过重");
        }else if(BMI>28&&BMI<32) {
            System.out.println("肥胖");
        }else {
            System.out.println("非常肥胖");
        }
        }
    }

