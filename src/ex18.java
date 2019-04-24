public class ex18 {
    public static void main(String[] args) {
        char n = 'L';

        switch (n){
            case 'N': case 'S': case 'E': case 'V':
                System.out.println("avem un punct cardinal");
                break;
            default:
                System.out.println("no, boy");
                break;
        }
    }
}
