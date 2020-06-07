package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileEncryptor {
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message and a key from the user.
	 * Use the key to shift each letter in the users input and save the final result to a file.
	 */
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("Enter your message:");
		int key = Integer.parseInt(JOptionPane.showInputDialog("Enter your key:"));
		String name = JOptionPane.showInputDialog("Enter your file's name:");
		message = encrypt(message, key);
		saveToFile(name, message);
	}
	
	private static String encrypt(String s, int key) {
		String encrypted = "";
		for(char c : s.toCharArray()) {
			encrypted += (char) (c + key);
		}
		return encrypted;
	}
	
	private static void saveToFile(String fileName, String content) {
		try {
			FileWriter writer = new FileWriter("src/_02_File_Encrypt_Decrypt/" + fileName);
			writer.write(content);
			writer.close();
		} catch (Exception e) {
			
		}
	}
}
