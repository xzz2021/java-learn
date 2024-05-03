package top.xzz2022.random;
//  创建自定义包package
import java.util.Random;

public class GenerateNum {
    public void main(String[] args) {
    }
    public static int generateInt(int min, int max){
        Random num = new Random();
        // 因为nextInt()方法生成的随机数是左闭右开区间, 所以要加1
        // 从而生成[min, max]区间都包含的随机数
        return num.nextInt(max - min + 1) + min;
    }
}



