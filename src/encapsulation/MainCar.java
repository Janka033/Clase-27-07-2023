package encapsulation;

import javax.swing.*;
import java.awt.*;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlate(JOptionPane.showInputDialog("Placa 1 :"));
        car.setColor(JOptionPane.showInputDialog("Color :"));
        car.setModel(Integer.parseInt(JOptionPane.showInputDialog("Module :")));
        JOptionPane.showMessageDialog(null,car.getPlate());
        JOptionPane.showMessageDialog(null,car.getColor());
        JOptionPane.showMessageDialog(null,car.getModel());
    }
}
