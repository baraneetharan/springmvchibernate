package com.kgisl.springmvchibernate.dao;

import java.util.List;

import com.kgisl.springmvchibernate.entity.Customer;

public interface CustomerDAO {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public void updateCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
