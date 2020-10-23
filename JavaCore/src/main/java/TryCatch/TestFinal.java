package TryCatch;

public class TestFinal {
    public static void main(String[] args) {
        try {
            int data = 25/5;
            System.out.println(data);
        } catch (NullPointerException e){
            System.out.println(e);
        } finally {
            System.out.println("Block is always excuted");
        }
        System.out.println("rest of the code.");
    }
}
