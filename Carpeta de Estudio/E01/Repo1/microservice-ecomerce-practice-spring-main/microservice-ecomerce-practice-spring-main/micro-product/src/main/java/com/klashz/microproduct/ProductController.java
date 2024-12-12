package com.klashz.microproduct;

import com.klashz.microproduct.client.CommentClient;
import com.klashz.microproduct.dto.CommentDto;
import com.klashz.microproduct.dto.ProductResponseDto;
import jakarta.ws.rs.GET;
import org.hibernate.annotations.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private  CommentClient commentClient;



    @PostMapping("/save")
    public ResponseEntity<ProductEntity> saveNewProduct(@RequestBody ProductEntity product) {
        ProductEntity p  = productRepository.save(product);
        return ResponseEntity.status(201).body(p);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ProductResponseDto> getProduct(@PathVariable("id") Long id) {
        Optional<ProductEntity> p = productRepository.findById(id);
        if(p.isEmpty()) return ResponseEntity.notFound().build();
        ProductEntity product = p.get();
        List<CommentDto> commentByP =  commentClient.getCommentByIdProduct(product.getId());
        ProductResponseDto prdto = ProductResponseDto.builder()
                .Id(product.getId())
                .name(product.getName())
                .image(product.getImage())
                .price(product.getPrice())
                .stock(product.getStock())
                .description(product.getDescription())
                .comments(commentByP)
                .build();
        return ResponseEntity.ok(prdto);

    }
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ProductEntity> updateProduct(@PathVariable Long id, @RequestBody ProductEntity newproduct) throws Exception {

        Optional<ProductEntity> p = productRepository.findById(id);
        if(p.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        ProductEntity product= p.get();
        product.setImage(product.getImage());
        product.setName(newproduct.getName());
        product.setPrice(newproduct.getPrice());
        product.setDescription(newproduct.getDescription());
        product.setImage(newproduct.getImage());
        product.setStock(newproduct.getStock());
        productRepository.save(product);
        return ResponseEntity.ok(product);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ProductEntity> deleteProduct(@PathVariable("id") Long id) throws Exception {
        Optional<ProductEntity> p = productRepository.findById(id);
        if(p.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        productRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

