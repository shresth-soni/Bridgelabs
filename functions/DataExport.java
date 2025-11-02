interface Exportable {
    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting data to JSON format...");
    }
}

class Report implements Exportable {
    public void exportToCSV() { System.out.println("Exported as CSV."); }
    public void exportToPDF() { System.out.println("Exported as PDF."); }
}

public class DataExport {
    public static void main(String[] args) {
        Report report = new Report();
        report.exportToCSV();
        report.exportToJSON();
    }
}
