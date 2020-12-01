package by.konstantinVKLcorporation.part1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class Graphics extends JFrame {

    JPanel menu, playZone, controlZone;
    JButton button;
    JComboBox sizePlaySelect;
    JButton start;
    int value;
    boolean flag=true;
    ImageIcon myIcon;
    public Graphics() {

        setTitle("Game");
        setBounds(0, 0, 500, 500);
        setMaximumSize(new Dimension(500, 500));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);









        menu = new JPanel(new FlowLayout());
        playZone = new JPanel(new GridLayout());
        controlZone = new JPanel(new BorderLayout());


       /* button=new JButton();

       button.setPreferredSize(new Dimension(50,50));
button.setBackground(Color.BLUE);
        playZone.add(button);*/


        menu.setBounds(0, 0, 500, 30);
        playZone.setBounds(0, 30, 500, 400);
        controlZone.setBounds(0, 430, 500, 30);

        String[] itemsSize = {"3", "4", "5", "6", "7"};
        String[] itemsFishka = {"3", "4", "5", "6"};

        JComboBox sizePlaySelect = new JComboBox(itemsSize);
        JComboBox countFishkaSelect = new JComboBox(itemsFishka);
        JLabel sizePlay = new JLabel("размер игрового поля");
        JLabel countFishka = new JLabel("количество фишек для победы");


        sizePlaySelect.setToolTipText("выберите размер игрового поля");
        menu.add(sizePlay);
        menu.add(sizePlaySelect);
        menu.setBackground(Color.GRAY);
        menu.add(countFishka);
        menu.add(countFishkaSelect);

        playZone.setBackground(Color.GREEN);
        controlZone.setBackground(Color.GRAY);
        add(menu);
        add(playZone);
        add(controlZone);


        start = new JButton();
        controlZone.add(start, BorderLayout.EAST);

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Integer.valueOf(sizePlaySelect.getSelectedItem().toString());
                playZone.setLayout(new GridLayout(value, value));

                createField(value);

            }
        });

        setVisible(true);
    }


    public void createField(int value) {
        for (int i = 0; i < value * value; i++) {
            URL logo1 = getClass().getResource("krestik.jpg");
            int buttonHeight = 10;
            int buttonWidth = 10;

            JButton button = new JButton();
            button.setIcon (new ImageIcon(logo1));
playZone.add(button);

        }
    }
   /* @Override
    public void paint(java.awt.Graphics graphics) {
        super.paint(graphics);
        if (flag) {
            Graphics2D g2d = (Graphics2D) graphics;
            g2d.setStroke(new BasicStroke(10));
            g2d.setColor(Color.BLUE);
            g2d.drawLine(0, 0, this.getWidth(), this.getHeight());
            g2d.drawLine(this.getWidth(), 0,  0, this.getHeight());
        }
    }*/

    public static void main(String[] args) {
        new Graphics();
    }


}
