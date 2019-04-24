public class ex12_switch {
    public static void main(String[] args) {
        int n = 3;
        switch (n) {
            case 0: case 1: case 11:
                System.out.println("este iarna");
                break;
            case 2: case 3: case 4:
                System.out.println("este primavara");
                break;
            case 5: case 6: case 7:
                System.out.println("este vara");
                break;
            case 8: case 9: case 10:
                System.out.println("este toamna");
                break;
            default:
                System.out.println("nu avem anotimp");
                break;
        }
    }
}
