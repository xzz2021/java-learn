import top.xzz2022.random.GenerateNum;
//  引入自定义包
public class Learn1 {
    public static void main(String[] args) {
//        genInt(6,13);
        reverseArr(new int[]{1, 3, 5, 7, 9});
    }

    // 生成范围随机数
    public static void genInt(int min, int max){
        int aa = GenerateNum.generateInt(min,max);
        System.out.println(aa);
    }
    // 数组元素对应头尾元素交换
    public static void reverseArr(int[] args) {
        for (int i = 0, j = args.length -1; i < j; i++, j--) {
            int temp = args[i];
            args[i] = args[j];
            args[j] = temp;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}