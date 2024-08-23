package July.ex27072024;

public class Lab152 {
    public static void main(String[] args) {
        String s1 = "Karthik";
        s1 = "Kumar";

        StringBuffer stringBuffer = new StringBuffer("Karthik");
        stringBuffer.append("Kumar");
        stringBuffer.append("Reddy");

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuffer.append("Sharma");

        // Thead Safety?

        // stringBuilder - not thread safe - people LOVE it :)


    }
}
