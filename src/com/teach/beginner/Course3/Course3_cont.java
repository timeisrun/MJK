package com.teach.beginner.Course3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Course3_cont extends JFrame implements ActionListener, MouseListener{

	public static void main(String[] args) {

		// JFrame
		Course3_cont frm = setJFrame(new Course3_cont());

		// JPanel
		JPanel pnl = Course3.setJPanel(new JPanel());
		frm.add(pnl);
		
		// Action Button type 2
		addActionButton(frm, pnl);

	}

	public static Course3_cont setJFrame(Course3_cont frm) {

		frm.setLayout(null);
		frm.setBounds(100, 100, 500, 500);

		frm.setUndecorated(true);
		frm.setVisible(true);

		frm.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		return frm;

	}
	
	public static void addActionButton(Course3_cont frm, JPanel pnl) {
		
		JButton btn = new JButton();
		btn.setBounds(100, 100, 100, 100);
		pnl.add(btn);
		
		btn.addActionListener(frm);
	
		btn.addMouseListener(frm);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn = (JButton)e.getSource();
		
		btn.setLocation(btn.getLocation().x + 10, btn.getLocation().y);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
