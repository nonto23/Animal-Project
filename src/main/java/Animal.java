public class Animal {
    private String name;

    public Animal(){

    }
    public Animal(String name){
        this.name=name;

    }
    public void setName(String name){
        this.name=name;

    }
    public void sound(){
        System.out.println("sound.....");
    }
    public void eat(){
        System.out.println(name+" eats...");
    }

    public String getName() {
        return name;
    }
}