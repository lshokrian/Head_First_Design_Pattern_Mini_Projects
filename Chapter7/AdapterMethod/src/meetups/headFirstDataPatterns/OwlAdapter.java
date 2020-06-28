package meetups.headFirstDataPatterns;

public class OwlAdapter implements Duck {
    Owl owl;

    public OwlAdapter(Owl owl) {
        this.owl = owl;
    }

    public void quack() {
        owl.howl();
    }

    public void fly() {
        owl.fly();
    }
}
