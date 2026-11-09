package ra.demo.init_data;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ra.demo.model.entity.Product;
import ra.demo.repository.ProductRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitProduct implements CommandLineRunner {
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Product> products = List.of(
                new Product(null,"Iphone 14 Pro Max","Apple",2022,3000.0),
                new Product(null,"Iphone 15 Pro Max","Apple",2023,4000.0),
                new Product(null,"Iphone 16 Pro Max","Apple",2024,5000.0),
                new Product(null,"Iphone 17 Pro Max","Apple",2025,6000.0),
                new Product(null,"Iphone 18 Pro Max","Apple",2026,7000.0)
        );
        productRepository.saveAll(products);
    }
}
