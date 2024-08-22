

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(34, 134)) {
            System.out.println("Случайное число: " + r);
            if (r == 134) {
                System.out.println("Выпало число " + r + ", давайте на этом закончим");
                break;
            }
        }
    }
}