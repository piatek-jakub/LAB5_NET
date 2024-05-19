import java.util.ArrayList;
import java.util.List;

public class Result {
    public int weightSum;
    public int valueSum;
    public List<Integer> listID;

    public Result()
    {
        this.weightSum = 0;
        this.valueSum = 0;
        this.listID = new ArrayList<Integer>();
    }
    @Override
    public String toString()
    {
        String str = "";
        str += "items: ";
        for(var id : this.listID)
        {
            str+= id + " ";
        }
        str += "\n";

        str += "total value: " + this.valueSum + "\n";
        str += "total weight: " + this.weightSum + "\n";
        return str;
    }
}
