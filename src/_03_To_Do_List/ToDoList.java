package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	ArrayList<String> tasks;
	
	ToDoList() {
		tasks = new ArrayList<String>();
	}
	
	public static void main(String[] args) {
		new ToDoList().start();
	}
	
	public void start() {
		JFrame window = new JFrame("To-Do List");
		JPanel panel = new JPanel();
		JButton add = new JButton("Add Task");
		add.addActionListener(this);
		panel.add(add);
		JButton view = new JButton("View Tasks");
		view.addActionListener(this);
		panel.add(view);
		JButton remove = new JButton("Remove Task");
		remove.addActionListener(this);
		panel.add(remove);
		JButton save = new JButton("Save List");
		save.addActionListener(this);
		panel.add(save);
		JButton load = new JButton("Load List");
		load.addActionListener(this);
		panel.add(load);
		window.add(panel);
		window.setLocation(500, 500);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	private void addTask() {
		
	}
	
	private void viewTask() {
		
	}
	
	private void removeTask() {
		
	}
	
	private void saveList() {
		
	}
	
	private void loadList() {
		
	}
}

 //Copyright 2020 to a random doggo