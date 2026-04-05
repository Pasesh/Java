package Practice_12_hw.Task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice_12_hw.Task5.Category;
import practice_12_hw.Task5.InventoryService;
import practice_12_hw.Task5.OutOfStockException;
import practice_12_hw.Task5.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest {
    private InventoryService service;
    private Product product1;
    private Product product2;
    private Product product3;

    @BeforeEach
    public void setUp(){
        service = new InventoryService(true);
        product1 = new Product("Яблоки", 120.20, Category.FOOD);
        product2 = new Product("Ноутбук", 120000.100, Category.ELECTRONICS);
        product3 = new Product("Хлеб", 40.50, Category.FOOD);
    }


    @Test
    public void shouldAddProduct(){
        service.addProduct(product1);
        List<Product> result = service.getProducts(Category.FOOD);

        assertEquals(1, result.size());
        assertEquals("Яблоки", result.get(0).getName());
    }

    @Test
    public void shouldThrowExceptionWhenInventoryClosed(){
        service = new InventoryService(false);

        assertThrows(OutOfStockException.class, () -> {
            service.addProduct(product1);
        });
    }

    @Test
    public void shouldThrowExceptionWhenNoProductsInCategory(){
        service = new InventoryService(false);

        assertThrows(OutOfStockException.class, () -> {
            service.getProducts(Category.FOOD);
        });
    }

    @Test
    public void shouldFilterProductsByPrice() {
        service.addProduct(product1);
        service.addProduct(product2);
        service.addProduct(product3);

        List<Product> result = service.filterProducts(Category.FOOD, 70, 150);

        assertEquals(1, result.size());
        assertEquals("Яблоки", result.get(0).getName());
    }

}
