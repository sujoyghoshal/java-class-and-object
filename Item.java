class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 75000);
        item.displayDetails();
        System.out.println("Total Cost for 2 items: " + item.calculateTotalCost(2));
    }
}
// Input: Item details, quantity = 2
// Output: Displays Item details and total cost