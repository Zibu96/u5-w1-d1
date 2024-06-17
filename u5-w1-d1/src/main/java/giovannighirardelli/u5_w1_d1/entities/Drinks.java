package giovannighirardelli.u5_w1_d1.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
public class Drinks extends Menu{
    private String drinkName;


    public Drinks(int calorie, double prezzo, String drinkName) {
        super(calorie, prezzo);
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" + drinkName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
