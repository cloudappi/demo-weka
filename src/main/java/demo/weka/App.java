package demo.weka;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
			tree = parseTree(tree); 
			System.out.println(tree);
			ArrayList<Branch> objTree = saveTree(tree);

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

	public static String parseTree(String tree) {
		Scanner scanner = new Scanner(tree);
		String parse = "";
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine().trim();
			if ((!line.startsWith("J48 pruned tree") 
					&& !line.startsWith("------------------") 
					&& line.length()!=0
					&& !line.startsWith("Number of Leaves")
					&& !line.startsWith("Size of the tree"))) {
				parse+=line.toString()+"\n";		
			}
		}
		scanner.close();
		return parse;
	}
	
	public static ArrayList<Branch> saveTree(String tree) {
		Scanner scanner = new Scanner(tree);
		ArrayList<Branch> objTree = new ArrayList(); 
		while (scanner.hasNextLine()) {
			Branch branch = new Branch();
			String line = scanner.nextLine().trim();
			String[] parts = line.split("   ");
			branch.setDepth(parts.length-1);
			branch.setName(parts[parts.length-1].split(" ")[0].toUpperCase());
			branch.setOperation(parts[parts.length-1].split(" ")[1]);
			branch.setValue(parts[parts.length-1].split(" ")[2]);
			if(parts[parts.length-1].split(":").length>1) {
				branch.setResult(parts[parts.length-1].split(":")[1]);
				branch.setEnd(true);
			}
			objTree.add(branch);
			System.out.println(branch.getDepth()+":("+branch.getName()+" "+branch.getOperation()+" "+branch.getValue()+" "+branch.getResult()+")");
		}
		scanner.close();
		return objTree;
	}
	
	public static void clasify(ArrayList<Branch> tree) {
		Boolean end = false;
		for(int x=0;x<tree.size();x++) {
			  
		}
	}
	
	public static class Branch{
		private Integer depth;
		private String name;
		private String operation;
		private String value;
		private String result="";
		private Boolean end=false;
		public Integer getDepth() {
			return depth;
		}
		public void setDepth(Integer depth) {
			this.depth = depth;
		}
		public String getOperation() {
			return operation;
		}
		public void setOperation(String operation) {
			this.operation = operation;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public Boolean getEnd() {
			return end;
		}
		public void setEnd(Boolean end) {
			this.end = end;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
}
