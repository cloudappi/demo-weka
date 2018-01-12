//basic motor J48 - by dani

package demo.weka.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

import weka.classifiers.trees.J48;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class j48 {
	public String run(String pathData, String className) throws Exception {
		  DataSource source = new DataSource(pathData);
		  Instances dataset = source.getDataSet();
		  dataset.setClassIndex(dataset.numAttributes()-1);
		  J48 tree = new J48();
		  tree.buildClassifier(dataset);
		  //System.out.println(tree.toString());
		  //return (tree.toSource(className));	  
		  return tree.toString();
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
				branch.setValue(branch.getValue().split(":")[0]);
				branch.setResult(parts[parts.length-1].split(":")[1]);
				branch.setEnd(true);
			}
			objTree.add(branch);
			System.out.println(branch.getDepth()+":("+branch.getName()+" "+branch.getOperation()+" "+branch.getValue()+" "+branch.getResult()+")");
		}
		scanner.close();
		return objTree;
	}
	
	public static void clasify(ArrayList<Branch> tree,ArrayList<Instance> instances) {
		Boolean end = false;
		Integer depth = 0;
		Integer lastDepth = 0;
		String result = "";
		for(int i=0;i<tree.size()&&!end;i++) {
			for(int j=0;j<instances.size()&&!end;j++) {
				Branch branch = tree.get(i);
				Instance data = instances.get(j);
				if(branch.getDepth()>=lastDepth) {
					if(branch.getName().equals(data.getName()) && branch.getDepth()==depth){
						if(branch.getOperation().equals("=")&&branch.getValue().equals(data.getValue())
								|| branch.getOperation().equals("<=")&&Double.parseDouble(data.getValue())<=Double.parseDouble(branch.getValue())
								|| branch.getOperation().equals(">")&&Double.parseDouble(data.getValue())>Double.parseDouble(branch.getValue())) {
							depth++;
							lastDepth = branch.getDepth();
							if(branch.getEnd()) {
								result += branch.getResult();
								end = true;
							}
						}	
					}
				}else {
					break;
				}
			} 
		}
		System.out.println("\n\n RESULT EXAMPLE: "+result);
	}
	
}
