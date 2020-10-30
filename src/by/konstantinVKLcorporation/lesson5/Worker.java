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
                    }

        return false;
    }
    public int getAge() {
        return age;
    }

    public void printInformation() {
        System.out.printf("Имя пользователя: %s"  + "; Должность: %s" + ";" + "Email: %s" + "; Телефон: %s"
                 + "; Зарплата: %s" + ";" + " Возраст: %s %n" ,name ,position,email,telephone,salary, age);
    }

}
