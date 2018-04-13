package com.uc.spring.helloworld.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * User: uc
 * Date: 2018-04-13
 * Time: 16:03
 * Desc:
 */
@RunWith(SpringRunner.class)
@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    private static final Logger L  = LoggerFactory.getLogger(HelloControllerTest.class);

    @Autowired
    private MockMvc mvc;

    @Test
    public void echo() throws Exception {
        URI queryUri =
                UriComponentsBuilder.fromUriString("/hello/echo")
                .queryParam("msg", "uc")
                .build().encode().toUri();

        mvc.perform(MockMvcRequestBuilders.get(queryUri))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("msg = uc"));
    }

}