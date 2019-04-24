public class ex16 {
    public static void main(String[] args) {
        int n = 12345;
        int aux = n;
        int sumaPozitiiPare = 0;
        int nrCifre = 0;

        //aflam nr de cifre al lui n
        while(aux != 0){
            nrCifre ++;
            aux /= 10;
        }

        if(nrCifre % 2 == 0){
            n = n / 10;
        }

        while (n != 0){
            sumaPozitiiPare += n % 10;
            n = n / 100;
        }

        System.out.println("suma cifrelor de pe pozitii pare este: " + sumaPozitiiPare);


    }
}
