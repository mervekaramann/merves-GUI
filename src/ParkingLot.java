import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParkingLot extends JPanel {
    JPanel panel1;
    public ParkingLot(){
        this.add(panel1);
        this.setSize(800, 600);
        JButton addVehicle = new JButton("Add Vehicle");
        JButton removeVehicle = new JButton("Remove Vehicle");
        JLabel parkingLotLabel = new JLabel("Welcome to MerveLot");
        JButton viewSlots= new JButton("View Slots");
        JTextField plateNumberField = new JTextField(10);
        JLabel enterPlate=new JLabel("Enter plate: ");
        this.add(addVehicle);
        this.add(removeVehicle);
        this.add(plateNumberField);
        this.add(enterPlate);
        this.add(parkingLotLabel);
        this.add(viewSlots);
        addVehicle.setBounds(220,300,150,50);
        removeVehicle.setBounds(385,300,150,50);
        plateNumberField.setBounds(350,200,150,50);
        plateNumberField.setFont(new Font("Serif", Font.PLAIN, 20));
        this.setLayout(null);
        parkingLotLabel.setBounds(10, 10, 100, 20);
        parkingLotLabel.setSize(200,100);
        parkingLotLabel.setLocation(285,100);
        viewSlots.setBounds(220,360,315,50);
        Font newFont = new Font("Calibri", Font.BOLD, 20); //
        ((AbstractDocument) plateNumberField.getDocument()).setDocumentFilter(new toUpper.UppercaseFilter());
        parkingLotLabel.setFont(newFont);
        enterPlate.setFont(newFont);
        enterPlate.setBounds(250,200,150,50);
        addVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel1, "Vehicle parked to slot xx!");
            }
        });
        removeVehicle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code runs when button is clicked
                JOptionPane.showMessageDialog(panel1, "Vehicle removed from slot xx!");
            }
        });
        viewSlots.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code runs when button is clicked
                viewSlot viewSlot = new viewSlot();
                viewSlot.setVisible(true);

            }
        });






    }
}

