package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {

    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        System.out.println(products);

        System.out.println("----Foreach-----");
        // Foreach => Iterator
        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("----Iterator-----");
        final Iterator<Product> productIterator = products.iterator();
        while(productIterator.hasNext()) {
            Product product = productIterator.next();
            if (product.getWeight() > 20) {
                System.out.println(product);
            } else {
                productIterator.remove();
            }
        }

        System.out.println("----Operations-----");
        System.out.println("Size: " + products.size());
        System.out.println("isEmpty: " + products.isEmpty());
        System.out.println("Contain window product: " + products.contains(window));
        System.out.println("Contain door product: " + products.contains(door));

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(window);
        otherProducts.add(door);

        products.removeAll(otherProducts);
        System.out.println(products.remove(window));
        System.out.println(products);
    }
}
