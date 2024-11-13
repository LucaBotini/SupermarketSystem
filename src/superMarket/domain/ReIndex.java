package superMarket.domain;

import java.util.ArrayList;

public abstract class ReIndex {
    public static void reindexProducts(ArrayList<Products> stock) {
        // Recalcula os IDs de todos os produtos na lista
        for (int i = 0; i < stock.size(); i++) {
            stock.get(i).setID(i);  // Atribui um novo ID sequencial
        }
    }
}
