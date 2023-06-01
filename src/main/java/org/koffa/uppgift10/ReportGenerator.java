package org.koffa.uppgift10;

public class ReportGenerator {
    private DataReader dataReader;
    public ReportGenerator(DataReader dataReader) {
        this.dataReader = dataReader;
    }
    public DataReaderResult getDataReaderResult() {
        return dataReader.getDataReaderResult();
    }
    public Report generateReport(DataReaderResult dataReaderResult) {
        return new Report().fromDataReaderResult(dataReaderResult);
    }
}
