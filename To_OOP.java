import java.util.Scanner;

public class To_OOP {
    public static void main(String[] args) {
//        System.out.println("Noting");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入name：");
        String name = scanner.nextLine();
        System.out.println("input age:");
        int age = scanner.nextInt();
//        Book book1 = new Book();
//        book1.name="test";
//        book1.author="lixin";
//        book1.isbn="122344";
//        System.out.println(book1.author);
//        System.out.println(book1.isbn);
//        System.out.println(book1.name);
        Person_p person1 = new Person_p();
        person1.setAge(age);
        person1.setName(name);
        System.out.println(person1.getName()+"的年龄"+person1.getAge());
//        System.out.println(person1.getName());
    }
}
//class Book{
//    private String name;
//    private String author;
//    public String isbn;
//}
class Person_p{
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if(age<0||age>100){
            throw new IllegalArgumentException("Invalid age value");
        }
        this.age = age;
    }
}
