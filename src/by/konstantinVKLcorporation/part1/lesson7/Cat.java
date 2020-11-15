package by.konstantinVKLcorporation.part1.lesson7;

public class Cat {

    private String name;
    private int appetite;



    public boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;//сытость
    }

    public int eat(Plate plate,  int appetite) {
if (plate.decreaseFood(appetite)>0){// в тарелке есть еда, но кот сыт

    return this.appetite=-1;//для вызова другого кота
}
else {
    this.appetite=Math.abs(plate.getCapacityPlate());//передать остаток аппетита

    return  this.appetite;
}


    }
    /*public boolean isFullness() {
        return fullness;
    }*/

    public int getAppetite() {
        return appetite;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", fullness=" + fullness +
                '}';
    }
    public void setFullness(boolean fullness) {
        this.fullness = fullness;
    }
    public boolean isFullness() {
        return fullness;
    }

    public String getName() {
        return name;
    }

}
