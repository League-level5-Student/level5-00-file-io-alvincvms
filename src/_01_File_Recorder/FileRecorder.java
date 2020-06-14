package _01_File_Recorder;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Enter your message here:");
		record(s);
	}
	
	static void record(String s) {
		try {
			FileWriter writer = new FileWriter("src/_01_File_Recorder/Recorded_Stuff");
			writer.write(s);
			writer.close();
		} catch (Exception e) {
			
		}
	}
}

 //Copyright 2020 to a random doggo