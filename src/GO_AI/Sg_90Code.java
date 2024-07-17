/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GO_AI;
import java.awt.Color;
public class Sg_90Code extends javax.swing.JFrame {

    /**
     * Creates new form Sg_90Code
     */
    public Sg_90Code() {
        initComponents();
        jLabel5.setText("HELLO, STUDENT");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        workspace = new javax.swing.JPanel();
        wo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        setting = new javax.swing.JPanel();
        se = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        robots = new javax.swing.JPanel();
        ro = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        feedback = new javax.swing.JPanel();
        fe = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        in = new javax.swing.JPanel();
        instructor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jSeparator1.setBackground(new java.awt.Color(55, 55, 55));
        jSeparator1.setForeground(new java.awt.Color(253, 31, 74));
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(55, 55, 55), 1, true));

        workspace.setBackground(new java.awt.Color(204, 0, 51));
        workspace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                workspaceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                workspaceMouseExited(evt);
            }
        });

        wo.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        wo.setForeground(new java.awt.Color(235, 235, 235));
        wo.setText("WORKSPACE");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GO_AI/icons8-software-application-programming-with-brackets-and-slash-logotype-24.png"))); // NOI18N

        javax.swing.GroupLayout workspaceLayout = new javax.swing.GroupLayout(workspace);
        workspace.setLayout(workspaceLayout);
        workspaceLayout.setHorizontalGroup(
            workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workspaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(21, 21, 21)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(wo)
                .addGap(18, 18, 18))
        );
        workspaceLayout.setVerticalGroup(
            workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workspaceLayout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(workspaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workspaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(55, 55, 55));
        jPanel2.setLayout(null);

        setting.setBackground(new java.awt.Color(55, 55, 55));
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingMouseExited(evt);
            }
        });

        se.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        se.setForeground(new java.awt.Color(235, 235, 235));
        se.setText("SETTING");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GO_AI/icons8-advanced-search-24.png"))); // NOI18N

        javax.swing.GroupLayout settingLayout = new javax.swing.GroupLayout(setting);
        setting.setLayout(settingLayout);
        settingLayout.setHorizontalGroup(
            settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, settingLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(se)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        settingLayout.setVerticalGroup(
            settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(se))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(setting);
        setting.setBounds(0, 130, 180, 46);

        robots.setBackground(new java.awt.Color(55, 55, 55));
        robots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                robotsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                robotsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                robotsMouseExited(evt);
            }
        });

        ro.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        ro.setForeground(new java.awt.Color(235, 235, 235));
        ro.setText("ROBOTS");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GO_AI/icons8-microprocessor-technology-with-artificial-intelligence-isolated-on-a-white-background-24.png"))); // NOI18N

        javax.swing.GroupLayout robotsLayout = new javax.swing.GroupLayout(robots);
        robots.setLayout(robotsLayout);
        robotsLayout.setHorizontalGroup(
            robotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, robotsLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(ro)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        robotsLayout.setVerticalGroup(
            robotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(robotsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(robotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(ro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(robots);
        robots.setBounds(0, 70, 180, 50);

        feedback.setBackground(new java.awt.Color(55, 55, 55));
        feedback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                feedbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                feedbackMouseExited(evt);
            }
        });

        fe.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        fe.setForeground(new java.awt.Color(235, 235, 235));
        fe.setText("FEEDBACK");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GO_AI/icons8-comments-25 (1).png"))); // NOI18N

        javax.swing.GroupLayout feedbackLayout = new javax.swing.GroupLayout(feedback);
        feedback.setLayout(feedbackLayout);
        feedbackLayout.setHorizontalGroup(
            feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedbackLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(fe)
                .addGap(33, 33, 33))
        );
        feedbackLayout.setVerticalGroup(
            feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(fe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(feedback);
        feedback.setBounds(0, 10, 180, 47);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AI/icons8-go-back-64.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 270, 64, 64);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("|");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GO_AI/icons8-name-64.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(235, 235, 235));
        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(235, 235, 235));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(35, 35, 35));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(230, 230, 230));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 792, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(55, 55, 55));
        jPanel3.setLayout(null);

        in.setBackground(new java.awt.Color(55, 55, 55));
        in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inMouseExited(evt);
            }
        });

        instructor.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        instructor.setForeground(new java.awt.Color(235, 235, 235));
        instructor.setText("INSTRUCTOR");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GO_AI/icons8-instructor-teaching-about-its-geometrical-angle-isolated-on-a-white-background-24 (2).png"))); // NOI18N

        javax.swing.GroupLayout inLayout = new javax.swing.GroupLayout(in);
        in.setLayout(inLayout);
        inLayout.setHorizontalGroup(
            inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(instructor)
                .addGap(19, 19, 19))
        );
        inLayout.setVerticalGroup(
            inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(instructor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(in);
        in.setBounds(0, 30, 180, 40);

        jPanel4.setBackground(new java.awt.Color(55, 55, 55));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane2.setBackground(new java.awt.Color(55, 55, 55));

        jTextArea1.setBackground(new java.awt.Color(55, 55, 55));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(230, 230, 230));
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(10);
        jTextArea1.setText("#include <Servo.h>\nServo servo;\nint angle = 10;\nvoid setup() {\n  servo.attach(8);\n  servo.write(angle);\n}\nvoid loop() \n{ \n // scan from 0 to 180 degrees\n  for(angle = 10; angle < 180; angle++)  \n  {                                  \n    servo.write(angle);               \n    delay(15);                   \n  } \n  // now scan back from 180 to 0 degrees\n  for(angle = 180; angle > 10; angle--)    \n  {                                \n    servo.write(angle);           \n    delay(15);       \n  } \n}");
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 0, 51)));
        jTextArea1.setSelectionColor(new java.awt.Color(204, 0, 51));
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(workspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(workspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void workspaceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workspaceMouseEntered

    }//GEN-LAST:event_workspaceMouseEntered

    private void workspaceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workspaceMouseExited

    }//GEN-LAST:event_workspaceMouseExited

    private void settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseClicked
        new GO_AI.Setting().setVisible(true);
        dispose();
    }//GEN-LAST:event_settingMouseClicked

    private void settingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseEntered
        setting.setBackground(new Color(20,20,20));
        se.setForeground(new Color(204,0,51));
    }//GEN-LAST:event_settingMouseEntered

    private void settingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseExited
        setting.setBackground(new Color(55,55,55));
        se.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_settingMouseExited

    private void robotsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_robotsMouseEntered
        robots.setBackground(new Color(20,20,20));
        ro.setForeground(new Color(204,0,51));
    }//GEN-LAST:event_robotsMouseEntered

    private void robotsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_robotsMouseExited
        robots.setBackground(new Color(55,55,55));
        ro.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_robotsMouseExited

    private void feedbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMouseClicked
        new GO_AI.Feedback().setVisible(true);
        dispose();
    }//GEN-LAST:event_feedbackMouseClicked

    private void feedbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMouseEntered
        feedback.setBackground(new Color(20,20,20));
        fe.setForeground(new Color(204,0,51));
    }//GEN-LAST:event_feedbackMouseEntered

    private void feedbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMouseExited
        feedback.setBackground(new Color(55,55,55));
        fe.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_feedbackMouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new GO_AI.Sg_90().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(new Color(55,55,55));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void inMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inMouseClicked
        new GO_AI.Instructor().setVisible(true);
        dispose();
    }//GEN-LAST:event_inMouseClicked

    private void inMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inMouseEntered
        in.setBackground(new Color(20,20,20));
        instructor.setForeground(new Color(204,0,51));
    }//GEN-LAST:event_inMouseEntered

    private void inMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inMouseExited
        in.setBackground(new Color(55,55,55));
        instructor.setForeground(new Color(235,235,235));
    }//GEN-LAST:event_inMouseExited

    private void robotsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_robotsMouseClicked
        new GO_AI.Robot().setVisible(true);
        dispose();
    }//GEN-LAST:event_robotsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sg_90Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sg_90Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sg_90Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sg_90Code.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sg_90Code().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fe;
    private javax.swing.JPanel feedback;
    private javax.swing.JPanel in;
    private javax.swing.JLabel instructor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel ro;
    private javax.swing.JPanel robots;
    private javax.swing.JLabel se;
    private javax.swing.JPanel setting;
    private javax.swing.JLabel wo;
    private javax.swing.JPanel workspace;
    // End of variables declaration//GEN-END:variables
}
