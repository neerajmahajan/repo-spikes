package org.java7.examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * try can now have multiple statements in the parenthesis and each statement
 * should create an object which implements the new java.lang.AutoClosable
 * interface. The AutoClosable interface consists of just one method.
 * 
 *  
 * Each AutoClosable resource created in the try statement will be automatically
 * closed! If an exception is thrown in the try block and another Exception is
 * thrown while closing the resource, the first Exception is the one eventually
 * thrown to the caller. The second Exception is available to the caller via the
 * ex.getSupressed() method. Throwable.getSupressed() is a new method added on
 * Throwable in Java 7 just for this purpose.
 * 
 * @author vishalm
 *
 */
public class TryWithResource {
	public static void main(String[] args) {

		try (InputStream is = new FileInputStream(new File("abc.txt"));
				OutputStream as = new FileOutputStream(new File("abc.txt"));) {

			// code to use Input and Output Stream
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
