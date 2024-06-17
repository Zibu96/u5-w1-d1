package giovannighirardelli.u5_w1_d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter

public class Pizze extends Menu{
    private String pizzaName;


    public Pizze(int calorie, double prezzo, String pizzaName) {
        super( calorie, prezzo);
        this.pizzaName = pizzaName;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "pizzaName='" + pizzaName + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
