import java.time.Period;

public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader();
        System.out.println(Reader.takeBooks(reader));
        System.out.println(Reader.returunBooks(reader));
    }
}