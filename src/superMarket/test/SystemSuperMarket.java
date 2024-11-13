package superMarket.test;

import superMarket.domain.Products;
import superMarket.domain.ReIndex;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemSuperMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Products> stock = new ArrayList<>();
        boolean valid = false;
        while (!valid) {
            System.out.println("\n-------------------------------------------");
            System.out.println("🌐 Welcome back to SuperMarket System 🌐\n- Enter (1) to see stock.\n- Enter (2) to add new product.\n- Enter (3) to remove a product.\n- Enter (4) to exit.");
            System.out.println("-------------------------------------------");
            int quest1 = input.nextInt();
            input.nextLine();

            switch (quest1) {
                case 1:
                    if (stock.isEmpty()) {
                        System.out.println("Stock is empty.");
                    } else {
                        System.out.println("Current stock:");
                        for (Products product : stock) {
                            System.out.println(product);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter product name:");
                    String name = input.nextLine();

                    System.out.println("Enter product value:");
                    int value = input.nextInt();

                    Products product = new Products(name, value);
                    System.out.println("⏳ Adding new product... ⏳");
                    stock.add(product);

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        System.out.println("Operation interrupted.");
                    }
                    System.out.println("🛒 - Product added:\n" + product + "\n");
                    ReIndex.reindexProducts(stock);
                    break;
                case 3:
                    if (stock.isEmpty()) {
                        System.out.println("Stock is empty.");
                    } else {
                        System.out.println("Current stock:");
                        for (Products productR : stock) {
                            System.out.println(productR);
                        }
                        System.out.println("Enter product ID to remove:");
                        int IDremove = input.nextInt();
                        input.nextLine();

                        boolean found = false;
                        for (Products productR : stock) {
                            if (productR.getID() == IDremove) {
                                found = true;
                                break;
                            }
                        }

                        if (found) {
                            stock.removeIf(productR -> productR.getID() == IDremove);

                            ReIndex.reindexProducts(stock);
                            System.out.println("Product with ID " + IDremove + " removed.\nID's reorganized");
                        } else {
                            System.out.println("Invalid ID.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("💻 Always come back 💻");
                    valid = true;
                    break;

            }
        }
    }
}

