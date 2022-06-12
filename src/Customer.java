import java.time.LocalDate;
import java.time.Period;

public class Customer implements ICustomer {

    String name;
    String cpf;
    String rg;
    LocalDate dateofBirth;
    int age;

    public Customer(String name, String cpf, String rg, LocalDate dateofBirth){
        this.name = name;
        this.cpf = cpf;
        this.rg = rg;
        this.dateofBirth = dateofBirth;
        this.age = Period.between(dateofBirth, LocalDate.now()).getYears();
    }

    public boolean isAdult(){
        if (this.getAge() >= 18){
            return  true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public int getAge() {
        return age;
    }
}
