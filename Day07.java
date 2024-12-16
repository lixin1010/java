public class Day07 {
    public static void main(String[] args) {
        Person_1216 p = new Person_1216("lixin",33);
        Person_1216 p1 = new Person_1216();
    }
}

class Person_1216{
    String name;
    int age;
//    public Person_1216(){
//
//    }
    public Person_1216(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public Person_1216(String name){
        this(name,18);
    }
    public Person_1216(){
        this("unamed");
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
