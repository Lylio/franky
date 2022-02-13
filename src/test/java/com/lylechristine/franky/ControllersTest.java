package com.lylechristine.franky;

import static org.assertj.core.api.Assertions.assertThat;
import com.lylechristine.franky.controllers.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControllersTest {

    @Autowired
    private HelloController helloController;

    @Test
    public void contextLoads() throws Exception {
        assertThat(helloController).isNotNull();

    }
}
