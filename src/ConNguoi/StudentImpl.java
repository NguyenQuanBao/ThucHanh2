package ConNguoi;

public class StudentImpl extends People implements Student {

    public StudentImpl(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void registerCourse(String course) {

    }

    @Override
    public void attendClass() {

    }

    @Override
    public void work() {
        System.out.println("Đang làm việc cấm làm phiền");
    }

    @Override
    public void takeABreak() {
        System.out.println("Đang nghỉ ngơi");
    }

    @Override
    public void eat() {
        System.out.println("Đang ăn");
    }

    @Override
    public void sleep() {
        System.out.println("Đang ngủ đừng gọi dậy");
    }

    @Override
    public void study() {
        System.out.println("Đừng làm phiền đang học");
    }
}
