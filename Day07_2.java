public class Day07_2 {
    public static void main(String[] args) {
        Person_1216_2 ming = new Person_1216_2();
        Person_1216_2 hong = new Person_1216_2();
        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("Xiao", "Hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}
class Person_1216_2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setName(String name1,String name2){
        this.name = name1+" "+name2;
//        this.name2 = name2;
    }
}