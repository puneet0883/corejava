interface Something {
    void printMe();
    void printSomething();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Something something = new Something() {
            @Override
            public void printMe() {
                System.out.println("printme");
            }

            @Override
            public void printSomething() {
                System.out.println("printsomething");

            }
        };
    }
}

