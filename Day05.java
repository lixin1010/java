public class Day05 {
    public static void main(String[] args) {

        People p = new People("xiaoming",22);
//        People p1 = new People("lx");
//        People p2 = new People("lixin",18);
        System.out.println(p.getAge());
        System.out.println(p.getName());
    }
}

class People{
    private String name;
    private int age;
    public People(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }
}