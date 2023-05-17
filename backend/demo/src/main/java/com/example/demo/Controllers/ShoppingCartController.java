package com.example.demo.Controllers;


import com.example.demo.Models.Product;
import com.example.demo.Models.ShoppingCart;
import com.example.demo.Repositorys.ProductRepository;
import com.example.demo.Repositorys.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping("/shopping-cart")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add-product")
    public void addProductToCart(@RequestParam String productId, Principal principal) {
        String userId = principal.getName();
        Optional<ShoppingCart> optionalShoppingCart = shoppingCartRepository.findByUserId(userId);
        ShoppingCart shoppingCart = optionalShoppingCart.orElseGet(() -> {
            ShoppingCart newShoppingCart = new ShoppingCart();
            newShoppingCart.setUserId(userId);
            return newShoppingCart;
        });
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            shoppingCart.getProducts().add(product);
            shoppingCartRepository.save(shoppingCart);
        }
    }

    @GetMapping("/get-cart")
    public ShoppingCart getCart(Principal principal) {
        String userId = principal.getName();
        Optional<ShoppingCart> optionalShoppingCart = shoppingCartRepository.findByUserId(userId);
        return optionalShoppingCart.orElse(new ShoppingCart());
    }
}
