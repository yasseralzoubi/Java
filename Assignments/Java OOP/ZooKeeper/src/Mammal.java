public class Mammal {
    protected int energyLevel;



    //constructor
    public  Mammal(){
        this.energyLevel =100;

    }


    public int displayEnergy(){
        System.out.println(energyLevel);
        return this.energyLevel;
    }

    public int getEnergyLevel(){
        return this.energyLevel;
    }
    //set should void

    public  void setEnergyLevel(int energyLevel){
        this.energyLevel = energyLevel;

    }



}
