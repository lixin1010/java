import java.util.Arrays;

public class Day03 {
    public static void main(String[] args) {
//        int[][] ns ={
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12}
//        };
//        int[] arr0 = ns[1];
//        System.out.println(ns.length);
//        System.out.println(Arrays.toString(arr0));
//        System.out.println(Arrays.deepToString(ns));
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 }, // 学生甲的语数英成绩
                { 68, 72, 64 }, // 学生乙的语数英成绩
                { 95, 91, 89 }, // ...
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO:
        double average = 0;
        double sum = 0;
        double sum2 = 0;
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                sum = sum+scores[i][j];
            }
            double average1=sum/scores[i].length;
            sum = 0;
            sum2 = sum2+average1;
//            System.out.println(sum2);
        }
//        System.out.println(sum);
//        System.out.println(sum2);
        average = sum2/scores.length;
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}
