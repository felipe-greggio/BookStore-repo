import java.time.LocalDate;
import java.util.Calendar;

public interface ICustomer {

    boolean isAdult();

    String getName();

    String getCpf();

    String getRg();

    LocalDate getDateofBirth();

    int getAge();
}
