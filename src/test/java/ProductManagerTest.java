import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    public void searchWhenFewProductsFind1() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1,"Война и мир. Книга 1", 940, "Лев Толстой");
        Book book2 = new Book(2, "Война и мир. Книга 2", 1100, "Лев Толстой");
        Smartphone smartphone1 = new Smartphone(3, "Samsung Galaxy S10", 37000, "Korea");
        Smartphone smartphone2 = new Smartphone(4, "Samsung Galaxy S10e", 25000, "Korea");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] expected = {book1, book2};
        Product[] actual = manager.searchBy("мир");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchWhenFewProductsFind2() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1,"Война и мир. Книга 1", 940, "Лев Толстой");
        Book book2 = new Book(2, "Война и мир. Книга 2", 1100, "Лев Толстой");
        Smartphone smartphone1 = new Smartphone(3, "Samsung Galaxy S10", 37000, "Korea");
        Smartphone smartphone2 = new Smartphone(4, "Samsung Galaxy S10e", 25000, "Korea");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] expected = {};
        Product[] actual = manager.searchBy("Лето");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchWhenFewProductsFind3() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1,"Война и мир. Книга 1", 940, "Лев Толстой");
        Book book2 = new Book(2, "Война и мир. Книга 2", 1100, "Лев Толстой");
        Smartphone smartphone1 = new Smartphone(3, "Samsung Galaxy S10", 37000, "Korea");
        Smartphone smartphone2 = new Smartphone(4, "Samsung Galaxy S10e", 25000, "Korea");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] expected = {book1, smartphone1, smartphone2};
        Product[] actual = manager.searchBy("1");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchWhenFewProductsFind4() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1,"Война и мир. Книга 1", 940, "Лев Толстой");
        Book book2 = new Book(2, "Война и мир. Книга 2", 1100, "Лев Толстой");
        Smartphone smartphone1 = new Smartphone(3, "Samsung Galaxy S10", 37000, "Korea");
        Smartphone smartphone2 = new Smartphone(4, "Samsung Galaxy S10e", 25000, "Korea");
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] expected = {book2};
        Product[] actual = manager.searchBy("2");

        Assertions.assertArrayEquals(expected, actual);
    }



}