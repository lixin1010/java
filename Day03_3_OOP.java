public class Day03_3_OOP {
    public static void main(String[] args) {
//        City bj = new City();
//        bj.name = "Beijing";
//        bj.latitude = 39.903;
//        bj.longitude = 116.401;
//        System.out.println(bj.name);
//        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
        Person ming = new Person();
        ming.setName("miaowing");
        ming.setAge(14);
        String name_m = ming.getName();
        System.out.println(name_m);
    }
}
class City{
    public String name;
    public double latitude;
    public double longitude;

}

class Person{
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name==null||name.isBlank()){
            throw new IllegalArgumentException("invalid name");
        }
        this.name=name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age<0||age>100){
            throw new IllegalArgumentException("invalid age value");
        }
        this.age=age;
    }
}