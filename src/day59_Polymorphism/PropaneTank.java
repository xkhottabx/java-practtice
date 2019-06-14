package day59_Polymorphism;

public class PropaneTank implements Flammable {

    @Override
    public void catchFire() {
        System.out.println("PROPANE TANK");
    }
}
