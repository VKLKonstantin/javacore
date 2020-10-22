package by.konstantinVKLcorporation.lesson5;


public class Worker {

    private String name;
    private String position;
    private String email;
    private int telephone;
    private int salary;



    private int age;

    public Worker(String name, String position, String email, int telephone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }
    public boolean setAge(int age) {
        if(age<18||age>65){
            age=0;
            System.out.println("Введите корректные данные");
            return false;
        }
        return true;
    }
    public int getAge() {
        return age;
    }

    public void information() {
        System.out.println("Имя пользователя: " + name + "; Должность: " + position + ";" + "; Email: " + email + "; Телефон: "
                + telephone + "; Зарплата: " + salary + ";" + " Возраст: " + age);
    }

}
