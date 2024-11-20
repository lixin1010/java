public class Day05 {
    public static void main(String[] args) {
        Person_1119 per = new Person_1119();
        per.Person_1("lx",33);
        per.Person_1("lxx");
        per.Person_1();
    }
}

class Person_1119{
    String name;
    int age;
    public void Person_1(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(1);
    }
    public void Person_1(String name){
        this.name = name;
        this.age = 20;
        System.out.println(2);
    }
    public void Person_1(){
        System.out.println(3);
    }

}