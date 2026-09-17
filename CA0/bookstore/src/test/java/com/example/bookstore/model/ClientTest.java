package com.example.bookstore.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void nifShouldNotBeNull() {
        Client client = new Client();
        client.setNif("123456789");
        assertNotNull(client.getNif());
    }

    @Test
    void nifShouldBeCorrectValue() {
        Client client = new Client();
        client.setNif("987654321");
        assertEquals("987654321", client.getNif());
    }
}