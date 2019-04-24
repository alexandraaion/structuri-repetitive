public class ex7 {
    public static void main(String[] args) {
        int n = 6;
        int nr = 1;
        int sumaCifrelor = 0;

        for(int i = 0; i < n; i++){
            nr *= 3;
        }

        nr *= 2;

        System.out.println("numarul este: " + nr);
        while (nr != 0){
            sumaCifrelor += nr % 10;
            nr /= 10;
        }

        System.out.println("suma cifrelor este: " + sumaCifrelor);

    }
}
