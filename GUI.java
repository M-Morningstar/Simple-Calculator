import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;


public class GUI extends JPanel implements ActionListener {
    Timer t;
    private int mousex, mousey, click, mouseCount;
    private int x = 52;
    private int y = 150;
//    private String displayN = "0";
    Color numpad = new Color(173, 173, 173);
//    Color rest = new Color(207, 207, 207);
    private int fontS = 23;
    Font f1 = new Font("Tahoma", Font.BOLD, fontS);
    private int fontX = 310;
    private int fontY = 210;
    private double num, ans;
    int calculation;
    
    // VARIABLES THAT NEED TO BE ACCESSED BY ALL METHODS
    // NOTE THAT IF ITS NOT SUPER OBVIOUS YOU SHOULD HAVE A COMMENT INDICATING WHAT
    // THESE VARIABLES ARE USED FOR
    ArrayList<JButton> buttonList = new ArrayList<JButton>();
    JTextField t1 = new JTextField();
    
    public GUI() {
        initComponents();
        t = new Timer(50, this);
        t.start();
        for(int i = 0; i<18; i++) {
        	buttonList.add(new JButton());
        }
//        g.fillRect(52, 262, 66, 51);
//        for(int i = 1; i<=6; i++) {
        t1.setBounds(50, 0, 310, 150);
        this.add(t1);
		t1.setHorizontalAlignment(JTextField.RIGHT);
		t1.setFont(f1);
        t1.setEditable(false);
//        int setLineWrap(true);
        	for(int j = 0; j<18; j++) {
        		if(j == 0) {
        			x = 132;
        		}
        		if(x == 372) {
        			x = 52;
        			y += 55;
        		}
        		if(j == 15) {
        			x = 132;
        		}
        		buttonNaming();
        		buttonList.get(j).setBounds(x, y, 66, 51);
        		this.add(buttonList.get(j));
        		buttonList.get(j).setVisible(true);
        		x += 80;
        	}
        buttonList.get(0).addActionListener(new ActionListener() {
        		
        	public void actionPerformed(ActionEvent e) {
        		System.out.println("Number pressed");
        		t1.setText("");
        	}
        });
        buttonList.get(1).addActionListener(new ActionListener() {
        		
        	public void actionPerformed(ActionEvent e) {
        		int length = t1.getText().length();
        		int number = t1.getText().length()-1;
        		String store;
        		
        		if(length > 0) {
        			StringBuilder back = new StringBuilder(t1.getText());
        			back.deleteCharAt(number);
        			store = back.toString();
        			t1.setText(store);
        		}
        	}
        });
    	buttonList.get(2).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			num = Double.parseDouble(t1.getText());
    			calculation = 4;
    			t1.setText("");
    		}
    	});
    	buttonList.get(3).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(3).getText());
    		}
    	});
    	buttonList.get(4).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(4).getText());
    		}
    	});
    	buttonList.get(5).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(5).getText());
    		}
    	});
    	buttonList.get(6).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			num = Double.parseDouble(t1.getText());
    			calculation = 3;
    			t1.setText("");
    		}
    	});
    	buttonList.get(7).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(7).getText());
    		}
    	});
    	buttonList.get(8).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(8).getText());
    		}
    	});
    	buttonList.get(9).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(9).getText());
    		}
    	});
    	buttonList.get(10).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			num = Double.parseDouble(t1.getText());
    			calculation = 2;
    			t1.setText("");
    		}
    	});
    	buttonList.get(11).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(11).getText());
    		}
    	});
    	buttonList.get(12).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(12).getText());
    		}
    	});
    	buttonList.get(13).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(13).getText());
    		}
    	});
    	buttonList.get(14).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			num = Double.parseDouble(t1.getText());
    			calculation = 1;
    			t1.setText("");
    		}
    	});
    	buttonList.get(15).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(15).getText());
    		}
    	});
    	buttonList.get(16).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			t1.setText(t1.getText() + buttonList.get(16).getText());
    		}
    	});
    	buttonList.get(17).addActionListener(new ActionListener() {
    		
    		public void actionPerformed(ActionEvent e) {
    			operations();
    		}
    	});
}
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // ALL DRAWING GOES HERE
    	g.setColor(numpad);
    	g.fillRect(50, 150, 310, 280);
//    	g.setColor(rest);
//    	g.fillRect(50, 100, 310, 270);
//    	g.fillRect(280, 370, 80, 220);
    	g.setFont(new Font("Tahoma", Font.BOLD, fontS));
    	g.setColor(Color.black);
//    	g.drawString(String.valueOf(displayN), fontX, fontY);
    	
    	
        }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        // logic for game should be here, this is run every so many milliseconds
        // determined by Timer variable
        
    }

    public void keyReleased(KeyEvent e) {
        // method initiated when a key is released
    }

    public void keyPressed(KeyEvent e) {
        // method initiated when a key is pressed
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_A) {

        }
        if (key == KeyEvent.VK_W) {

        }
        if (key == KeyEvent.VK_S) {

        }
        if (key == KeyEvent.VK_D) {

        }

    }
    
    public void operations() {
    	switch(calculation) {
    		case 1:
    			ans = num + Double.parseDouble(t1.getText());
    			t1.setText(Double.toString(ans));
    			break;
    		case 2:
    			ans = num - Double.parseDouble(t1.getText());
    			t1.setText(Double.toString(ans));
    			break;
    		case 3:
    			ans = num * Double.parseDouble(t1.getText());
    			t1.setText(Double.toString(ans));
    			break;
    		case 4:
    			ans = num / Double.parseDouble(t1.getText());
    			t1.setText(Double.toString(ans));
    			break;
    	}
    }
    
    public void buttonNaming() {
    	buttonList.get(0).setText("C");
    	buttonList.get(1).setText("<<");
    	buttonList.get(2).setText("/");
    	buttonList.get(3).setText(String.valueOf(7));
    	buttonList.get(4).setText(String.valueOf(8));
    	buttonList.get(5).setText(String.valueOf(9));
    	buttonList.get(6).setText("*");
    	buttonList.get(7).setText(String.valueOf(4));
    	buttonList.get(8).setText(String.valueOf(5));
    	buttonList.get(9).setText(String.valueOf(6));
    	buttonList.get(10).setText("-");
    	buttonList.get(11).setText(String.valueOf(1));
    	buttonList.get(12).setText(String.valueOf(2));
    	buttonList.get(13).setText(String.valueOf(3));
    	buttonList.get(14).setText("+");
    	buttonList.get(15).setText(String.valueOf(0));
    	buttonList.get(16).setText(".");
    	buttonList.get(17).setText("=");
    }
    
    // USED FOR INTERACTION THAT INCLUDES DRAGGING OF MOUSE
    public void dragMouse(MouseEvent e) {
        mousex = e.getX();
        mousey = e.getY();
        System.out.println(mousex + "  " + mousey + "  dragged");
    }

    // USED FOR INTERACTION THAT INCLUDES RELEASING OF MOUSEBUTTON
    public void releaseMouse(MouseEvent e, Graphics g) {
        mousex = e.getX();
        mousey = e.getY();
        System.out.println(mousex + "  " + mousey + "  clicked");
    }

    // DON't TOUCH THE INITIALIZING COMPONENTS METHOD
    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                dragMouse(e);
                repaint();
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Graphics g = null;
                formMouseClicked(evt, g);
            }

            public void mouseReleased(MouseEvent e) {
                Graphics g = null;
                releaseMouse(e, g);
            }
        });
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 300, Short.MAX_VALUE));

    }
    
    protected void formMouseClicked(MouseEvent evt, Graphics g) {
        mousex = evt.getX();
        mousey = evt.getY();
        int mouseClicked = evt.getButton();
        click = mouseClicked;
        mouseCount = evt.getClickCount();

    }
}