public class ex0 {
    public static void main(String[] args) {
        String luna = "mai";

        switch (luna){
            case "ianuarie": case "martie": case "mai": case "iulie": case "august": case "octombrie": case "decembrie":
                System.out.println("luna cu 31 de zile");
                break;
            case "aprilie": case "iunie": case "septembrie": case "noiembrie":
                System.out.println("luna CU 30 de zile");
                break;
            case "februarie":
                System.out.println("28 sau 29 de zile, depinde de an :D");
                break;
            default:
                System.out.println("asta nu e o luna");
                break;
        }
    }
}
