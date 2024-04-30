// 判断是否为回文数字
public class isPalindromeNumber {
    public static void main(String[] args) {

        System.out.println(fn1(12321));

    }

    public static boolean fn1(int num){
        int temp = num;
        int newNum = 0;
        while (num != 0) {  // 当循环到第一位数字时  余数就是0
            int lastNum = num % 10; //  通过取余数获取当前循环时数字的最后一位
            newNum = newNum * 10 + lastNum;  // 上一次的得到的新数字进一位  加上当前位
            num = num / 10; // 整数除以整数  会返回整数  去除当前num的最后一位
        }
        System.out.println(newNum);
        return newNum == temp;
    }

}
