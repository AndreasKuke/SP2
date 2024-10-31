import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;


    Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    void addTitle(Title title){
        titles.add(title);

    }

    float calculateTotalPay(){
       float totalPay = 0;
       for (Title title : titles){
           totalPay += title.calculateRoyalty();
       }
       return totalPay;
    }

    public String getName() {
        return name;
    }
}
