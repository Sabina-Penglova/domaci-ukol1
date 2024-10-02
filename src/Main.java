import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
       Seller prodejceMrkve1 = new Seller();
        Seller prodejceMrkve2 = new Seller();

        prodejceMrkve1.setJmeno("Harry Potter");
        prodejceMrkve1.setAdresa("Kvikálkov");
        prodejceMrkve1.setDatumnarozeni(LocalDate.of(1980,7,31));
        prodejceMrkve1.setPocetsmluv(3);
        prodejceMrkve1.setMnozstvimrkve(8);
        prodejceMrkve1.setNazevmesta("Kvikálkov");
        prodejceMrkve1.setSPZ("1SL 5300");
        prodejceMrkve1.setSpotrebavozidla(6);

        prodejceMrkve2.setJmeno("Ron Weasley");
        prodejceMrkve2.setAdresa("Příčná ulice");
        prodejceMrkve2.setDatumnarozeni(LocalDate.of(1980,3,1));
        prodejceMrkve2.setPocetsmluv(3);
        prodejceMrkve2.setMnozstvimrkve(6);
        prodejceMrkve2.setNazevmesta("Burow");
        prodejceMrkve2.setSPZ("5SF 69959");
        prodejceMrkve2.setSpotrebavozidla(5);

        System.out.println("První prodejce: " + "\n" + "Jmeno: " + prodejceMrkve1.getJmeno() + "\n" + "Cela adresa: " + prodejceMrkve1.getAdresa() + "\n" + "Datum narození: " + prodejceMrkve1.getDatumnarozeni() + "\n" + "Pocet dosud sjednanych smluv: " +  prodejceMrkve1.getPocetsmluv() + "\n" + "Celkove mnozstvi prodane mrkve v tunach: " + prodejceMrkve1.getMnozstvimrkve() + "\n" + "Nazev mesta kde prodejce sidli : " + prodejceMrkve1.getNazevmesta()+ "\n" + "Registracni znacka vozidla: " + prodejceMrkve1.getSPZ() + "\n" + "Spotreba firemniho vozidla v litech na 100km: " + prodejceMrkve1.getSpotrebavozidla() +"\n");
        System.out.println("Druhy prodejce: " + "\n" + "Jmeno: " + prodejceMrkve2.getJmeno() + "\n" + "Cela adresa: " + prodejceMrkve2.getAdresa() + "\n" + "Datum narození: " + prodejceMrkve2.getDatumnarozeni() + "\n" + "Pocet dosud sjednanych smluv: " +  prodejceMrkve2.getPocetsmluv() + "\n" + "Celkove mnozstvi prodane mrkve v tunach: " + prodejceMrkve2.getMnozstvimrkve() + "\n" + "Nazev mesta kde prodejce sidli : " + prodejceMrkve2.getNazevmesta()+ "\n" + "Registracni znacka vozidla: " + prodejceMrkve2.getSPZ() + "\n" + "Spotreba firemniho vozidla v litech na 100km: " + prodejceMrkve2.getSpotrebavozidla());


    }
}