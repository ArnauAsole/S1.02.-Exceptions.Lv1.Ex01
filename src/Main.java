//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sales sell1 = new Sales();

        try {
            sell1.calcuteTotalProduct();
        } catch (EmptySellException e) {
            System.out.println("Exception captured: " + e.getMessage());
        }

        sell1.addProduct(new Product("B", 1.20));
        sell1.addProduct(new Product("Milk", 0.95));

        try {
            sell1.calcuteTotalProduct();
        } catch (EmptySellException e) {
            System.out.println("Exception captured: " + e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Have you tried to get a uncreated position: " + e);
        }
    }
}