package by.konstantinVKLcorporation.part2.lesson1;


public class Main {
    public static void main(String[] args) {

        Object[] participants = {new Cat(4, 13), new Robot(6, 10),
                new Human(4, 6)};
        Object[] obstacle = {new Treadmill(3), new Wall(9)};

        testing(participants, obstacle);
    }

    public static void testing(Object[] participants, Object[] obstacle) {

        for (int i = 0; i < participants.length; i++) {
            boolean level=true;
            if (participants[i] instanceof Cat) {
                for (int j = 0; j < obstacle.length&&level==true;j++ ) {

                    if (obstacle[j] instanceof Treadmill) {
                        if (((Cat) participants[i]).run() < ((Treadmill) obstacle[j]).setDistance()) ;
                        {
                            System.out.println(((Cat) participants[i]).run());
                            System.out.println(((Treadmill) obstacle[j]).setDistance());
                            System.out.println("Кот не справился с дистанцией");
                            level=false;
                            break;
                        }

                    }

                    if (obstacle[j] instanceof Wall) {
                        if (((Cat) participants[i]).jump() > ((Wall) obstacle[j]).setHeight());
                        {
                            System.out.println("Кот перепрыгнул стену");

                        }

                    } else {
                        System.out.println("Кот провалил задание");
                    }
                }

                if (participants[i] instanceof Robot) {

                }
                if (participants[i] instanceof Human) {

                }

            }
        }

    }

            }

