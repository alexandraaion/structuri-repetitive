public class ex15 {
    public static void main(String[] args) {
        int n = 14, m = 16;
        int inv = 0;

        while(n != 0){
            inv = inv * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(inv == m);
    }
}
