package com.weshop.WebschopIAC.controllers;

import com.weshop.WebschopIAC.domain.*;
import com.weshop.WebschopIAC.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RequestMapping("/demo")
@RestController
public class CustomerResource {

    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private BestellingRepo bestellingRepo;

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private DiscountRepo discountRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @GetMapping("/all")
    public Iterable<Category> getCustomers() {
        return categoryRepo.findAll();
    }

    @GetMapping("/make")
    public String getMake() {

        //Nieuwe adres aanmaken
        Address address = new Address();
        address.setStreet("dickenslaan");
        address.setPostalCode("3533");
        address.setState("Utr");
        address.setCountry("Nederland");
        address.setCity("Utrecht");
        addressRepo.save(address);


        //Nieuwe accounts aanmaken
        Date date = new Date(System.currentTimeMillis());

        Account account = new Account();
        account.setAccount(UUID.randomUUID());
        account.setCreatedOn(date);
        accountRepo.save(account);

        Account account2 = new Account();
        account2.setAccount(UUID.randomUUID());
        account2.setCreatedOn(date);
        accountRepo.save(account2);


        //Nieuwe customers aanmaken en accounts toevoegen
         Customer customer = new Customer();

         customer.setAccount(account);
         customer.setName("Redie");
         customer.setEmail("redi@mail.com");
         customer.setPhone(065522525);
         customer.setAddress(address);
         customerRepo.save(customer);


         Customer customer1 = new Customer();
        customer1.setAccount(account2);
        customer1.setName("Rida");
        customer1.setEmail("rida@mail.com");
        customer1.setPhone(065522525);
        customer1.setAddress(address);
        customerRepo.save(customer1);


        //Nieuwe bestellingen aanmaken en toevoegen aan Customers
        Bestelling bestelling = new Bestelling();
        bestelling.setBestelling(UUID.randomUUID());
        Date date2 = new Date(System.currentTimeMillis());
        bestelling.setCreatedOn(date2);
        bestelling.setPaymentMethod("Pin");
        bestelling.setState("On wait.......");
        bestellingRepo.save(bestelling);

        Bestelling bestelling2 = new Bestelling();
        bestelling2.setBestelling(UUID.randomUUID());
        Date date3 = new Date(System.currentTimeMillis());
        bestelling2.setCreatedOn(date3);
        bestelling2.setPaymentMethod("Contant");
        bestelling2.setState("Succesfull");
        bestellingRepo.save(bestelling2);

        List<Bestelling> bestellings = new ArrayList<>();
        bestellings.add(bestelling);
        bestellings.add(bestelling2);

        customer.setBestellingen(bestellings);
        customerRepo.save(customer);

        //Nieuwe product aanmaken en toevoegen aan bestelling
        Product product = new Product();
        product.setDescription("Dit is een description");
        product.setName("Water Spa");
        product.setPhoto("link.nl/naareen/foto");
        product.setPrice(25.2);
        product.setProduct(UUID.randomUUID());
        productRepo.save(product);

        //Nieuwe product aanmaken en toevoegen aan bestelling
        Product product2 = new Product();
        product2.setDescription("Dit is een description");
        product2.setName("Water Spa");
        product2.setPhoto("link.nl/naareen/foto");
        product2.setPrice(25.2);
        product2.setProduct(UUID.randomUUID());
        productRepo.save(product2);

        List<Product> producten = new ArrayList<>();
        producten.add(product);
        producten.add(product2);

        bestelling.setProducten(producten);
        bestellingRepo.save(bestelling);


        Discount discount = new Discount();
        discount.setAdvertisingText("Korting van 15%");
        discount.setDiscount(UUID.randomUUID());
        discount.setDiscountPrice(45.58);
        discount.setEndDate(date);
        discount.setStartDate(date);
        discount.setProducten(producten);
        discountRepo.save(discount);

        Category category = new Category();
        category.setDescription("Hardeschijven");
        category.setName("Randapparatuur");
        category.setPhoto("link.com/naareen/photo");
        category.setProducten(producten);
        categoryRepo.save(category);

         return "Gelukt!";
    }
}
