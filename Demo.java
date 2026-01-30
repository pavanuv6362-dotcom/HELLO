class Demo {
    int x, y;

    Demo() {
        x = 0;
        y = 0;
    }

    Demo(int a) {
        x = a;
        y = a;
    }

    Demo(int a, int b) {
        x = a;
        y = b;
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(5);
        Demo d3 = new Demo(5, 10);

        System.out.println(d1.x + " " + d1.y);
        System.out.println(d2.x + " " + d2.y);
        System.out.println(d3.x + " " + d3.y);
    }
}