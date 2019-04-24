public class ex10 {
    public static void main(String[] args) {
        int n = 10, sumaNrPare = 0;
        int nrPare = 0;
        int[] a = new int[]{1, 22, 3, 4, 5, 6, 7, 8, 9, 10, 12};

        for(int i = 0; i < n; i++){
            if((a[i] % 2 == 0) && (nrPare < 5)){
                sumaNrPare += a[i];
                nrPare++;
            }
        }

        if (nrPare == 5) {
            System.out.println("suma primelor 5 nr pare este: " + sumaNrPare);
        }else{
            System.out.println("nu avem destule nr pare :( ");
        }
    }
}
