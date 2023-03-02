import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class classroom extends JFrame {
/**
*
*/
private static final long serialVersionUID = 1L;
static classroom frame;
private JPanel contentPane;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
frame= new classroom();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public classroom() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);

JLabel lblclassroomManagement = new JLabel("Classroom Management ");
lblclassroomManagement.setFont(new Font("Tahoma", Font.PLAIN, 18));
lblclassroomManagement.setForeground(Color.GRAY);

JButton btnadmin = new JButton("Admin Login");
btnadmin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
 admin.main(new String[]{});
frame.dispose();
}
});
btnadmin.setFont(new Font("Tahoma", Font.PLAIN, 15));

JButton btnStudentlogin = new JButton("Student Login");
btnStudentlogin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
Studentlogin.main(new String[]{});
}
});
btnStudentlogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
GroupLayout gl_contentPane = new GroupLayout(contentPane);
gl_contentPane.setHorizontalGroup(
gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(64)
.addComponent(lblclassroomManagement))
.addGroup(gl_contentPane.createSequentialGroup()
.addGap(140)
.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
.addComponent(btnStudentlogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
.addComponent(btnadmin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
.addContainerGap(95, Short.MAX_VALUE))
);
gl_contentPane.setVerticalGroup(
gl_contentPane.createParallelGroup(Alignment.LEADING)
.addGroup(gl_contentPane.createSequentialGroup()
.addContainerGap()
.addComponent(lblclassroomManagement)
.addGap(32)
.addComponent(btnadmin, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
.addPreferredGap(ComponentPlacement.UNRELATED)
.addComponent(btnStudentlogin, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
.addContainerGap(70, Short.MAX_VALUE))
);
contentPane.setLayout(gl_contentPane);
}
}