package strategy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StrategyDemo {
    public static void main(String[] args) {
        List<PriceBonus> clientBonuses = new ArrayList<>();
        clientBonuses.add(new BirthDateBonus(LocalDate.now(),LocalDate.of(2000,11, 23)));
        List<Integer> orderPrices = new ArrayList<>();
        orderPrices.add(10000);
        orderPrices.add(30000);
        orderPrices.add(70000);
        orderPrices.add(14000);
        clientBonuses.add(new TotalOrderBonus(orderPrices.stream().mapToInt(p->p).sum()));
        orderPrices.stream().forEach(price -> {
            int b = price;
            for (PriceBonus bonus : clientBonuses) {
                 b = bonus.doOperation(price);
            }
            System.out.println("Cena bez bonusu " + price + " , cena po bonusie " + b);
        });
    }
}
