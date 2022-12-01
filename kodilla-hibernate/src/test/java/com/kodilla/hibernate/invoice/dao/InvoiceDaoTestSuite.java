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

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {


        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Invoice invoice = new Invoice("AA11");

        Item item1 = new Item(new BigDecimal(10), 1, new BigDecimal(10), invoice, product1);
        Item item2 = new Item(new BigDecimal(20), 2, new BigDecimal(20), invoice, product2);
        Item item3 = new Item(new BigDecimal(30), 3, new BigDecimal(30), invoice, product3);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product1.getItems().add(item3);

        // when
        invoiceDao.save(invoice);

        // then
        assertEquals(3, invoice.getItems().size());

        itemDao.delete(item1);
        itemDao.delete(item2);
        itemDao.delete(item3);
    }

}
