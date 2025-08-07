import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Parking Lot");
        ParkingLot lot = new ParkingLot();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(lot, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}