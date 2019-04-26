import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

import java.awt.image.*;

public class GameLayout extends JFrame{

    private Novice player;
    String hp, level, damage, exp, rank, killmonster;
    JTextField jtf21, jtf22, jtf23, jtf24, jtf25, jtf26, jtf32, jtf35, jtf38;
    Monster m1, m2, m3;
    JPanel mon1, mon2, mon3;
    int btmon1, btmon2, btmon3;
    
    public GameLayout(String head){
        super(head);
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setBackground(Color.GRAY);
        c.setLayout(new BorderLayout(10,7));

       
        //set monster
        JPanel p1 = new JPanel();
        p1.setBackground(Color.RED);
        p1.setLayout(new GridLayout(4, 8, 5, 5));

        // JTextField statusMon = new JTextField("Monsters");
        // statusMon.setHorizontalAlignment(SwingConstants.CENTER);
        // statusMon.setEditable(false);
        // p1.add(statusMon);

        JButton jb11 = new JButton("Red Monster");
        JButton jb12 = new JButton("Blue Monster");
        JButton jb13 = new JButton("Green Monster");     

        
        m1 = new Monster("Red Monster", 50, 1);
        m2 = new Monster("Blue Monster", 100, 10);
        m3 = new Monster("Green Monster", 200, 20);
        
        p1.add(jb11);
        p1.add(jb12);
        p1.add(jb13);

        //set player
        player = new Novice("Jones");
        hp = Integer.toString(player.getHp());
        level = Integer.toString(player.getLevel());
        damage = Integer.toString(player.getDamage());
        exp = Integer.toString(player.getExp());
        rank = Integer.toString(player.getRank());
        killmonster = Integer.toString(player.getKillMonster());

        JPanel p2 = new JPanel();
        p2.setBorder(new LineBorder(Color.ORANGE, 10));
        p2.setBackground(Color.WHITE);
        p2.setLayout(new GridLayout(6, 1));
        c.add(p2, BorderLayout.EAST);
        p2.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));

        JLabel jl21 = new JLabel("HP");
        jtf21 = new JTextField(hp, 10);

        JLabel jl22 = new JLabel("LEVEL");
        jtf22 = new JTextField(level, 10);

        JLabel jl23 = new JLabel("RANK");
        jtf23 = new JTextField(rank, 10);

        JLabel jl24 = new JLabel("DAMAGE");
        jtf24 = new JTextField(damage, 10);

        JLabel jl25 = new JLabel("EXP");
        jtf25 = new JTextField(exp, 10);

        JLabel jl26 = new JLabel("KILLMONSTER");
        jtf26 = new JTextField(killmonster, 10);

        jtf21.setEditable(false);
        jtf22.setEditable(false);
        jtf23.setEditable(false);
        jtf24.setEditable(false);
        jtf25.setEditable(false);
        jtf26.setEditable(false);

        jtf21.setHorizontalAlignment(SwingConstants.CENTER);
        jtf22.setHorizontalAlignment(SwingConstants.CENTER);
        jtf23.setHorizontalAlignment(SwingConstants.CENTER);
        jtf24.setHorizontalAlignment(SwingConstants.CENTER);
        jtf25.setHorizontalAlignment(SwingConstants.CENTER);
        jtf26.setHorizontalAlignment(SwingConstants.CENTER);

        jl21.setHorizontalAlignment(SwingConstants.CENTER);
        jl22.setHorizontalAlignment(SwingConstants.CENTER);
        jl23.setHorizontalAlignment(SwingConstants.CENTER);
        jl24.setHorizontalAlignment(SwingConstants.CENTER);
        jl25.setHorizontalAlignment(SwingConstants.CENTER);
        jl26.setHorizontalAlignment(SwingConstants.CENTER);

        p2.add(jl21);
        p2.add(jtf21);
        p2.add(jl22);
        p2.add(jtf22);
        p2.add(jl23);
        p2.add(jtf23);
        p2.add(jl24);
        p2.add(jtf24);
        p2.add(jl25);
        p2.add(jtf25);
        p2.add(jl26);
        p2.add(jtf26);

        // JLabel j1 = new JLabel(new ImageIcon("blue2.png"));

        c.add(p1, BorderLayout.WEST);
        // c.add(j1, BorderLayout.CENTER);
        c.add(p2, BorderLayout.EAST);
        
        pack();
        setResizable(true);
        setLocationRelativeTo(null); 
        setVisible(true);

        //set monster mid

        JPanel   monster = new JPanel();
        monster.setBorder(new LineBorder(Color.BLACK,1));
        monster.setLayout(new FlowLayout());
        monster.setBackground(Color.WHITE);

        JPanel jpm = new JPanel();
        jpm.setBorder(new LineBorder(Color.BLACK,1));
        jpm.setLayout(new FlowLayout(4,4,4));
        jpm.setBackground(Color.WHITE);

        monsterAttack att = new monsterAttack();
        monsterAttack2 att2 = new monsterAttack2();
        monsterAttack3 att3 = new monsterAttack3();


        view v = new view();
        hide h = new hide();
        seek s = new seek();
        jb11.addActionListener(v);
        jb12.addActionListener(h);
        jb13.addActionListener(s);

        String[]    monhp = new String[3];
        String[]    mondamage = new String[3];
        String[]    monname = new String[3];
        JButton     jb31 = new JButton("Attack");
        jb31.addActionListener(att);
        JButton     jb32 = new JButton("Attack");
        jb32.addActionListener(att2);
        JButton     jb33 = new JButton("Attack");
        jb33.addActionListener(att3);
        

//panel for monster 1
        mon1 = new JPanel();
        mon1.setLayout(new FlowLayout(5));
        mon1.setBorder(new LineBorder(Color.BLACK,1));
        mon1.setVisible(true);
//panel for monster 2
        mon2 = new JPanel();
        mon2.setLayout(new FlowLayout(5));
        mon2.setBorder(new LineBorder(Color.BLACK,1));
        mon2.setVisible(false);
//panel for monster 3
        mon3 = new JPanel();
        mon3.setLayout(new FlowLayout(5));
        mon3.setBorder(new LineBorder(Color.BLACK,1));
        mon3.setVisible(false);
//create Monster1
            //initail Monster obj;


        
        monname[0] = m1.getName();
        mondamage[0] = Integer.toString(m1.getDamage());
        monhp[0] = Integer.toString(m1.getHp());
        btmon1 = Integer.parseInt(monhp[0]);

        JLabel jl31 = new JLabel("Monster Name");
        JLabel jl32 = new JLabel("Monster Hp");
        JLabel jl33 = new JLabel("Damage");

        JTextField jtf31 = new JTextField();
        jtf31.setText(monname[0]);
        jtf31.setEditable(false);
        JTextField jtf33 = new JTextField();
        jtf33.setText(mondamage[0]);
        jtf33.setEditable(false);
        jtf32 = new JTextField();
        jtf32.setText(monhp[0]);
        jtf32.setEditable(false);

        mon1.add(jl31);  //Llabel
        mon1.add(jtf31);
        mon1.add(jl32);  //Label
        mon1.add(jtf32);
        mon1.add(jl33);  //Label
        mon1.add(jtf33);

        jtf31.setPreferredSize( new Dimension( 100, 25 ) );
        jtf32.setPreferredSize( new Dimension( 50, 25 ) );
        jtf33.setPreferredSize( new Dimension( 50, 25 ) );

        monname[1] = m2.getName();
        mondamage[1] = Integer.toString(m2.getDamage());
        monhp[1] = Integer.toString(m2.getHp());
        btmon2 = Integer.parseInt(monhp[1]);

        JLabel jl34 = new JLabel("Monster Name");
        JLabel jl35 = new JLabel("Monster Hp");
        JLabel jl36 = new JLabel("Damage");

        JTextField jtf34 = new JTextField();
        jtf34.setText(monname[1]);
        jtf34.setEditable(false);
        JTextField jtf36 = new JTextField();
        jtf36.setText(mondamage[1]);
        jtf36.setEditable(false);
        jtf35 = new JTextField();
        jtf35.setText(monhp[1]);
        jtf35.setEditable(false);

        mon2.add(jl34);  //Llabel
        mon2.add(jtf34);
        mon2.add(jl35);  //Label
        mon2.add(jtf35);
        mon2.add(jl36);  //Label
        mon2.add(jtf36);

        jtf34.setPreferredSize( new Dimension( 100, 25 ) );
        jtf35.setPreferredSize( new Dimension( 50, 25 ) );
        jtf36.setPreferredSize( new Dimension( 50, 25 ) );

        monname[2] = m3.getName();
        mondamage[2] = Integer.toString(m3.getDamage());
        monhp[2] = Integer.toString(m3.getHp());
        btmon3 = Integer.parseInt(monhp[2]);

        JLabel jl37 = new JLabel("Monster Name");
        JLabel jl38 = new JLabel("Monster Hp");
        JLabel jl39 = new JLabel("Damage");
        
        JTextField jtf37 = new JTextField();
        jtf37.setText(monname[2]);
        jtf37.setEditable(false);
        JTextField jtf39 = new JTextField();
        jtf39.setText(mondamage[2]);
        jtf39.setEditable(false);
        jtf38 = new JTextField();
        jtf38.setText(monhp[2]);
        jtf38.setEditable(false);

        mon3.add(jl37);  //Llabel
        mon3.add(jtf37);
        mon3.add(jl38);  //Label
        mon3.add(jtf38);
        mon3.add(jl39);  //Label
        mon3.add(jtf39);


        jtf37.setPreferredSize( new Dimension( 100, 25 ) );
        jtf38.setPreferredSize( new Dimension( 50, 25 ) );
        jtf39.setPreferredSize( new Dimension( 50, 25 ) );

        mon1.setPreferredSize(new Dimension(500,400));
        mon2.setPreferredSize(new Dimension(500,400));
        mon1.setVisible(true);
        mon1.setPreferredSize(new Dimension(500,400));
        mon2.setVisible(false);
        mon2.setPreferredSize(new Dimension(500,400));
        mon3.setPreferredSize(new Dimension(500,400));
        //image monster1
        BufferedImage wPic = null;
        BufferedImage wPic2 = null;
        BufferedImage wPic3 = null;

        try{
            wPic = ImageIO.read(this.getClass().getResource("red2.jpg"));
            wPic2 = ImageIO.read(this.getClass().getResource("blue2.png"));
            wPic3 = ImageIO.read(this.getClass().getResource("green2.png"));
        }
        catch (IOException e) {
        }

        JLabel wIcon = new JLabel(new ImageIcon(wPic));
        JLabel wIcon2 = new JLabel(new ImageIcon(wPic2));
        JLabel wIcon3 = new JLabel(new ImageIcon(wPic3));

        mon1.add(wIcon);
        mon1.add(jb31);

        mon2.add(wIcon2);
        mon2.add(jb32);

        mon3.add(wIcon3);
        mon3.add(jb33);


        //monster.setPreferredSize(new Dimension(50,50));

        monster.add(mon1);
        monster.add(mon2);
        monster.add(mon3);

        // gridPanel.add(statusMon);

        JLabel label = new JLabel("Center Box", SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBorder(new LineBorder(Color.BLACK,2));

        c.add(label);
        // c.add(midlePanel, BorderLayout.WEST);
        c.add(monster, BorderLayout.CENTER);
        

    }
    private class monsterAttack implements ActionListener{
        public void actionPerformed(ActionEvent event){
            double a = 0.5;
            int ihp;
            int ikillmonster;
            int irank,ilevel;
			ikillmonster = Integer.parseInt(killmonster);
            String mons;
            irank = Integer.parseInt(rank);
            ihp = Integer.parseInt(hp);
            ilevel = Integer.parseInt(level);
            
			if((btmon1 - 10) == 0){
                btmon1 = m1.getHp();
                    if(ihp > 0){
                        ikillmonster++;
                        irank += a;
                        level = " " + ilevel;
						killmonster = " " + ikillmonster;
                        rank = " " + irank;
                        jtf26.setText(killmonster);
                        jtf23.setText(rank);
                        jtf25.setText(level);
                         
                    }
						
				}
			else{
                if(ihp > 0){
                    btmon1 = btmon1 - 10;   
                    }
						
				if(ihp<=100){
					if(ihp>0){
                        ihp = ihp - m1.getDamage();
						}
					}
				}
				
					
                
            hp = " " + ihp;
            mons = " " + btmon1;
            jtf21.setText(hp);
            jtf32.setText(mons);
        }
    }
    private class monsterAttack2 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            double a = 0.5;
            int ihp;
            int ikillmonster;
            int irank,ilevel;
			ikillmonster = Integer.parseInt(killmonster);
            String mons;
            irank = Integer.parseInt(rank);
            ihp = Integer.parseInt(hp);
            ilevel = Integer.parseInt(level);
            
			if((btmon2 - 10) == 0){
                btmon2 = m2.getHp();
                    if(ihp > 0){
                        ikillmonster++;
                        irank += a;
                        level = " " + ilevel;
						killmonster = " " + ikillmonster;
                        rank = " " + irank;
                        jtf26.setText(killmonster);
                        jtf23.setText(rank);
                        jtf25.setText(level);
                         
                    }
						
				}
			else{
                if(ihp > 0){
                    btmon2 = btmon2 - 10;   
                    }
						
				if(ihp<=100){
					if(ihp>0){
                        ihp = ihp - m2.getDamage();
						}
					}
				}
				
					
                
            hp = " " + ihp;
            mons = " " + btmon2;
            jtf21.setText(hp);
            jtf35.setText(mons);
        }
    }
    
    private class monsterAttack3 implements ActionListener{
        public void actionPerformed(ActionEvent event){
            double a = 0.5;
            int ihp;
            int ikillmonster;
            int irank,ilevel;
			ikillmonster = Integer.parseInt(killmonster);
            String mons;
            irank = Integer.parseInt(rank);
            ihp = Integer.parseInt(hp);
            ilevel = Integer.parseInt(level);
            
			if((btmon3 - 10) == 0){
                btmon3 = m3.getHp();
                    if(ihp > 0){
                        ikillmonster++;
                        irank += a;
                        level = " " + ilevel;
						killmonster = " " + ikillmonster;
                        rank = " " + irank;
                        jtf26.setText(killmonster);
                        jtf23.setText(rank);
                        jtf25.setText(level);
                         
                    }
						
				}
			else{
                if(ihp > 0){
                    btmon3 = btmon3 - 10;   
                    }
						
				if(ihp<=100){
					if(ihp>0){
                        ihp = ihp - m3.getDamage();
						}
					}
				}
				
					
                
            hp = " " + ihp;
            mons = " " + btmon3;
            jtf21.setText(hp);
            jtf38.setText(mons);
        }
    }
    
    private class view implements ActionListener{
        public void actionPerformed(ActionEvent event){
            mon1.setVisible(true);
            mon2.setVisible(false);
            mon3.setVisible(false);
        }
    }
    private class hide implements ActionListener{
        public void actionPerformed(ActionEvent event){
            mon1.setVisible(false);
            mon2.setVisible(true);
            mon3.setVisible(false);
        }
    }
    private class seek implements ActionListener{
        public void actionPerformed(ActionEvent event){
            mon1.setVisible(false);
            mon2.setVisible(false);
            mon3.setVisible(true);
        }
    }

}