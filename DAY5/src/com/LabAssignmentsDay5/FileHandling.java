//File not found Exception
package com.LabAssignmentsDay5;
import java.io.File;
import java.io.FileInputStream;


public class FileHandling {
	
	
		public static void main(String[] args) throws Exception {

			File file = new File("fileTest.txt");
			FileInputStream fis = new FileInputStream(file);

	        int data;
			while ((data = fis.read()) != -1) {
				System.out.write(data);
	        }
	        System.out.print((char)data);
			fis.close();
		}
	}




