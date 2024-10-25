package app;

public class HomeWorkLesson11 {
    public static void main(String[] args) {
        System.out.print("1. ");
        Person john = new Person("John", 30, "Інженер");
        System.out.println(john);
        Person mary = new Person("Mary", 25, "Вчитель");
        System.out.println(mary);
        Person bob = new Person("Bob", 35, "Лікар");
        System.out.println(bob);

        System.out.println();
        System.out.println();

        System.out.print("2. ");
        Person alice = new Person("Alice", 28, "Архітектор");
        System.out.println(alice);
        alice.ChangeProfession("Дизайнер");
        System.out.println("(Після оновлення професії)");
        System.out.println(alice);


    }
}
