package by.konstantinVKLcorporation.lesson7;

public class Plate {

    private int capacityPlate;

    public Plate(int capacityPlate) {

        this.capacityPlate = capacityPlate;
    }

    public int getCapacityPlate() {

        return capacityPlate;
    }

    public int decreaseFood(int appetite) {
        capacityPlate = capacityPlate - appetite;
        if(capacityPlate>=0){
          //  System.out.println("В тарелке осталось"+capacityPlate);
        }
        else {
            //System.out.println("Тарелка пуста, но кот не сыт");
        }
                    return  capacityPlate;



    }

    public void printInfo() {

        System.out.println("тарелка: " + capacityPlate);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "capacityPlate=" + capacityPlate +
                '}';
    }


}
