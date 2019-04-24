public class ex3 {
    public static void main(String[] args) {
        int[] a = new int[]{321, 2, 131, 4, 52, 6, 72, 8, 92};
        int max = 0;

        for(int i = 0; i < a.length; i++){
            if((a[i] % 2 == 1) && (max < a[i])){
                max = a[i];
            }
        }

        if(max == 0){
            System.out.println("no");
        }else{
            System.out.println("Cel mai maare nr impar din array este: " + max);
        }
    }
}
