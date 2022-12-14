package com.customerService.repository;

import com.customerService.model.Customer;

import java.util.List;

public interface CustomerRepository {
    void createCustomer(Customer customer);
    void updateCustomerById(Long customerId, Customer customer);
    void deleteCustomerById(Long id);
    Customer getCustomerById(Long id);
    List<Customer> getCustomersByFirstName(String firstName);
    List<Customer> getAllCustomers();
    List<Long> getCustomerIdsByFirstName(String firstName);
}
