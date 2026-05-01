import java.util.ArrayList;
import java.util.PriorityQueue;

public class FractionalKnapsack {

    public ArrayList<Transmission> taken;
    public double totalBenefit;

    public FractionalKnapsack() {
        taken = new ArrayList<>();
    }

    // finds optimal solution to fractional knapsack problem
    public void fractionalKnapsack(ArrayList<Transmission> S, double W) {
        PriorityQueue<Transmission> itemsbyValueIndex = new PriorityQueue<>(
                (a, b) -> Double.compare(b.getValueIndex(), a.getValueIndex())
        );

        for (int i=0; i< S.size();i++){

            Transmission item = S.get(i);
            itemsbyValueIndex.add(item);
        }

        double totalWeight=0 ;
        while(totalWeight<W && !itemsbyValueIndex.isEmpty()){
            Transmission value= itemsbyValueIndex.poll();
            double amountTaken = Math.min(value.getWeight(),W-totalWeight);
            value.setAmountTaken(amountTaken);
            totalWeight+= amountTaken;
            this.taken.add(value);//keeps track off how much was taken


            totalBenefit +=amountTaken*value.getValueIndex();

        }
    }
}