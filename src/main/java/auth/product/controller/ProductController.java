package auth.product.controller;

import auth.product.dto.ProductRequestDTO;
import auth.product.dto.ProductResponseDTO;
import auth.product.model.Product;
import auth.product.repository.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductRepository repository;

    @PostMapping
    public ResponseEntity postProduct (@RequestBody @Valid ProductRequestDTO body) {
        Product newProduct = new Product(body);

        this.repository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity getAllProducts () {
        List<ProductResponseDTO> productList = this.repository.findAll().stream().map(ProductResponseDTO:: new).toList();
        return ResponseEntity.ok(productList);
    }

}
