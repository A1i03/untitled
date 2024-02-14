import java.time.LocalDate;

public class Reader {
    String fullName;
    int library;
    String cardNumber;
    LocalDate dateOfBirth;
    String phoneNumber;

    public Reader(){}

    public static int takeBooks(Reader reader){
        reader.fullName = "Jon Smik";
        reader.library = 6;
        reader.cardNumber = "154284658420";
        reader.dateOfBirth = LocalDate.of(2003,04,14);
        reader.phoneNumber = "+996 (553 14 04 01)";
        System.out.println(reader.fullName + " " + "Китеп алды: ");
        return reader.library;
    }
    public static int returunBooks(Reader reader){
        reader.fullName = "Jon Smik";
        reader.library = 6;
        reader.cardNumber = "154284658420";
        reader.dateOfBirth = LocalDate.of(2003,04,14);
        reader.phoneNumber = "+996 (553 14 04 01)";
        System.out.println(reader.fullName + " " + "(Китеп) Кайра кайтарып берди: ");
        return reader.library;
    }
}
