
public class Learn1 {
//    int a;  非静态成员变量
    static int a ; // 静态成员变量 会自动初始化默认值
    public static void main(String[] args) {
        // main 内无法直接访问非静态成员变量
//        int a;  // 此处变量不会自动初始化
        System.out.println(a);
    }
}