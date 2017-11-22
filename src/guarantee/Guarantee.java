package guarantee;


import java.time.LocalDate;
import java.time.Period;

public class Guarantee {
    private Product product;
    private LocalDate validUntil;


    public Guarantee(Product product, LocalDate validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    public int isValid(){
        if(LocalDate.now().isAfter(validUntil)) {
            product = null;
        }
        return (int) Period.between(LocalDate.now(), validUntil).getDays();
    }
}
