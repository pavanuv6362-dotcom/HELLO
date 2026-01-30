class code5{
     
    public static int add(int a, int b) {
        return a + b;
    }

    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        int sum1 = add(5, 10);
        int sum2 = add(2, 4, 6); 
        double sum3 = add(3.5, 4.5); 

        System.out.println("Sum of 5 and 10: " + sum1);
        System.out.println("Sum of 2, 4, and 6: " + sum2);
        System.out.println("Sum of 3.5 and 4.5: " + sum3);
    }
}
