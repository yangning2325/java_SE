package danlimoshi;
class hero1{
    private  String name ;
    private  int age ;
    private  double height ;
    private static hero1 instance ;
    private hero1(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public static hero1 getInstance(String name, int age, double height){
        if(instance==null){
            instance = new hero1(name,age,height);
        }
        return instance ;
    }
}
public class Hero{
    public static void main(String[] args) {
    	hero1 h1 = hero1.getInstance("aaa",15,12.3);
    	hero1 h2 = hero1.getInstance("bbb",55,66.6);
        System.out.println(h1==h2);
    }
}
