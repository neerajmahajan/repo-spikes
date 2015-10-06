package org.java7.examples;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 * The NIO 2.0 has come forward with many enhancements. It’s also introduced new
 * classes to ease the life of a developer when working with multiple file
 * systems.
 * 
 * @author vishalm
 *
 */
public class NewFileSystemAPI_NIO2 {

	public static void main(String[] args) throws IOException,
			InterruptedException {
		pathInfo();
		watchServiceAPI();
	}

/**
 * Working with Path
 * 
 * A new java.nio.file package consists of classes and interfaces such as Path,
 * Paths, FileSystem, FileSystems and others.
 * 
 * A Path is simply a reference to a file path. It is the equivalent (and with
 * more features) to java.io.File.
 * 
 * You can use other utility methods such as Files.copy(..) and Files.move(..)
 * to act on a file system efficiently. Similarly, use the
 * createSymbolicLink(..) method to create symbolic links using your code.
 * @throws IOException
 */
	static public void pathInfo() throws IOException {

		Path path = Paths.get("/home/vishalm/Desktop/log.txt");
		Files.deleteIfExists(path);
		byte[] b = { 77, 89, 90 };
		Files.createFile(path);
		Files.write(path, b, StandardOpenOption.APPEND);

		System.out.println("Number of Nodes:" + path.getNameCount());

		System.out.println("File Name:" + path.getFileName());

		System.out.println("File Root:" + path.getRoot());

		System.out.println("File Parent:" + path.getParent());

		// Files.deleteIfExists(path);

	}

	/**
	 * WatchService API is a new feature introduced in Java 1.7. It provides an
	 * API that lets you “listen” to a certain type of file system events. Your
	 * code gets called automatically when those events occur. Examples of event
	 * types are captured by StandardWatchEventKinds class. 
	 * ENTRY_CREATE
	 * ENTRY_DELETE 
	 * ENTRY_MODIFY 
	 * Example Here’s a full example of how to watch a
	 * directory and print any newly created files. Run the above program. Then
	 * create a file ‘new.txt’ in the directory ‘logs’. The program will print:
	 * logs: new file created new.txt The implementation will take advantage of
	 * native support for file change notification when supported by the native
	 * file system, but will resort to polling otherwise.
	 * 
	 * @throws IOException
	 * @throws InterruptedException
	 */
	private static void watchServiceAPI() throws IOException,
			InterruptedException {
		Path path = FileSystems.getDefault().getPath(
				"/home/vishalm/Desktop/logs");

		WatchService watcher = FileSystems.getDefault().newWatchService();

		WatchKey watchKey = path.register(watcher,
				StandardWatchEventKinds.ENTRY_CREATE);

		for (;;) {

			WatchKey key = watcher.take();

			if (key.equals(watchKey)) {
				for (WatchEvent event : key.pollEvents()) {
					System.out.println(path + ":new file created - \""
							+ event.context() + "\"");
				}
			}
			key.reset();
		}

	}
}
//------------------------------------
/**
Number of Nodes:4
File Name:log.txt
File Root:/
File Parent:/home/vishalm/Desktop
/home/vishalm/Desktop/logs:new file created - "Screenshot-9.png"
 */

