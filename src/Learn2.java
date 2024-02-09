// 类型转换 补位
public class Learn2 {

    public static void main(String[] args) {
        //  byte a = 12;
        // a = a + 1; // 编译错误, 因为 a + 1 是 int 类型, 不能直接赋值给 byte 类型
        byte b = 12;
        int a = 0;
        a = a + b; // 正确, 因为 b 是 byte 类型, a + b 是 int 类型, 可以直接赋值给 int 类型
        // 内存空间小的 可以 自动补位
        System.out.println(a);
        byte c = 3;
        c += 3; // 正确, 因为 c += 3 相当于 c = (byte)(c + 3), 会自动进行类型转换; 但是值超出127的话会丢失精度
//        c= c+ 3;
        System.out.println(c);
    }
}