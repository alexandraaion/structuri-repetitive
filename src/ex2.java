public class ex2 {

    public static void main(String[] args) {
	    int n = 6;
	    int counter = 1;

	    do{
	        if (n % 2 == 0){
	            n /= 2;
            }else{
	            n = 3 * n +1;
            }
	        counter++;
        }while (n != 1);

		System.out.println("Numarul de iteratii este: " + counter);

    }
}
