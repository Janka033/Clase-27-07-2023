package encapsulation;

import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setAddress(JOptionPane.showInputDialog("Enter the address: "));
        agency.setAgentName(JOptionPane.showInputDialog("Name of the Agency: "));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Price: ")));
        JOptionPane.showMessageDialog(null,"Name of the Agency "+agency.getAgentName()+" and it's address is "+ agency.getAddress()+" and it's price is :"+agency.getPrice());
    }
}
