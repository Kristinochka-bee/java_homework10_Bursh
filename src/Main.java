public class Main {
    public static void main(String[] args) {

            int count = 0;
            for (int i = 0; i <= 163; i = i + 5 - 1) {
                count++;
            }
            System.out.println(count);
        }

        static void BurshWhile() {
            int count = 0;
            int i = 0;
            while (i<163 ){
                i= i + 5 - 1;
                count ++;
            }
            System.out.println(count); //41
        }

        
        static void BurshDoWhile(){
            int count =0;
            int i = 0;
            do {
                i=i+5-1;
                count++;
            }while (i<163);
            System.out.println(count); //41

        }
    }
