package com.example.order;

import com.example.order.httpclient.MessageHttpClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class OrderApplicationTests {

    @Autowired
    MessageHttpClient client;

    @Test
    void testVisitMessageHello() {

        System.out.println(client.visitMessageHello());;
    }

}
