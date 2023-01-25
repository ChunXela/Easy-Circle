import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many circles do you want to make?");
        int amount = sc.nextInt();
        for (int i = 0; i < amount; i++) {
            System.out.println("What radius do you want? leave blank for 1");
            int r = sc.nextInt();
            Circle circle = new Circle(r);

            if (r <= 1) {
                circle = new Circle();
            } else if (r > 1) {
                circle = new Circle(r);
            }

            System.out.println("What do you want to do now?");
            System.out.println("1. Get radius 2. Change radius 3. Get area 4. Get circomference");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println(circle.getRadius());
                    break;

                case 3:
                    System.out.println(circle.getArea());
                    break;

                case 4:
                    System.out.println(circle.getCircomference());
                    break;

                case 2:
                    System.out.println("What do you want the radius to be?");
                    r = sc.nextInt();
                    circle.setRadius(r);

                default:
                    System.out.println("1. Get radius 2. Change radius 3. Get area 4. Get circomference");
                    option = sc.nextInt();

            }

        }

    }
}
