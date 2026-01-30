class Student7 {
    int id;
    String name;

   
    Student7(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student7 s1 = new Student7(101, "pavan");
        Student7 s2 = new Student7(102, "salman");

        s1.display();
        s2.display();
    }
}