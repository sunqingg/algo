package sun;

public class SimpleClassToShowThis {
    public int a;
    public void test() {
        int a = 55;
        this.a = this.countArea(a);
        System.out.println("正方形的面积是： ");
        System.out.println(this.a);
    }
    public int countArea(int circumference) {
        int sideLength = circumference/4;
        int area = sideLength * sideLength;
        return area;
    }
}
