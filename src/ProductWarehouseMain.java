public class ProductWarehouseMain {
    public static void main(String[] args) {

        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.00, 1000.00);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName());
        juice.addToWarehouse(1.0);
        System.out.println(juice);

        System.out.println(juice.history());
        juice.printAnalysis();
        
    }
}
