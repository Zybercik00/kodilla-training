package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        Item item1 = new Item(new BigDecimal(10), 1, new BigDecimal(10));
        Item item2 = new Item(new BigDecimal(20), 2, new BigDecimal(20));
        Item item3 = new Item(new BigDecimal(30), 3, new BigDecimal(30));

        Invoice invoice = new Invoice("AA11");

        item1.getProducts().add(product1);
        item1.getProducts().add(product2);
        item1.getProducts().add(product3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);


        invoiceDao.save(invoice);

        assertNotEquals(null, invoice);

        invoiceDao.delete(invoice);
    }

}
