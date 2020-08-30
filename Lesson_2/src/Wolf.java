public class Wolf {
    private PersonSex sex = PersonSex.MALE;
    private String name = "Doggy";
    private int age = 2;
    private String color = "black";

    public void walk() {
        System.out.println("* walking *");
    }

    public void sit() {
        System.out.println("* sitting *");
    }

    public void run() {
        System.out.println("* running *");
    }

    public void howl() {
        System.out.println("* howling *");
    }

    public void hunt() {
        System.out.println("* hunting *");
    }

    /* Getters & Setters */

    public PersonSex getSex() {
        return sex;
    }

    public void setSex(PersonSex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Incorrect age! Age must be less than 8");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
