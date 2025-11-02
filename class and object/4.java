package com.bridgelabz.oops.levelone;

class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: " + price);
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 50000);
        item.displayItemDetails();
        System.out.println("Total Cost for 2 items: " + item.calculateTotalCost(2));
    }
}
