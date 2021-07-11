public class laptopPrices {
    public static void main(String[] args) {
        double[] laptopPrices;
        laptopPrices = new double[3];
        laptopPrices[0] = 6556565;
        laptopPrices[1] = 4444;
        laptopPrices[2] = 778787878;
        if(laptopPrices[0] < laptopPrices[1] && laptopPrices[0] < laptopPrices[2])   {
            System.out.println("Laptop numer 1 jest najtańszy");
        }else if(laptopPrices[1] < laptopPrices[0] && laptopPrices[1] < laptopPrices[2] ){
            System.out.println("Laptop numer 2 jest najtańszy");

        }else {
            System.out.println("Laptop nr 3 jest najtańszy");
        }
    }



}
