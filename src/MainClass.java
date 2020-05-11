public class MainClass {

    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Козлик", 10), new Cat("Пицца", 15), new Cat("Цыга", 15)};
        Plate plate = new Plate(14);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("increase food by 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }


    }

}