package giovannighirardelli.u5_w1_d1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter


public class Condimenti extends Menu{
    private String condimentiName;


    public Condimenti(int calorie, double prezzo, String condimentiName) {
        super(calorie, prezzo);
        this.condimentiName = condimentiName;
    }


    @Override
    public String toString() {
        return "Condimenti{" +
                "condimentiName='" + condimentiName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
