package demo.weka;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import demo.weka.algorithms.Branch;
import demo.weka.algorithms.Instance;
import demo.weka.algorithms.j48;

public class App {
	private static String CLASS_NAME = "motor";
	private static String CLASS_OUT = CLASS_NAME + ".java";
	private static String PATH_OUT = "out/";
	private static String PATH_DATA = "arff/prueba.arff";

	public static void main(String[] args) {
		j48 algorithmJ48 = new j48();
		try {
			String tree = algorithmJ48.run(PATH_DATA, CLASS_NAME);
			tree = algorithmJ48.parseTree(tree); 
			System.out.println(tree);
			ArrayList<Branch> objTree = algorithmJ48.saveTree(tree);
			ArrayList<Instance> instances = example();
			
			algorithmJ48.clasify(objTree, instances);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static ArrayList<Instance> example(){
		
		ArrayList<Instance> instances = new ArrayList();
		
		Instance i1 = new Instance();
		i1.setName("HIJOS");
		i1.setValue("YES");
		instances.add(i1);
		
		Instance i2 = new Instance();
		i2.setName("INGRESOS");
		i2.setValue("20000");
		instances.add(i2);
		
		Instance i3 = new Instance();
		i3.setName("COCHE");
		i3.setValue("YES");
		instances.add(i3);
		
		return instances;
	}

	public static void buildClass(String source) throws Exception {
		File file = new File(PATH_OUT, CLASS_OUT);
		PrintWriter writer = new PrintWriter(file);
		writer.println(source);
		writer.close();
	}
	
}
