package April_10_Homework.PolymorphismAndInheritance;

 public class Monster {
    private String name;

     public Monster(String attack) {
         this.name = name;
     }

    public String attack() {
         return "Attack Mode Activate";
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }

 class FireMonster extends Monster{

   public FireMonster(String name) {
       super(name);
   }

   public String attack() {
       return "Monster spits fire!";

   }

 }

class WaterMonster extends Monster{

    public WaterMonster(String name) {
        super(name);
    }

    public String attack() {
        return "Monster spits water!";

    }

}

class StoneMonster extends Monster{

    public StoneMonster(String name) {
        super(name);
    }

    public String attack() {
        return "Monster launches stones!";

    }

}