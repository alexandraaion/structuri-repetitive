public class ex12_ifelse {
    public static void main(String[] args) {
        int n = 13;
        if((n == 0) || (n == 1) || (n == 11)){
            System.out.println("este iarna");
        }else if((n == 2) || (n == 3) || (n == 4)){
            System.out.println("este primavara");
        }else if((n == 5) || (n == 6) || (n == 7)){
            System.out.println("este vara");
        }else if((n == 8) || (n == 9) || (n == 10)){
            System.out.println("este toamna");
        }else{
            System.out.println("nu avem anotimp");
        }
    }
}
