/**
 * Created by cnicholson12 on 6/24/2015.
 */

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JResortCalculator extends JFrame implements ItemListener {

    private JTextField resort = new JTextField("Resort Price Calculator");
    private JTextField basePrice = new JTextField("Base price for a room is $200");
    private JTextField options = new JTextField("Check the options you want.");
    private JTextField price = new JTextField();

    private JLabel weekendPremium = new JLabel("Weekend premium $100");
    private JLabel breakfast;
    private JLabel golf;


    public static void main(String[] args)
    {
        JFrame frame = new JResortCalculator();
        frame.setSize(300, 200);
        frame.setTitle("Resort Price Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    /**
     *
     * @param e
     */
    public void itemStateChanged(ItemEvent e)
    {

    }

    public JResortCalculator()
    {
        JPanel center = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel left = new JPanel(new FlowLayout(FlowLayout.LEFT));

        this.resort.setBorder(null);
        this.resort.setEditable(false);
        this.resort.setOpaque(false);

        this.basePrice.setBorder(null);
        this.basePrice.setEditable(false);
        this.basePrice.setOpaque(false);

        this.options.setBorder(null);
        this.options.setEditable(false);
        this.options.setOpaque(false);

        this.price.setBorder(null);
        this.price.setEditable(false);
        this.price.setOpaque(false);


        center.setPreferredSize(new Dimension(200, 200));

        center.add(this.resort);
        center.add(this.basePrice);
        center.add(this.options);
        center.add(this.price);

        left.add(this.weekendPremium);

        setLayout(new FlowLayout());
        add(center);
        add(left);
    }

}
