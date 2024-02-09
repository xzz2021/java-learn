public class GetDistance {
//    通过坐标获取距离
    // 核心执行程序
    public static void main(String[] args) {
        Point p = new Point(3, 6);
        Point origin = new Point(0, 0);
        System.out.println(p.distance(origin));
    }
}
class Point {
    double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p) {
        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
    }
}
