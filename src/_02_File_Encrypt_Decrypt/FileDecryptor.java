package _02_File_Encrypt_Decrypt;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your file's name:");
		int key = Integer.parseInt(JOptionPane.showInputDialog("Enter your key:"));
		JOptionPane.showMessageDialog(null, decrypt(readFile(name), key));
	}
	
	private static String decrypt(String s, int key) {
		String decrypted = "";
		for(char c : s.toCharArray()) {
			decrypted += (char) (c - key);
		}
		return decrypted;
	}
	
	private static String readFile(String fileName) {
		String text = "";
		try {
			FileReader reader = new FileReader("src/_02_File_Encrypt_Decrypt/" + fileName);
			int c = reader.read();
			while(c != -1) {
				text += (char) c;
				c = reader.read();
			}
			reader.close();
			return text;
		} catch (Exception e) {
			return text;
		}
	}
}
