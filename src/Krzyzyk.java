
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Krzyzyk extends javax.swing.JFrame {

private String start="O";
private int xCount=0;
private int yCount=0;
    public Krzyzyk() {
        initComponents();
        setSize(700,700);
        setBackground(Color.RED);
        
    }
private  void PointScore()
{
    jLabel5.setText(String.valueOf(xCount));
    jLabel3.setText(String.valueOf(yCount));
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        JButton jButton12 = new JButton();
        JButton jButton13 = new JButton();
        JLabel jLabel2 = new JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLabel jLabel4 = new JLabel();
        jLabel5 = new javax.swing.JLabel();
        JPanel jPanel1 = new JPanel();
        JLabel jLabel1 = new JLabel();
        JPanel jPanel2 = new JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setForeground(new java.awt.Color(204, 255, 51));
        setPreferredSize(null);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 165, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 72)); // NOI18N
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 15, true));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 113, 123, 109);

        jButton2.setBackground(new java.awt.Color(255, 165, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 72)); // NOI18N
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 15, true));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        getContentPane().add(jButton2);
        jButton2.setBounds(129, 113, 123, 109);

        jButton3.setBackground(new java.awt.Color(255, 165, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", Font.BOLD, 72)); // NOI18N
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 15, true));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        getContentPane().add(jButton3);
        jButton3.setBounds(262, 113, 123, 109);

        jButton5.setBackground(new java.awt.Color(255, 165, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", Font.BOLD, 72)); // NOI18N
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 15, true));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        getContentPane().add(jButton5);
        jButton5.setBounds(0, 231, 123, 109);

        jButton6.setBackground(new java.awt.Color(255, 165, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", Font.BOLD, 72)); // NOI18N
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 15, true));
        jButton6.addActionListener(this::jButton6ActionPerformed);
        getContentPane().add(jButton6);
        jButton6.setBounds(129, 231, 123, 109);

        jButton7.setBackground(new java.awt.Color(255, 165, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", Font.BOLD, 72)); // NOI18N
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 15, true));
        jButton7.addActionListener(this::jButton7ActionPerformed);
        getContentPane().add(jButton7);
        jButton7.setBounds(262, 231, 123, 109);

        jButton9.setBackground(new java.awt.Color(255, 165, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", Font.BOLD, 72)); // NOI18N
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 15, true));
        jButton9.addActionListener(evt -> jButton9ActionPerformed());
        getContentPane().add(jButton9);
        jButton9.setBounds(0, 350, 123, 109);

        jButton10.setBackground(new java.awt.Color(255, 165, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", Font.BOLD, 72)); // NOI18N
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 15, true));
        jButton10.addActionListener(this::jButton10ActionPerformed);
        getContentPane().add(jButton10);
        jButton10.setBounds(130, 350, 123, 109);

        jButton11.setBackground(new java.awt.Color(255, 165, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", Font.BOLD, 72)); // NOI18N
        jButton11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 15, true));
        jButton11.addActionListener(this::jButton11ActionPerformed);
        getContentPane().add(jButton11);
        jButton11.setBounds(260, 350, 123, 109);

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
        jButton12.setText("Exit");
        jButton12.setBorder(null);
        jButton12.addActionListener(this::actionPerformed);
        getContentPane().add(jButton12);
        jButton12.setBounds(390, 350, 123, 109);

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
        jButton13.setText("Reset");
        jButton13.setBorder(null);
        jButton13.addActionListener(this::jButton13ActionPerformed);
        getContentPane().add(jButton13);
        jButton13.setBounds(520, 350, 123, 109);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
        jLabel2.setText("Player2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(395, 234, 125, 103);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(530, 230, 119, 104);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
        jLabel4.setText("Player1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 120, 119, 104);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 120, 119, 104);

        jPanel1.setBackground(new java.awt.Color(51, 0, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kółko i Krzyżyk");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 0, 400, 90);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(400, 120, 110, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed() {//GEN-FIRST:event_jButton12ActionPerformed

        JFrame frame = new JFrame("Exit");
       
       if(JOptionPane.showConfirmDialog(frame,"Are you sure to exit","Kółko i Krzyzyk",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
      
           System.exit(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
       
        jButton9.setText(null);
        jButton10.setText(null);
        jButton11.setText(null);
        
        jButton1.setBackground(Color.ORANGE);
        jButton2.setBackground(Color.ORANGE);
        jButton3.setBackground(Color.ORANGE);
        
        jButton5.setBackground(Color.ORANGE);
        jButton6.setBackground(Color.ORANGE);
        jButton7.setBackground(Color.ORANGE);
        
        jButton9.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE);
        jButton11.setBackground(Color.ORANGE);
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(start);
        
        if(start.equalsIgnoreCase("O"))
        {
            jButton1.setForeground(Color.green);
        }
        
        else
        {
            jButton1.setForeground(Color.blue);
                    
        }
        
        StartGame();
        winnigGame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(start);
        
        if(start.equalsIgnoreCase("O"))
        {
            jButton2.setForeground(Color.green);
            
        }
        
        else
        {
            jButton2.setForeground(Color.blue);
                    
        }
        
        StartGame();
        winnigGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          
        jButton3.setText(start);
        
         if(start.equalsIgnoreCase("O"))
         {
            jButton3.setForeground(Color.green);
         }
         
        else
        {
            jButton3.setForeground(Color.blue);
                    
        }
        
        StartGame();
        winnigGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         jButton5.setText(start);
        
         if(start.equalsIgnoreCase("O"))
         {
            jButton5.setForeground(Color.green);
         }
       
        else
        {
            jButton5.setForeground(Color.blue);
                    
        }
        StartGame();
        winnigGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         
        jButton6.setText(start);
        
         if(start.equalsIgnoreCase("O"))
         {
            jButton6.setForeground(Color.green);
         }
        else
        {
            jButton6.setForeground(Color.blue);
                    
        }
        
        StartGame();
        winnigGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         
        jButton7.setText(start);
        
         if(start.equalsIgnoreCase("O"))
         {
            jButton7.setForeground(Color.green);
         }
        
        else
        {
            jButton7.setForeground(Color.blue);
                    
        }
        StartGame();
        winnigGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed() {//GEN-FIRST:event_jButton9ActionPerformed
        
        jButton9.setText(start);
        
        if(start.equalsIgnoreCase("O"))
        {
            jButton9.setForeground(Color.green);
        }
        
        else
        {
            jButton9.setForeground(Color.blue);
                    
        }
        StartGame();
        winnigGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         
        jButton10.setText(start);
        
         if(start.equalsIgnoreCase("O"))
        {
            jButton10.setForeground(Color.green);
        }
        
        else
        {
            jButton10.setForeground(Color.blue);
                    
        }
        
        StartGame();
        winnigGame();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         
        jButton11.setText(start);
        
         if(start.equalsIgnoreCase("O"))
         {
            jButton11.setForeground(Color.green);
         }
        
         else
        {
            jButton11.setForeground(Color.blue);
                    
        }
        
        
        StartGame();
        winnigGame();
    }//GEN-LAST:event_jButton11ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Krzyzyk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Krzyzyk().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;

    // End of variables declaration//GEN-END:variables
    void StartGame()
    {
        
        if(start.equalsIgnoreCase("O"))
        {
            start="X";
        }
        
        else
        {
            start="O";
        }
    }
    private void winnigGame()
    {
        
        String b1=jButton1.getText();
        String b2=jButton2.getText();
        String b3=jButton3.getText();
        String b4=jButton5.getText();
        String b5=jButton6.getText();
        String b6=jButton7.getText();
        String b7=jButton9.getText();
        String b8=jButton10.getText();
        String b9=jButton11.getText();
        
       
        if(b1.equals("X") && b2.equals("X") && b3.equals("X"))
        {
           
            
            JOptionPane.showMessageDialog(this,"Player1 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
           
            PointScore();
        
           jButton1.setBackground(Color.green);
           jButton2.setBackground(Color.green);
           jButton3.setBackground(Color.green);
           
            
        }
        else if(b1.equals("X") && b4.equals("X") && b7.equals("X"))
        {
            
            JOptionPane.showMessageDialog(this,"Player1 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
           
            PointScore();
        
           jButton1.setBackground(Color.green);
           jButton5.setBackground(Color.green);
           jButton9.setBackground(Color.green);
        }
        
        else if(b1.equals("X") && b5.equals("X") && b9.equals("X"))
        {
           
            JOptionPane.showMessageDialog(this,"Player1 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
           
           PointScore();
        
           jButton1.setBackground(Color.green);
           jButton6.setBackground(Color.green);
           jButton11.setBackground(Color.green);
        }
        
        else if(b2.equals("X") && b5.equals("X") && b8.equals("X"))
        {
            
            JOptionPane.showMessageDialog(this,"Player1 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
        
            PointScore();
       
           jButton6.setBackground(Color.green);
           jButton2.setBackground(Color.green);
           jButton10.setBackground(Color.green);
        }
        
        else if(b3.equals("X") && b6.equals("X") && b9.equals("X"))
        {
            
            JOptionPane.showMessageDialog(this,"Player1 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
        
            PointScore();
           
           jButton3.setBackground(Color.green);
           jButton7.setBackground(Color.green);
           jButton11.setBackground(Color.green);
        }
        
        else if(b4.equals("X") && b5.equals("X") && b6.equals("X"))
        {
           
            JOptionPane.showMessageDialog(this,"Player1 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
        
            PointScore();
           
           jButton5.setBackground(Color.green);
           jButton6.setBackground(Color.green);
           jButton7.setBackground(Color.green);
        }
        
        else if(b7.equals("X") && b8.equals("X") && b9.equals("X"))
        {
           
            JOptionPane.showMessageDialog(this,"Player1 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
        
            PointScore();
           
           jButton9.setBackground(Color.green);
           jButton10.setBackground(Color.green);
           jButton11.setBackground(Color.green);
        }
        
        else if(b3.equals("X") && b5.equals("X") && b7.equals("X"))
        {
            
            JOptionPane.showMessageDialog(this,"Player1 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
           
            PointScore();
        
           jButton3.setBackground(Color.green);
           jButton6.setBackground(Color.green);
           jButton9.setBackground(Color.green);
        }
        
        
       else if(b1.equals("O") && b2.equals("O") && b3.equals("O"))
       {
           
            JOptionPane.showMessageDialog(this,"Player 2 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            yCount++;
           
            PointScore();
        
           jButton1.setBackground(Color.MAGENTA);
           jButton2.setBackground(Color.MAGENTA);
           jButton3.setBackground(Color.MAGENTA);
           
            
        }
       
        else if(b1.equals("O") && b4.equals("O") && b7.equals("O"))
        {
            
            JOptionPane.showMessageDialog(this,"Player 2 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            yCount++;
           
            PointScore();
         
           jButton1.setBackground(Color.MAGENTA);
           jButton5.setBackground(Color.MAGENTA);
           jButton9.setBackground(Color.MAGENTA);
        }
        else if(b1.equals("O") && b5.equals("O") && b9.equals("O"))
        {
            
            JOptionPane.showMessageDialog(this,"Player 2 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            yCount++;
           
            PointScore();
        
           jButton1.setBackground(Color.MAGENTA);
           jButton6.setBackground(Color.MAGENTA);
           jButton11.setBackground(Color.MAGENTA);
        }
        else if(b2.equals("O") && b5.equals("O") && b8.equals("O"))
        {
           
           JOptionPane.showMessageDialog(this,"Player 2 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
           yCount++;
           
           PointScore();
           
           jButton6.setBackground(Color.MAGENTA);
           jButton2.setBackground(Color.MAGENTA);
           jButton10.setBackground(Color.MAGENTA);
        }
        else if(b3.equals("O") && b6.equals("O") && b9.equals("O"))
        {
           
            JOptionPane.showMessageDialog(this,"Player 2 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
            yCount++;
           
            PointScore();
           
           jButton3.setBackground(Color.MAGENTA);
           jButton7.setBackground(Color.MAGENTA);
           jButton11.setBackground(Color.MAGENTA);
        }
        else if(b4.equals("O") && b5.equals("O") && b6.equals("O"))
        {
           JOptionPane.showMessageDialog(this,"Player 2 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
           yCount++;
           PointScore();
           
           jButton5.setBackground(Color.MAGENTA);
           jButton6.setBackground(Color.MAGENTA);
           jButton7.setBackground(Color.MAGENTA);
        }
        else if(b7.equals("O") && b8.equals("O") && b9.equals("O"))
        {
           JOptionPane.showMessageDialog(this,"Player 2 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
           yCount++;
           
           PointScore();
           
           jButton9.setBackground(Color.MAGENTA);
           jButton10.setBackground(Color.MAGENTA);
           jButton11.setBackground(Color.MAGENTA);
        }
        else if(b3.equals("O") && b5.equals("O") && b7.equals("O"))
        {
           JOptionPane.showMessageDialog(this,"Player 2 won","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
           yCount++;
           
           PointScore();
           
           jButton3.setBackground(Color.MAGENTA);
           jButton6.setBackground(Color.MAGENTA);
           jButton9.setBackground(Color.MAGENTA);
        }
        else if((b1.equals("X") || b1.equals("O")) && (b2.equals("X") || b2.equals("O")) && (b3.equals("X") || b3.equals("O")) &&(b4.equals("X") || b4.equals("O")) && (b5.equals("X") || b5.equals("O"))&& (b6.equals("X") || b6.equals("O")) &&(b7.equals("X") || b7.equals("O")) &&(b8.equals("X") || b8.equals("O")) &&(b9.equals("X") || b9.equals("O")))
                 
        {
        JOptionPane.showMessageDialog(this,"Nobody win please try again it's draw ","Kółko i Krzyżyk",JOptionPane.INFORMATION_MESSAGE);
        
            jButton1.setBackground(Color.red);
            jButton2.setBackground(Color.red);
            jButton3.setBackground(Color.red);
            jButton5.setBackground(Color.red);
            jButton6.setBackground(Color.red);
            jButton7.setBackground(Color.red);
            jButton9.setBackground(Color.red);
            jButton10.setBackground(Color.red);
            jButton11.setBackground(Color.red);
            
        }
}

    private void actionPerformed(ActionEvent evt) {
        jButton12ActionPerformed();
    }
}