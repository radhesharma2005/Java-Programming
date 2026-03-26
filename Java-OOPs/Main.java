class MethodOverlading{
    String name;
    String school;
    int weight;
    int age;
    void Student(String n,String s,int w){
        this.name=n;
        this.school=s;
        this.weight=w;
        System.out.println("Name :" + name);
        System.out.println("School :" + school);
        System.out.println("weight :" + weight);
    }
    void Student(String n,int a,int w){
        this.name=n;
        this.age=a;
        this.weight=w;
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("weight :" + weight);
    }}
public class Main{
    public static void main(String[] args) {
        MethodOverlading m1 = new MethodOverlading();
        m1.Student("Radheshyam Sharma","St.Xavier High School",76);
        MethodOverlading m2 = new MethodOverlading();
        m2.Student("Radheshyam Sharma",21,76);
    }}