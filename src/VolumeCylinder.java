import java.util.Scanner;
public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius:");
        double radius = scanner.nextDouble();

        System.out.println("Height");
        double height = scanner.nextDouble();

        double cylinderVolume = (3.142)*(radius*radius)*(height);
        System.out.println("Volume is "+cylinderVolume);
    }
}
