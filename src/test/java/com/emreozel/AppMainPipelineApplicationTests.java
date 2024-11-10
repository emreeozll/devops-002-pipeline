package com.emreozel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AppMainPipelineApplicationTests {


    @Autowired
    private MockMvc mockMvc;


    @Test
    void contextLoads() {
    }

    @Test
    void shouldReturnHelloWorldInfo() throws Exception {

        //https:localhost:8080 --> bu test aslında bunu calisitiriyor

        this.mockMvc.perform(get("/info"))
                .andExpect(status().isOk())
                .andExpect(content().string("INFO "));

    }







}
