package August.ex18082024;

public class Lab223 {
    public static void main(String[] args) {
        try {
            String s1 = null;
            if(s1 == null){
                throw new Exception("Add a proper string or not null string");
            }
            s1.trim();

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
