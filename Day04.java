public class Day04 {
    public static void main(String[] args) {
        Person_1118 lx = new Person_1118();
//        lx.setBirth(2001);
//        System.out.println(lx.getAge());
        lx.setNameAndAge("lx",33);
        System.out.println(lx.getName());
        System.out.println(lx.getAge());
    }
}

class Person_1118{
    private String name;
//    private int birth;
    private int age;
//    public void setBirth(int birth){
//        this.birth = birth;
//    }
    private void setAge(int age){
        this.age = age;
    }
    private void setName(String name){
        this.name = name;
    }
//    public int getAge(){
//        return calcAge(2024);
//    }
//    private int calcAge(int currentYear){
//        return currentYear-this.birth;
//    }
    public void setNameAndAge(String name,int age){
        setAge(age);
        setName(name);
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}