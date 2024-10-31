public class PrintedBook extends Title {

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }


    @Override
    public double calculatePoints() {
        return pages*calculateLiteraturePoints()*copies;
    }

    @Override
    public double calculateLiteraturePoints() {
        return switch (getLiteratureType()){
            case "BI","TE" -> 3.0;
            case "LYRIK" -> 6.0;
            case "SKØN" -> 1.7;
            case "FAG" -> 1.0;
            default -> 0;
        };
    }
}
