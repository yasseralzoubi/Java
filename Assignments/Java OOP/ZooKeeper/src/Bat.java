public class Bat extends  Mammal{
    public  Bat(){
        this.energyLevel = 300;

    }
    public void  fly(){
        this.energyLevel -=50;
        System.out.println("The Bat is now airborne");
    }
    public void eatHumans(){
        this.energyLevel +=25;
        System.out.println("The Bat is now satisfied");


    }
    public void attackTown(){
        this.energyLevel -=100;
        System.out.println("The Bat attacks the town");
    }

}
