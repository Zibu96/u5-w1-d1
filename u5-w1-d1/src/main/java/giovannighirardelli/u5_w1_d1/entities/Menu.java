package giovannighirardelli.u5_w1_d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Menu {
    protected long id;
    protected int calorie;
    protected double prezzo;


    public Menu(int calorie, double prezzo) {
        Random rnd = new Random();
        this.id = rnd.nextLong();
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

}
