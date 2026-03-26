class SuperClass{
    String name;
    int age;
    int rollno;
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll no  : " + rollno);
    }}
class Single extends SuperClass{
    void Student(String n,int a,int r){
        this.name=n;
        this.age=a;
        this.rollno=r;
    }}
class MultiLevel extends Single{
    void Student2(String n,int a,int r){
        this.name=n;
        this.age=a;
        this.rollno=r;
    }}
public class Demo1{
    public static void main(String[] args) {
        MultiLevel m1 = new MultiLevel();
        m1.Student("Radheshyam", 21, 13);
        m1.display();
        MultiLevel m2 = new MultiLevel();
        m2.Student2("Pritam", 20, 12);
        m2.display();      }}