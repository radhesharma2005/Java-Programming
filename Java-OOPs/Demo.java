class Student{
    String name;
    int rollno;
    int marks;

    Student(String n,int r,int m){
        this.name=n;
        this.rollno=r;
        this.marks=m;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Roll no : " + rollno);
        System.out.println("Marks : " + marks);
    }
}
public class Demo{
    public static void main(String[] args) {
        Student s1 =new Student("Radheshyam Sharma",13,95);
        s1.display();
    }
}
