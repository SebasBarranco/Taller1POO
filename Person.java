
import java.util.Random;

public class Person {
    private static final char DEFAULT_SEX = 'H';
    private static final int UNDERWEIGHT = -1;
    private static final int NORMAL_WEIGHT = 0;
    private static final int OVERWEIGHT = 1;

    private String name;
    private int age;
    private String id;
    private char sex;
    private double weight;
    private double height;

    public Person() {
        this.name = "";
        this.age = 0;
        this.id = generateID();
        this.sex = DEFAULT_SEX;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, int age, char sex) {
        this();
        this.name = name;
        this.age = age;
        this.sex = validateSex(sex);
    }

    public Person(String name, int age, String id, char sex, double weight, double height) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.sex = validateSex(sex);
        this.weight = weight;
        this.height = height;
    }

    public int calculateBMI() {
        double bmi = weight / (height * height);
        if (bmi < 20) {
            return UNDERWEIGHT;
        } else if (bmi >= 20 && bmi <= 25) {
            return NORMAL_WEIGHT;
        } else {
            return OVERWEIGHT;
        }
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public char validateSex(char sex) {
        if (sex == 'H' || sex == 'M') {
            return sex;
        } else {
            return DEFAULT_SEX;
        }
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "ID: " + id + "\n" +
                "Sex: " + sex + "\n" +
                "Weight: " + weight + "\n" +
                "Height: " + height;
    }

    private String generateID() {
        Random rnd = new Random();
        StringBuilder id = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            id.append(rnd.nextInt(10));
        }
        return id.toString();
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
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = validateSex(sex);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

