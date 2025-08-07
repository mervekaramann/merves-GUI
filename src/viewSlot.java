import javax.swing.*;
import java.awt.*;

public class viewSlot extends JFrame {
    public viewSlot() {
        JPanel panel = new JPanel();
        JButton clear = new JButton("Clear all slots");
        this.add(panel);
        this.add(clear);
        clear.setBounds(170, 400, 150, 30);
        clear.setFont(new Font("Calibri", Font.PLAIN, 20));
        this.setSize(500, 500);
        String slots[]={"Slot 1", "Slot 2", "Slot 3","Slot 4", "Slot 5", "Slot 6","Slot 7", "Slot 8", "Slot 9","Slot 10"};
        JList <String> list=new JList<>(slots);
        JScrollPane slotlist = new JScrollPane(list);
        this.add(slotlist);
        clear.addActionListener(e -> {
            JOptionPane.showMessageDialog(viewSlot.this, "Slot cleared");
        });
        list.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if ((index + 1) % 2 == 0) {
                    label.setBackground(Color.RED);
                    label.setForeground(Color.WHITE);
                    label.setFont(new Font("Calibri", Font.BOLD, 20));

                } 

                if (isSelected) {
                    label.setBackground(label.getBackground().darker());
                }
                return label;
            }
        });
        list.setFont(new Font("Calibri", Font.ITALIC, 20));
    }
}

