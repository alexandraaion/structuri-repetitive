public class ex4 {
    public static void main(String[] args) {
        int[] a = new int[]{321, 2, 131, 4, 521, 6, 72, 8, 92};
        int nrImpare = 0, nrPare = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 1){
                nrImpare++;
            }else{
                nrPare++;
            }
        }

        System.out.println("avem " + nrImpare + " nr impare si " + nrPare + " nr pare");
    }
}
