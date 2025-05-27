public class Sample {
    public int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        Sample obj = new Sample();
        int result = obj.square(5);
        System.out.println("Square of 5 is: " + result);
    }
}
