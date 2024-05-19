public class Item {
    public int value;
    public int weight;
    public int ID;
    public float ratio;

    public Item(int value, int weight, int ID) {
        this.value = value;
        this.weight = weight;
        this.ID = ID;
        this.ratio = (float)value / (float)weight;
    }

    public boolean IsItemValid()
    {
        return value > 0 && weight > 0;
    }
}
