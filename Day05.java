public class Day05 {
    public static void main(String[] args) {

        People p = new People();
        People p1 = new People("lx");
        People p2 = new People("lixin",18);
    }
}

class People{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public People(String name) {
        this(name, 18); // 调用另一个构造方法Person(String, int)
    }

    public People() {
        this("Unnamed"); // 调用另一个构造方法Person(String)
    }

}