package meetups.headFirstDataPatterns;

public abstract class Hamburger extends PurchaseItem{
    PurchaseItem item;
    String name;

    Bread bread;
    Meat meat;
    Cheese cheese;
    Veggies veggies[];
    Sauce sauce;

    public Hamburger (PurchaseItem item) {
        this.item = item;
    }

    public String getDescription() {
        return item.getDescription() + this.toString();
    }

    public double cost() {
        return 3.50 + item.cost();
    }

    public abstract void prepare();

    public void grill(){
        System.out.println("Grill for 10 minutes.");
    }

    public void wrap() {
        System.out.println("Wrap the burger.");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("----" + name + "----\n");
        //should the following be with .toString ?
        if (bread != null) {
            result.append(bread);
            result.append("\n");
        }
        if (meat != null) {
            result.append(meat);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (Veggies veggie : veggies) {
                result.append(veggie);
                result.append(" - ");
            }
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }

        return result.toString();
    }



}
