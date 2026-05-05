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

        PriorityQueue<Transmission> Q = new PriorityQueue<>(
                (a,b) -> Double.compare(b.getValueIndex(),a.getValueIndex())
        );
        taken=new ArrayList<>();
        double totalWeight=0;
         totalBenefit=0;

        for(Transmission trans: S){
            Q.add(trans);
        }
        while(totalWeight<W && !Q.isEmpty()){

            Transmission node= Q.poll();
            double amountTaken = Math.min(node.getWeight(),W-totalWeight);
            node.setAmountTaken(amountTaken);
            taken.add(node);
            totalBenefit += (amountTaken/node.getWeight())*node.getBenefit();
            totalWeight += amountTaken;
        }

    }
}