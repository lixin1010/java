import java.util.Arrays;

public class Day02_2 {
    public static void main(String[] args) {
//        int n = 0;
//        int sum = 0;
//        while (n<101){
//            sum = sum+n;
//            n = n+1;
//        }
//        System.out.println(sum);

//        int sum = 0;
//        int n = 0;
//        while (n <= 100) {
//            n ++;//最后一次加法n=101，因此计算结果不对，需要将条件修改为n<100
//            sum = sum + n;
//        }
//        System.out.println(sum);
//        int sum = 0;
//        int m = 20;
//        int n = 100;
//        // 使用while计算M+...+N:
//        while (m<=n) {
//            sum = sum + m;
//            m++;
//        }
//        System.out.println(sum);
//        int sum = 0;
//        int n =1;
//        do{
//            sum = sum + n;
//            n ++;
//        }while(n<=100);
//        System.out.println(sum);
//        int sum = 0;
//        for (int i=1;i<=100;i++){
//            sum = sum + i;
//        }
//        System.out.println(sum
//        );
//        int[] ns = {1,5,6,7,8,9};
////        int sum = 0;
////        for(int i=0;i<ns.length;i++){
////            sum = sum + ns[i];
////        }
////        System.out.println(sum);
////        for(int i=ns.length-1;i>=0;i--){
////            System.out.printf("第%d项数据:%d\n",i+1,ns[i]);
//////            System.out.println();
////        }
////        int sum = 0;
////        for(int n:ns){
////            sum = sum + n;
////        }
////        System.out.println(sum);
////        double pi = 0;
////        double tmp = 0;
////        for (int i=0;i<10000;i++){
////            pi += 4.0* (Math.pow(-1,i)/(2*i+1));
////        }
////
////        System.out.println(pi);
//        for (int i=ns.length-1;i>=0;i--){
//            System.out.println(ns[i]);
//        }
//        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
//        for(int i=0;i<ns.length-1;i++){
//            for(int j=0;j<ns.length-i-1;j++){
//                if(ns[j]>ns[j+1]){
//                    int tmp = ns[j];
//                    ns[j]=ns[j+1];
//                    ns[j+1]=tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(ns));
        int[] ns = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] < ns[j + 1]) {
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                }}}
                // TODO:
                // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
          }
            }
        }