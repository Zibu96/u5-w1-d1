package giovannighirardelli.u5_w1_d1.entities;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {

@Bean
    public Pizze pizza1 (){

    return new Pizze(250, 12.90, "Capricciosa");

}

@Bean
    public Pizze pizza2 (){
    return new Pizze(300, 8.90, "Margherita");
}

@Bean
    public Pizze pizza3(){
    return new Pizze(200, 7.50, "Marinara");

}
@Bean
    public Pizze pizza4(){
    return new Pizze(500, 13, "Tutti i gusti più uno");
}
@Bean
    public Pizze pizza5(){
    return new Pizze(130, 6.70, "Bianca");

}
@Bean
    public Condimenti condimento1(){
    return new Condimenti(80, 2, "Salame");

}
@Bean
    public Condimenti condimento2(){
    return new Condimenti(30, 1.5, "Pomodorini");

}
@Bean
    public Condimenti condimento3(){
    return new Condimenti( 110, 2.5, "Mozzarella di Bufala");

}
@Bean
    public Condimenti condimento4(){
    return new Condimenti(30, 1.85, "Zucchine");

}
@Bean
    public Condimenti condimento5(){
    return new Condimenti(48, 0.90, "Peperoncino");

}
@Bean
    public Drinks drink1(){
    return new Drinks(300, 3.50, "Coca-cola");

}
@Bean
    public Drinks drink2(){
    return new Drinks(250, 3.00, "Coca-cola Zero");

}
@Bean
    public Drinks drink3(){
    return new Drinks(540, 6.20, "Birra Media");

}
@Bean
    public Drinks drink4(){
    return new Drinks(360, 4.80, "Birra Piccola");

}
@Bean
    public Drinks drink5(){
    return new Drinks(608, 7.60, "Calice di vino");

}
@Bean
    public List<Menu> menu(){
    List<Menu> menus = new ArrayList<>();
    menus.add(pizza1());
    menus.add(pizza2());
    menus.add(pizza3());
    menus.add(pizza4());
    menus.add(pizza5());
    menus.add(condimento1());
    menus.add(condimento2());
    menus.add(condimento3());
    menus.add(condimento4());
    menus.add(condimento5());
    menus.add(drink1());
    menus.add(drink2());
    menus.add(drink3());
    menus.add(drink4());
    menus.add(drink5());
    return menus;
}

}
