package top.xzz2022.random;
//  创建自定义包package
import java.util.Random;

public class GenerateNum {
    public void main(String[] args) {
    }
    public static int generateInt(int min, int max){
        Random num = new Random();
        return num.nextInt(max - min + 1) + min;
    }
}



