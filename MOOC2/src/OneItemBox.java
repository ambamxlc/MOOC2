public class OneItemBox extends Box {
    private Items item;

    public OneItemBox() {}

    @Override
    public void add(Items item) {
        if (this.item == null) {
            this.item = item;
        } else {
            return;
        }
    }

    @Override
    public boolean isInBox(Items item) {
        return this.item.equals(item);
    }
    
}