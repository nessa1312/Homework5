public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }else{
            System.out.println("Возраст совершеннолетия не наступил, нужно еще подождать");
        }
        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }else if (age >= 18 && age < 24) {
            System.out.println("Человек ходит в университет");
        }else if (age>=24){
            System.out.println("Человек ходит на работу");
        }
        // Задание 3
        System.out.println("Задание 3");
        int capacity = 102;
        int seats = 60;
        int stay = capacity - seats;
        int seatsUsed = 45;
        int stayUsed = 25;
        if (seatsUsed<seats){
            System.out.println("Есть еще "+(seats-seatsUsed)+" сидячих мест");
        }else{
            System.out.println("Сидячих мест нет");
        }
        if (stayUsed<stay) {
            System.out.println("Есть еще " + (stay - stayUsed) + " стоячих мест");
        }else{
            System.out.println("Стоячих мест нет");
        }
        // Hw3 Задание 1
        System.out.println("Hw3 Задание 1");
        int yearsOld = 16;
        if (yearsOld>=2 && yearsOld<= 6){
            System.out.println("Если возраст человека равен "+yearsOld+" , то ему нужно ходить в детский сад");
        }else if(yearsOld>=6 && yearsOld<=18){
            System.out.println("Если возраст человека равен "+yearsOld+" , то ему нужно ходить в школу");
        }else if (yearsOld>=18 && yearsOld<=24){
            System.out.println("Если возраст человека равен "+yearsOld+" , то ему нужно ходить в университет");
        }else if (yearsOld>24){
            System.out.println("Если возраст человека равен "+yearsOld+" , то ему нужно ходить на работу");
        }

        // Hw3 Задание 2
        System.out.println("Hw3 Задание 2");
        if (yearsOld<5){
            System.out.println("Ребенок не может кататься на аттракционе");
        }else if (yearsOld <14){
            System.out.println("Ребенок может кататься только в сопровождении взрослого");
        }else{
            System.out.println("Ребенок может кататься без сопровождения взрослого");
        }
        // Hw3 Задание 3
        System.out.println("Hw3 Задание 3");
        int one = 8;
        int two = -19;
        int three = 98;
        if (one>two){
            if (one>=three) {
                System.out.println("Максимальное число - " + one );
            }else{
                System.out.println("Максимальное число - " + three);
            }
        }else if (two>one){
            if (two>=three) {
                System.out.println("Максимальное число - " + two);
            }else{
                System.out.println("Максимальное число - " + three);
            }
        }else{
            if (one>three){
                System.out.println("Максимальное число - " + one);
            }else if (three>one){
                System.out.println("Максимальное число - " + three);
            }else{
                System.out.println("Все три числа равны");
            }
        }
    }
}