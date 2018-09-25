package exercise_1;

enum house{
    onebhk(20000), twobhk(30000),threebhk(40000);

    private int price;

    house(int p)
    {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class ninth
{
    public static void main(String[] args) {

        System.out.println("prices of all house are :");

        for (house h : house.values())
            System.out.println (h + " costs " + h.getPrice() + " Rupees.");

    }
}
