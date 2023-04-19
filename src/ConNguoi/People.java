package ConNguoi;

public abstract class People {
    private String name = "Ten" ;
    private int age = 18 ;
    private boolean gender = true ;

    public People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void study();

}
