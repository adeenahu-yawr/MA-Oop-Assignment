public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
            System.out.println("Invalid age entered!");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Sara");
        p1.setAge(25);

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}
