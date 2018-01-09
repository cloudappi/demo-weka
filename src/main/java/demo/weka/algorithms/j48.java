//basic motor J48 - by dani

package demo.weka.algorithms;

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
		  System.out.println(tree.toString());
		  return (tree.toSource(className));
	 }
}
