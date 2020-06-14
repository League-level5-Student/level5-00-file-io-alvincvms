package _04_Directory_Iteration;

import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;

public class DirectoryIterator {
	public static void main(String[] args) {
		/* 
		 * The following is an example of how to list all of the files in a directory.
		 * Once the program is running, the directory is chosen using the JFileChooser.
		 */
		JFileChooser jfc = new JFileChooser();
		jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int returnVal = jfc.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File directory = jfc.getSelectedFile();
			File[] files = directory.listFiles();
			if(files != null) {
				for(File f : files) {
				  System.out.println(f.getAbsolutePath());
				}
			}
		}
		
		/*
		 * Your task is to write a program that iterates through the src folder of this current Java Project. 
		 * For every .java file it finds, the program will add a (non-legally binding) copyright statement at the bottom.
		 * Be aware of possible directories inside of directories.
		 * (e.g //Copyright © 2019 FirstName LastName)
		 */
		
		for(File p : new File("src").listFiles()) {
			for(File f : p.listFiles()) {
				if(f.getAbsolutePath().endsWith(".java")) {
					try {
						FileWriter writer = new FileWriter(f, true);
						writer.write("\n //Copyright 2020 to a random doggo");
						writer.close();
					} catch (Exception e) {
						
					}
				}
			}
		}
	}
}

 //Copyright 2020 to a random doggo