public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int age = 22;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия не наступил, нужно еще подождать");
        }
        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек ходит в университет");
        }
        if (age >= 24) {
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
        }
        if (seats == seatsUsed) {
            System.out.println("Сидячих мест нет");
        }
        if (stayUsed<stay) {
            System.out.println("Есть еще " + (stay - stayUsed) + " стоячих мест");
        }
        if (stay==stayUsed){
            System.out.println("Стоячих мест нет");
        }
    }
}