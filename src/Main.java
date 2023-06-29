// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        byte airTemperature = 0;
        if (airTemperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speed = 220;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " придется заплатить штраф.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int agePerson = 60;
        boolean baby = agePerson < 2;
        boolean preschooler = agePerson >= 2 && agePerson <= 6;
        boolean schoolboy = agePerson >= 7 && agePerson <= 18;
        boolean student = agePerson >= 18 && agePerson < 24;
        boolean worker = agePerson >= 24 && agePerson <= 60;
        if (baby) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора спать.");
        } else if (preschooler) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");
        } else if (schoolboy) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");
        } else if (student) {
            System.out.println("Если возраст человека равен " + agePerson + ", то его место в университете.");
        } else if (worker) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему пора ходить на работу.");
        } else {
            System.out.println("Если возраст человека равен " + agePerson + ", то он может отдохнуть.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int ageOfTheChild = 3;
        boolean itIsForbidden = ageOfTheChild < 5;
        boolean toRideToRideAccompanied = ageOfTheChild >= 5 && ageOfTheChild < 14;
        if (itIsForbidden) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + ", то ему нельзя кататься на аттракционе.");
        } else if (toRideToRideAccompanied) {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + ", то ему можно кататься на аттракционе в сопровождении.");
        } else {
            System.out.println("Если возраст ребенка равен " + ageOfTheChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }
    }


    public static void task6() {
        System.out.println("Задача 6");
        int totalSeats = 102;
        int seating = 61;
        int seatsStanding = 52;
        boolean freeSeating = seating > 0 && seating <= 60;
        boolean freeSeatsStanding = seatsStanding > 0 && seatsStanding <= (totalSeats - 60);
        if (freeSeating) {
            System.out.println("Сидячих мест в вагоне " + (60 - seating));
        }
        if (freeSeatsStanding) {
            System.out.println("Стоячих мест в вагоне " + (totalSeats - 60 - seatsStanding));
        } else {
            System.out.println("Свободных мест нет.");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 11;
        int two = 3;
        int three = 12;
        boolean abc = one > two && one > three;
        boolean bc = two > three;
        if (abc) {
            System.out.println("Большее число " + one);
        } else if (bc) {
            System.out.println("Большее число " + two);
        } else {
            System.out.println("Большее число " + three);
        }

    }
}