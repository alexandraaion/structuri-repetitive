public class ex8 {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int pow = 1;

        for(int i = 0; i < b; i++){
            pow *= a;
        }

        System.out.println(a + " ^ " + b + " este: " + pow);
    }
}
