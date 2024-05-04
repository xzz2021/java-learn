import top.xzz2022.random.GenerateNum;
//  引入自定义包
public class Learn1 {
    public static void main(String[] args) {
//        genInt(6,13);
//        reverseArr(new int[]{1, 3, 5, 7, 9});
//        randomArr(new int[]{1, 3, 5, 7, 9});
//        randomChar2();
        numToArray(114536);
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
    // 数组内元素随机交换
    public static void randomArr(int[] args) {
        for (int i = 0; i < args.length; i++) {
            int index = GenerateNum.generateInt(0, args.length - 1);
            int temp = args[i];
            args[i] = args[index];
            args[index] = temp;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
    // 随机生成大小写字母a-z和A-Z
    public static void randomChar() {
        // A-Z: 65-90, a-z: 97-122
        int num = GenerateNum.generateInt(0, 51);
        char ch = (char) (num + (num < 26 ? 'A' : 'a' - 26));
        // 上一行代码 能否改成 char ch = (char) (num +  'A' ); 为什么?
        // 不能, 因为num的范围是0-51, 而'A'的ASCII码是65, 所以会超出范围
        System.out.println(ch);
    }
    public static void randomChar2() {
        char[] chs = new char[52];
        for (int i = 0; i < 26; i++) {
            chs[i] = (char) ('A' + i);
            chs[i + 26] = (char) ('a' + i);
        }
        System.out.println(chs);
        System.out.println(chs[GenerateNum.generateInt(0, 51)]);
    }
    // 将任意一个数字转换成数组
    public static void numToArray(int num) {
        int len = 0;
        for (int i = num; i > 0; i /= 10) {
            len++;
        }
        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void numToArray2(int num) {
        String str = String.valueOf(num);
        char[] chs = str.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
    }
    public static void numToArray3(int num) {
        //
    }
    //  将字符串倒序
    public static void reverseStr(String str) {
        char[] chs = str.toCharArray();
        for (int i = 0, j = chs.length - 1; i < j; i++, j--) {
            char temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
        }
        System.out.println(chs);
    }
}