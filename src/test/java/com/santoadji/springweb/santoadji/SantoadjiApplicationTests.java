package com.santoadji.springweb.santoadji;

import com.santoadji.springweb.santoadji.entities.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SantoadjiApplicationTests {

    @Value("${productrestapi.server.url}")
    private String baseURL;

    @Test
    void testGetProduct() {
        RestTemplate restTemplate = new RestTemplate();
        Product product = restTemplate.getForObject(baseURL+"12", Product.class);
        assertNotNull(product);
        assertEquals("Honda", product.getName());
    }

    @Test
    void testCreateProduct() {
        RestTemplate restTemplate = new RestTemplate();
        Product product = new Product();
        product.setName("Mobil Brio");
        product.setDescription("Mobilio Mobil Mahal");
        product.setPrice(1000);
        Product newProduct = restTemplate.postForObject(baseURL, product, Product.class);
        assertNotNull(newProduct);
        assertNotNull(newProduct.getId());
        assertEquals("Mobil Brio", product.getName());

    }

    @Test
    void testUpdateProduct() {
        RestTemplate restTemplate = new RestTemplate();
        Product product = restTemplate.getForObject(baseURL + "12", Product.class);
        assert product != null;
        product.setPrice(1000);

        restTemplate.put(baseURL, product);
    }

}
