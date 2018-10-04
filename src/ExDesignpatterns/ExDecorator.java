package ExDesignpatterns;

interface choiceOfToppings
{
    void add(String ... strings);
}

enum PIZZASIZE{
    SMALL,MEDIUM,LARGE,EXTRALARGE
}

enum PIZZATYPE{
    PAN,THINCRUST,REGULAR
}
class Pizza
{
    private PIZZASIZE pizzasize;
    private PIZZATYPE pizzatype;
    public Pizza(PIZZASIZE pizzasize, PIZZATYPE pizzatype)
    {
        this.pizzasize = pizzasize;
        this.pizzatype = pizzatype;
        }

}


public class ExDecorator implements choiceOfToppings
{
    private Pizza pizza;
    public ExDecorator(Pizza pizza, String ... strings) {
        this.pizza =pizza;
    }

    @Override
    public void add(String ... strings) {
        System.out.println("Pizaa with toppings:");

        for (String string: strings)
            System.out.print(string + ", ");
        System.out.println("is made");

    }

    public static void main(String[] args) {

        ExDecorator decoratePizza = new ExDecorator(new Pizza(PIZZASIZE.LARGE,PIZZATYPE.PAN));

        decoratePizza.add("Capsicum","Cheeze","corn");
    }

}
