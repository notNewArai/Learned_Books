import java.lang.System;
import java.util.ArrayList;

public class Table {
    private ArrayList disposeCards_ = new ArrayList();

    public void disposeCard(Card card[]) {
        for (int index = 0; index < card.length; index++) {
            System.out.print(card[index] + " ");
        }
        System.out.println("を捨てました");

        disposeCards_.add(card);
    }
}