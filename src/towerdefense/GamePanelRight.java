/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author mpw5216
 */
public class GamePanelRight extends javax.swing.JPanel {

    public int userScore;

    public String userName;

    public int userHealth;

    public String defenseStrength;

    public String defenseRange;

    public int userMoney;

    public int Stage;

    public String difficulty;

    /**
     * Creates new form GamePanel2
     */
    public GamePanelRight() {
        initComponents();
        JButton ec, hmk, pf;
        ec = new JButton ("\\\\up.ist.local\\Users\\jrc5713\\Desktop\\eraserCannon.png");
        

    }

    public int getUserScore() {
        return 0;
    }

    public String getUserName() {
        return null;
    }

    public String getUserHealth() {
        return null;
    }

    public String getDStrength() {
        return null;
    }

    public String getDRange() {
        return null;
    }

    public int getUserMoney() {
        return 0;
    }

    public int getStage() {
        return 0;
    }

    public String getDifficulty() {
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        percent = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        stage = new javax.swing.JLabel();
        homework = new javax.swing.JLabel();
        eraser = new javax.swing.JLabel();
        paepr = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        hmk = new javax.swing.JButton();
        ec = new javax.swing.JButton();
        pf = new javax.swing.JButton();
        stage1 = new javax.swing.JLabel();
        stage2 = new javax.swing.JLabel();
        stage3 = new javax.swing.JLabel();
        paepr1 = new javax.swing.JLabel();
        paepr2 = new javax.swing.JLabel();
        paepr3 = new javax.swing.JLabel();
        paepr4 = new javax.swing.JLabel();
        paepr5 = new javax.swing.JLabel();
        paepr6 = new javax.swing.JLabel();
        paepr7 = new javax.swing.JLabel();
        paepr8 = new javax.swing.JLabel();
        paepr9 = new javax.swing.JLabel();
        paepr10 = new javax.swing.JLabel();
        paepr11 = new javax.swing.JLabel();
        paepr12 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        name.setText("Name:");

        percent.setText("55%");

        score.setText("999999");

        money.setText("$65");

        stage.setText("Stage:");

        homework.setText("Homework Tosser");

        eraser.setText("Eraser Cannon");

        paepr.setText("Paper Football Launcher");

        next.setText("Next Wave");

        hmk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/homeworkTosser.png"))); // NOI18N
        hmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmkActionPerformed(evt);
            }
        });

        ec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/eraserCannon.png"))); // NOI18N
        ec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecActionPerformed(evt);
            }
        });

        pf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/PaerFootball.png"))); // NOI18N
        pf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfActionPerformed(evt);
            }
        });

        stage1.setText("Score:");

        stage2.setText("Money:");

        stage3.setText("Difficulty:");

        paepr1.setText("$15");

        paepr2.setText("Medium range");

        paepr3.setText("Medium damage");

        paepr4.setText("Small range");

        paepr5.setText("$20");

        paepr6.setText("Large damage");

        paepr7.setText("$10");

        paepr8.setText("Large range");

        paepr9.setText("Small damage");

        paepr10.setText("Easy");

        paepr11.setText("2");

        paepr12.setText("NoName");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paepr12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(stage1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(score)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(stage2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(percent))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(money))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(stage3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paepr10)
                        .addGap(16, 16, 16)
                        .addComponent(stage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paepr11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(homework)
                                .addGap(18, 18, 18)
                                .addComponent(paepr1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(pf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paepr8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paepr9)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paepr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paepr7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eraser)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paepr5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(hmk, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paepr2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paepr3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(ec, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paepr4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paepr6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(percent)
                    .addComponent(paepr12))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stage1)
                    .addComponent(score)
                    .addComponent(stage2)
                    .addComponent(money))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stage3)
                    .addComponent(paepr10)
                    .addComponent(stage)
                    .addComponent(paepr11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homework)
                    .addComponent(paepr1))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paepr2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paepr3))
                    .addComponent(hmk, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paepr5)
                    .addComponent(eraser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paepr4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paepr6))
                    .addComponent(ec, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paepr)
                    .addComponent(paepr7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paepr8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paepr9))
                    .addComponent(pf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void hmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hmkActionPerformed

    private void pfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfActionPerformed

    private void ecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ec;
    private javax.swing.JLabel eraser;
    private javax.swing.JButton hmk;
    private javax.swing.JLabel homework;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel money;
    private javax.swing.JLabel name;
    private javax.swing.JButton next;
    private javax.swing.JLabel paepr;
    private javax.swing.JLabel paepr1;
    private javax.swing.JLabel paepr10;
    private javax.swing.JLabel paepr11;
    private javax.swing.JLabel paepr12;
    private javax.swing.JLabel paepr2;
    private javax.swing.JLabel paepr3;
    private javax.swing.JLabel paepr4;
    private javax.swing.JLabel paepr5;
    private javax.swing.JLabel paepr6;
    private javax.swing.JLabel paepr7;
    private javax.swing.JLabel paepr8;
    private javax.swing.JLabel paepr9;
    private javax.swing.JLabel percent;
    private javax.swing.JButton pf;
    private javax.swing.JLabel score;
    private javax.swing.JLabel stage;
    private javax.swing.JLabel stage1;
    private javax.swing.JLabel stage2;
    private javax.swing.JLabel stage3;
    // End of variables declaration//GEN-END:variables
}