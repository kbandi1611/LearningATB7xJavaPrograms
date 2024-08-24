package August.ex18082024;

public class Lab220 {
    //throw
    //Custom Exception
    public static void main(String[] args) throws Exception{
        Bank SBI = new Bank("INR", 100);
//        Bank ICICI = new Bank("INR", 10);
//        Integer total = SBI.add(ICICI);
//        System.out.println(total);

        Bank JPMorgan = new Bank("USD", 89);
        Integer totalnew = SBI.add(JPMorgan);
        System.out.println(totalnew);
    }



}
