class Student {
    private int id;   // private data

    public void setId(int id) {   // setter
        this.id = id;
    }

    public int getId() {          // getter
        return id;
    }
}

public class code6{
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        System.out.println(s.getId());
    }
}
