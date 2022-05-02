import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class D1051712_3 {
    public static void main(String[] args) {
        MainFrame3 mFrm3 = new MainFrame3();
        mFrm3.setVisible(true);
    }
}

class MainFrame3 extends JFrame{
    private JLabel jlb = new JLabel( "(*oo*)");
    private JButton jbtn1 = new JButton( "↑");
    private JButton jbtn2 = new JButton( "↓");
    private JButton jbtn3 = new JButton( "←");
    private JButton jbtn4 = new JButton( "→");
    private JButton jbtn5 = new JButton( "zoom in");
    private JButton jbtn6 = new JButton( "zoom out");
    private JButton jbtn7 = new JButton( "↖");
    private JButton jbtn8 = new JButton( "↗");
    private JButton jbtn9 = new JButton( "↙");
    private JButton jbtn10 = new JButton( "↘");
    private JButton jbtn11 = new JButton( "Exit");
    public MainFrame3(){
        init();
    }

    private int x = 0, y = 0, w = 80, h = 35, a = 20;

    private void init(){
        Container cp = this.getContentPane();
        this.setBounds(100, 100, 615, 840);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(null);
        jlb.setBounds(x, y, w, h);
        jlb.setOpaque(true);
        jlb.setBackground(new Color(128, 228, 228));
        jlb.setHorizontalAlignment(JLabel.CENTER);
        jlb.setFont(new Font(null, Font.PLAIN, a));

        jbtn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                y -= 7;
                jlb.setLocation(x, y);
            }
        });
        jbtn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                y += 7;
                jlb.setLocation(x, y);
            }
        });
        jbtn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                x -= 16;
                jlb.setLocation(x, y);
            }
        });
        jbtn4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                x += 16;
                jlb.setLocation(x, y);
            }
        });
        jbtn5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                w /= 0.9;
                h /= 0.9;
                a /= 0.9;
                jlb.setSize(w, h);
                jlb.setFont(new Font(null, Font.PLAIN, a));
            }
        });
        jbtn6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                w *= 0.9;
                h *= 0.9;
                a *= 0.9;
                jlb.setSize(w, h);
                jlb.setFont(new Font(null, Font.PLAIN, a));
            }
        });
        jbtn7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                y -= 7;
                x -= 16;
                jlb.setLocation(x, y);
            }
        });
        jbtn8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                y -= 7;
                x += 16;
                jlb.setLocation(x, y);
            }
        });
        jbtn9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                y += 7;
                x -= 16;
                jlb.setLocation(x, y);
            }
        });
        jbtn10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                y += 7;
                x += 16;
                jlb.setLocation(x, y);
            }
        });
        jbtn11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.exit(0);
            }
        });

        jbtn1.setBounds(5,690,90,50);
        jbtn2.setBounds(105,690,90,50);
        jbtn3.setBounds(205,690,90,50);
        jbtn4.setBounds(305,690,90,50);
        jbtn5.setBounds(405,690,90,50);
        jbtn6.setBounds(505,690,90,50);
        jbtn7.setBounds(5,745,90,50);
        jbtn8.setBounds(105,745,90,50);
        jbtn9.setBounds(205,745,90,50);
        jbtn10.setBounds(305,745,90,50);
        jbtn11.setBounds(405,745,90,50);

        cp.add(jlb);
        cp.add(jbtn1);
        cp.add(jbtn2);
        cp.add(jbtn3);
        cp.add(jbtn4);
        cp.add(jbtn5);
        cp.add(jbtn6);
        cp.add(jbtn7);
        cp.add(jbtn8);
        cp.add(jbtn9);
        cp.add(jbtn10);
        cp.add(jbtn11);
    }
}
