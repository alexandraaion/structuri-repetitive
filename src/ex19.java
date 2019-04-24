public class ex19 {
    public static void main(String[] args) {
        long n = 2890205335578L;
        String lunaNastere = "";
        String sex;
        int anNastere;
        int ziNastere;
        int luna;
        n = n / 1000000;

        ziNastere = (int)n % 100;
        n = n / 100;
        luna = (int)n % 100;
        n = n / 100;
        anNastere = (int)n % 100;
        n = n / 100;

        switch ((int)n){
            case 1: case 2:
                anNastere += 1900;
                break;
            case 3: case 4:
                anNastere += 1800;
                break;
            case 5: case 6:
                anNastere += 2000;
                break;
            default:
                break;
        }

        switch (luna){
            case 1:
                lunaNastere = "ianuarie";
                break;
            case 2:
                lunaNastere = "februarie";
                break;
            case 3:
                lunaNastere = "martie";
                break;
            case 4:
                lunaNastere = "aprilie";
                break;
            case 5:
                lunaNastere = "mai";
                break;
            case 6:
                lunaNastere = "iunie";
                break;
            case 7:
                lunaNastere = "iulie";
                break;
            case 8:
                lunaNastere = "august";
                break;
            case 9:
                lunaNastere = "septembrie";
                break;
            case 10:
                lunaNastere = "octombrie";
                break;
            case 11:
                lunaNastere = "noiembrie";
                break;
            case 12:
                lunaNastere = "decembrie";
                break;
            default:
                break;
        }
        if(n % 2 == 0){
            System.out.println("fata nascuta pe "+ ziNastere + " " + lunaNastere + " " + anNastere );

        }else{
            System.out.println("baiat nascut pe "+ ziNastere + " " + lunaNastere + " " + anNastere );
        }

    }
}
