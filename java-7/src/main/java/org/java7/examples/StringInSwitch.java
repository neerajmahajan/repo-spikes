package org.java7.examples;

/**
 * Hello world!
 *
 */
public class StringInSwitch 
{
	static String language;
	
    public static void main( String[] args )
    {
    	language = "java";
    	oldWay(language);  //With Java 6 and Before
    	withJava7(language);
    }

	private static void withJava7(String language) {
		
		switch (language) {
		case "groovy":
			System.out.println("it's GROOVY...");
			break;
		case "java":
			System.out.println("it's JAVA...");
			break;
		case "python":
			System.out.println("it's Python...");
			break;
		default:
			System.out.println("it's UNKOWN...");
		}
		
	}

	private static void oldWay(String language) {
		if(language.equals("groovy")){
			System.out.println("it's GROOVY...");
		} else if(language.equals("java")){
			System.out.println("it's JAVA...");
		} else if(language.equals("python")){
			System.out.println("it's Python...");
		} else {
			System.out.println("it's UNKOWN...");
		}
		
		/**
		 * One workaround for this is to convert the String into an enum and then switch on the enum.
		 */
		
	}
}
