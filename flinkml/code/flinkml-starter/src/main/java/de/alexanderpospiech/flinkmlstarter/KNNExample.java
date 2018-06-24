package de.alexanderpospiech.flinkmlstarter;


import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.io.CsvReader;
import org.apache.flink.ml.common.ParameterMap;
import org.apache.flink.ml.nn.KNN;
import org.apache.flink.ml.pipeline.FitOperation;

/**
 * 
 */
public class KNNExample {

	public static void main(String[] args) throws Exception {
		final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

		CsvReader csvReader = env.readCsvFile("/home/apospiech/Dokumente/Weiterbildung/DataScienceMaster/DataScienceMaster/flinkml/train.csv");
		
		KNN knnJob = new KNN()
			.setK(3)
		;
		
		ParameterMap fitParameters = new ParameterMap();
		new FitOperation<KNN, Training>() {
		};
		
		knnJob.fit(csvReader, fitParameters, fitOperation);
		// execute program
		env.execute("Flink Batch Java API Skeleton");
	}
}
