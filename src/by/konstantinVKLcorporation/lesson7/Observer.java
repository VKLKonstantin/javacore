package by.konstantinVKLcorporation.lesson7;



public class Observer {

    private int appetite;
    private int capacityPlate;
   private int fullness;
    public Observer(int appetite, int capacityPlate) {
        this.appetite = appetite;
        this.capacityPlate = capacityPlate;
    }


    public boolean checkCapacity(int appetite, int capacityPlate) {
        if (appetite < capacityPlate) {
        fullness = capacityPlate;
            return true;
        } else {
            System.out.println("Нужно больше пищи!");
            return false;
        }
    }

    public boolean checkFullness(int appetite, Plate plate) {
        if (fullness > appetite / 2) {
            System.out.println("Котик сыт ");
            return true;
        } else {
            System.out.println("Котик не сытый");
            return false;
        }
    }

}
