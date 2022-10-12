package com.brick;

import javax.swing.JFrame;

public class Brickbreaker 
{
	public static void main(String[] args)
	{
		JFrame obj = new JFrame();
		Gameplay gp = new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("BRICK BREAKER");
		obj.setResizable(true);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gp);
	}

}
