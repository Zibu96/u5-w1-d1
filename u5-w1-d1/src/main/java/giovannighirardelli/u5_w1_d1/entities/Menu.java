package giovannighirardelli.u5_w1_d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@ToString
@AllArgsConstructor
public class Menu {

    private List<MenuItem> menuItems;


   public void printMenu(){
       menuItems.forEach(System.out::println);
   }

}
