package practice_12_hw.Task5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryService {

    private final boolean isInventoryOpen;

    public InventoryService(boolean isInventoryOpen) {
        this.isInventoryOpen = isInventoryOpen;
    }

    Map<Category, List<Product>> products = new HashMap<>();

    public void addProduct(Product product){
        if(!isInventoryOpen){
            throw  new OutOfStockException("Идет инвентаризация");
        }
        products.computeIfAbsent(product.getCategory(), c -> new CopyOnWriteArrayList<>()).add(product);
    }

    public List<Product> getProducts(Category category){
        List<Product> list = products.get(category);
        if (list == null || list.isEmpty()){
            throw new OutOfStockException("Товаров нет");
        }
        return list;
    }

    public List<Product> filterProducts(Category category, int minPrice, int maxPrice){
        if(minPrice > maxPrice){
            throw  new IllegalArgumentException("Минимальная цена не может быть больше максимальной цены");
        }
        List<Product> list = getProducts(category);
        return list.stream()
                .filter(p -> {
                    double price = p.getPrice();
                    return minPrice <= price && price <= maxPrice;
                })
                .toList();
    }
}
