import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    @Test
    public void testRemoveCorrectId() {
        Repository repo = new Repository();
            Book book1 = new Book(1,"Война и мир. Книга 1", 940, "Лев Толстой");
            Book book2 = new Book(2, "Война и мир. Книга 2", 1100, "Лев Толстой");
            Smartphone smartphone1 = new Smartphone(3, "Samsung Galaxy S10", 37000, "Korea");
            Smartphone smartphone2 = new Smartphone(4, "Samsung Galaxy S10e", 25000, "Korea");
            repo.add(book1);
            repo.add(book2);
            repo.add(smartphone1);
            repo.add(smartphone2);

            repo.remove(3);

            Product[] expected = {book1, book2, smartphone2};
            Product[] actual = repo.findAll();

            Assertions.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void testRemoveAnCorrectId() {
//        Repository repo = new Repository();
//        Book book1 = new Book(1,"Война и мир. Книга 1", 940, "Лев Толстой");
//        Book book2 = new Book(2, "Война и мир. Книга 2", 1100, "Лев Толстой");
//        Smartphone smartphone1 = new Smartphone(3, "Samsung Galaxy S10", 37000, "Korea");
//        Smartphone smartphone2 = new Smartphone(4, "Samsung Galaxy S10e", 25000, "Korea");
//        repo.add(book1);
//        repo.add(book2);
//        repo.add(smartphone1);
//        repo.add(smartphone2);
//
//        repo.remove(1);
//
//        Product[] expected = {book1, book2, smartphone1, smartphone2};
//        Product[] actual = repo.findAll();
//
//        Assertions.assertArrayEquals(expected, actual);
//    }


}