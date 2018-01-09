package demo.weka;

import java.io.File;
import java.io.PrintWriter;

import demo.weka.algorithms.j48;

public class App 
{
	private static String CLASS_NAME = "motor";
	private static String CLASS_OUT = CLASS_NAME + ".java";
	private static String PATH_OUT = "out/";
	private static String PATH_DATA = "arff/prueba.arff";
	
    public static void main( String[] args )
    {
        j48 algorithmJ48 = new j48();
        try {
        	buildClass(algorithmJ48.run(PATH_DATA, CLASS_NAME));
		} catch (Exception e) {
			System.out.println(e);
		}
    }
    
    public static void buildClass(String source) throws Exception {
    	File file = new File(PATH_OUT, CLASS_OUT);
    	PrintWriter writer = new PrintWriter(file);
    	writer.println(source);
    	writer.close();
    }
}
