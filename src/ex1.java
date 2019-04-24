public class ex1 {
    public static void main(String[] args){
        String[] diez = new String[5];
        String[] spatiu = new String[4];
        diez[0] = "";
        spatiu[0] = "";
        for(int i = 1; i <= 7; i++){
            if(i <= 3){
                diez[i] = diez[i-1] + "#";
                spatiu[i] = spatiu[i-1] + " ";
                System.out.print(diez[i] + spatiu[i]);
            }else if (i == 4){
                diez[i] = diez[i-1] + "#";
                System.out.print(diez[i] + spatiu[i-1]);
            }else if (i == 5){
                System.out.print(diez[3] + spatiu[2]);
            }else if(i == 6){
                System.out.print(diez[2] + spatiu[2]);
            }else{
                System.out.print(diez[1]);
            }


        }
        //# ##  ###   ####   ###  ##  #
    }
}
