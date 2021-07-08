public class SrodkiTransportu {
    public static void main(String[] args) {
        int odleglosc = 10000;
        if(odleglosc <=300){
            System.out.printf("Zasuwaj pieszo");
        }else if(odleglosc < 2700){
            System.out.println("Pojedź rowerem");
        }else if (odleglosc < 10000){
            System.out.println("Wykorzystaj samochód");
        }else{
            System.out.println("Zarezerwuj lot");
        }

    }
}
