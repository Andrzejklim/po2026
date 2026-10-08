public class Choinka {
    public static void main(String[] args) {

      int wysokosc = Integer.parseInt(args[0]);
//        int wysokosc = 5;

        for(int x = 0; x < 2; x++){

            for(int i = 0; i < wysokosc; i ++){
                for(int j = wysokosc - 1 - i; j < wysokosc; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }



            for(int i = 0; i < wysokosc; i ++){
                for(int j = i; j < wysokosc; j++){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }
}