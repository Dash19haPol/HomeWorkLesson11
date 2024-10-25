package app;

public class Person {
    public String name;
    public int age;
    public String profession;



    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void ChangeProfession(String profession){
        this.profession = profession;
    }


    @Override
    public String toString() {
        return
                "Ім'я: " + name +
                ", Вік: " + age +
                ", Професія: " + profession
                ;
    }
}
