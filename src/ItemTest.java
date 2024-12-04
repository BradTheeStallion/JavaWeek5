public class ItemTest {
    public static void main(String[] args) {

        WeighedItem banana = new WeighedItem("Banana", 3.00, 1.37);
        System.out.println(banana);

        CountedItem pens = new CountedItem("Pens", 4.50, 10);
        System.out.println(pens);
    }
}