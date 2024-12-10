public class Gorilla extends  Mammal{
    public Gorilla(){
        super();
    }

    //if I convert it to protect it will access directly on subclass without set
    public void throwSomething(){
        this.energyLevel -=5;
        System.out.println("the gorilla has thrown something");
    }
    public void eatBananas(){
        this.energyLevel +=10;
        System.out.println("The Gorilla is satisfied ");
    }
    public void climb(){
        this.energyLevel -=10;
        System.out.println("The gorilla has climed a tree");
    }
}
