public class ShopAssistant {
    public static void main(String[] args) {
        double cash = 5;
        double bradPrice = 2.1;
        double butterPrice = 3.41;
        double rollPrice = 0.58;

        if(bradPrice + butterPrice < 5){
            System.out.printf("Kupiłem chleb i masło");

        } else if(2*rollPrice + butterPrice <= cash){
            System.out.printf("Kupiłem 2 bułki i masło");

        } else if(rollPrice <=cash){
            System.out.println("Kupiłem bułkę");
        }else{
            System.out.printf("Nic nie kupiłem");
        }
    }
}
