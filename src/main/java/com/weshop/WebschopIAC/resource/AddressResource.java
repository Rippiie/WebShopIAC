package com.weshop.WebschopIAC.resource;

import com.weshop.WebschopIAC.model.Address;
import com.weshop.WebschopIAC.repo.AddressRepo;
import com.weshop.WebschopIAC.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/adres")
@RestController
public class AddressResource {

    @Autowired
    private AddressRepo addressRepo;
    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/all")
    public List<Address> getCustomers() {
        return (List<Address>) addressRepo.findAll();
    }

    @GetMapping("/make")
    public List<Address> getMake() {

        Address address = new Address();
        address.setStreet("ja");
        address.setPostalCode("nope");
        address.setState("state");
        address.setCountry("land");
        address.setCity("stad");
        addressRepo.save(address);

        Address address2 = new Address();
        address2.setStreet("ja");
        address2.setPostalCode("nope");
        address2.setState("state");
        address2.setCountry("land");
        address2.setCity("stad");
        addressRepo.save(address2);

        List<Address> addresses = new ArrayList<>();
        addresses.add(address);
        addresses.add(address2);


//        Customer customer = new Customer();
//        customer.setPhone(9);
//        customer.setEmail("ja");
//        customer.setName("ahja");
//        customer.setAdresses(addresses);
//        customerRepo.save(customer);

        return addresses;
    }
}