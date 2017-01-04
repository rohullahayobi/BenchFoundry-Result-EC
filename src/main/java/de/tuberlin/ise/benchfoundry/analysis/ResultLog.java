package de.tuberlin.ise.benchfoundry.analysis;

import de.tuberlin.ise.benchfoundry.util.BenchFoundryConfigData;

public class ResultLog {

	public static void main(String[] args) {
		try {
			ResultLogReader logReader = new ResultLogReader();
			logReader.load(BenchFoundryConfigData.resultDir + "/result.log");
			logReader.dump(BenchFoundryConfigData.resultDir + "/result.csv");
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}

}
