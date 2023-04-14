package April_10_Homework.PolymorphismAndInheritance;

public class Main {
    public static void main(String[] args) {

        Monster m1 = new FireMonster("Fire Monster");
        Monster m2 = new WaterMonster("Water Monster");
        Monster m3 = new StoneMonster("Stone Monster");

        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        Monster m4 = new StoneMonster("Loch Ness Monster"); // upcast
        System.out.println(m4.attack()); // Run StoneMonster's attack()

        //Monster m4 = new Monster("Rawr");
        System.out.println(m4.attack());

    }
}
