//Desire MUKESHANTORE
// INS 23




import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Products> prodList = new ArrayList<>();

        prodList.add(new Scanner("CanoScan","lsla",1006,9));
        prodList.add(new Printer("Xerox","lsla",1084,38));
        prodList.add(new Computer("MacBook","Apple",1134,53));
        prodList.add(new Computer("Lenovo", "Intel", 8765, 80));
        prodList.add(new Printer("HP ScanJet", "HP", 1134, 46));
        prodList.add(new Printer("HP ScanJet","HP",1134,23));
        prodList.add(new Scanner("Fujitsu","lsla",1134,1));
        prodList.add(new Printer("Panasonic","lsla",1134,34));
        prodList.add(new Computer("HP","lsla",1134,001));
        prodList.add(new Scanner("HP","lsla",1134,98));
        prodList.add(new Printer("Lexmark","lsla",1134,676));


        for (Products prod : prodList) {
            System.out.println(prod);
        }
    }
}