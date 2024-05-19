import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Problem {
    public int n;
    public List<Item> items;

    public Problem(int n, int seed) {
        this.n = n;
        this.items = new ArrayList<Item>();
        Random random = new Random(seed);
        for (int i  = 0; i < n; i++)
        {
            int value = random.nextInt(1, 11);
            int weight = random.nextInt(1, 11);
            Item item = new Item(value,weight, i);
            items.add(item);
        }
    }
    public void AddItemsManually(List<Item> items)
    {
        for(Item item : items)
        {
            this.items.add(item);
        }
        n = items.size();
    }

    public Result Solve(int capacity)
    {
        Result result = new Result();
        if(capacity <= 0)
        {
            return new Result();
            //throw new ArgumentOutOfRangeException(nameof(capacity), "Invalid capacity");
        }
        Collections.sort(items, new CompareItems());
        for(var item : items)
        {
            while (result.weightSum+item.weight <= capacity)
            {
                result.listID.add(item.ID);
                result.weightSum += item.weight;
                result.valueSum += item.value;
            }
        }
        return result;
    }

    class CompareItems implements java.util.Comparator<Item> {
        @Override
        public int compare(Item x, Item y) {
            return Float.compare(y.ratio, x.ratio);
        }
    }

    @Override
    public String toString()
    {
        String str = "";
        for(var item : items)
        {
            str += "no.: " + item.ID + " value: " + item.value + " weight: " + item.weight + " ratio: " + item.ratio + "\n";
        }
        return str;
    }
}
