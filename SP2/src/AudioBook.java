public class AudioBook extends Title{

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
    }



    @Override
    public double calculatePoints() {
        return (durationInMinutes*0.5)*calculateLiteraturePoints()*copies;
        }

    @Override
    public double calculateLiteraturePoints() {
        return switch (getLiteratureType()){
            case "BI","TE" -> 1.5;
            case "LYRIK" -> 3.0;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0;
    };
    }
}