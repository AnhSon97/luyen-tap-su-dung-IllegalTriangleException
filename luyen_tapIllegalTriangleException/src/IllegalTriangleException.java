
public class IllegalTriangleException {
    private int a,b,c;
    public void addNumber(int a, int b, int c) throws Exception{
        if ((a == 0) || (b == 0) || (c == 0) || a >= b+c || b >= a +c || c >= a + b) throw  new Exception();
        this.a = a;
        this.b = b;
        this.c = c;
    }
}

class test{
    public static void main(String[] args) {
        try {
            IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
            illegalTriangleException.addNumber(3,2,3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}