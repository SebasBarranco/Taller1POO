public class Main {
    public static void main(String[] args) {
        Person persona1 = new Person("Maria", 35, 'F');
        persona1.setWeight(55);
        persona1.setHeight(1.60);

        Person persona2 = new Person("Juan", 28, 'M');
        persona2.setWeight(70);
        persona2.setHeight(1.75);

        Person persona3 = new Person("Elena", 40, "9876543210", 'F', 65, 1.70);

        System.out.println("Information of the first person:");
        System.out.println(persona1.toString());
        System.out.println("BMI: " + persona1.calculateBMI());
        System.out.println("Is adult: " + persona1.isAdult());
        System.out.println();

        System.out.println("Information of the second person:");
        System.out.println(persona2.toString());
        System.out.println("BMI: " + persona2.calculateBMI());
        System.out.println("Is adult: " + persona2.isAdult());
        System.out.println();

        System.out.println("Information of the third person:");
        System.out.println(persona3.toString());
        System.out.println("BMI: " + persona3.calculateBMI());
        System.out.println("Is adult: " + persona3.isAdult());
        System.out.println();
    }
}
