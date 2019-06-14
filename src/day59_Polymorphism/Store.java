package day59_Polymorphism;

public class Store {
    public static void main(String[] args) {
        HairSpray hp=new HairSpray();
        hp.catchFire();

        Flammable hairSp=new HairSpray();
        hairSp.catchFire();

        Flammable pTank=new PropaneTank();
        pTank.catchFire();
    }

}
