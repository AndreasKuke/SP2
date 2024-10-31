public class LibraryRoyaltyCalculator {
    public static void main(String[] args){
        Author author1 = new Author("J.R.R. Tolkien");
        Author author2 = new Author("Frodo Baggins");
        Author author3 = new Author("Sauron");

        author1.addTitle(new AudioBook("Lord of the rings","SKØN",150350,3240));
        author1.addTitle(new PrintedBook("The hobbit","TE",430150,700));
        author1.addTitle(new PrintedBook("The fall of Gondolin","FAG",20000,400));

        author2.addTitle(new AudioBook("How to love rings","FAG",10,600));
        author2.addTitle(new PrintedBook("Missing a finger","LYRIK",40,10));
        author2.addTitle(new AudioBook("Hobbit hole","BI",230,4000));

        author3.addTitle(new PrintedBook("How to conquer middle-earth","FAG",300000,2400));
        author3.addTitle(new AudioBook("How to not lose your ring","TE",2,30));
        author3.addTitle(new AudioBook("How to ressurect","SKØN",1,20));

        double totalPay1 = author1.calculateTotalPay();
        double totalPay2 = author2.calculateTotalPay();
        double totalPay3 = author3.calculateTotalPay();

        System.out.println(author1.getName() +" has made: " + totalPay1+" dkk");
        System.out.println(author2.getName() +" has made: " + totalPay2+" dkk");
        System.out.println(author3.getName() +" has made: " + totalPay3+" dkk");
    }
}
