public class FizzBuzz {
    private int sn;
    private int en;

    public FizzBuzz() {
        this(2, 20);
    }
    public FizzBuzz(int sn, int en) {
        this.sn = sn;
        this.en = en;
    }
    public int getSn() {
        return sn;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }
    public void checkFizzBuzz(FizzBuzz fb) {
        this.sn = fb.sn;
        this.en = fb.en;
        for (int i = sn; i <= en; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
                System.out.print("\n");
            } else {
                System.out.println(i);
            }
        }
    }
    @Override
    public String toString() {
        return "From FizzBuzz Class: start number is " + sn + ", and end number is " + en;
    }
}
class FizzBuzzTester{
    public static void main(String[] args) {
        FizzBuzz fb1 = new FizzBuzz();
        System.out.println(fb1);
        fb1.checkFizzBuzz(fb1);


    }
}
