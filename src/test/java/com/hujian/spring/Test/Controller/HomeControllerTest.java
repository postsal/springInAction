package com.hujian.spring.Test.Controller;

import com.hujian.spring.Controller.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by hujian on 2016/12/5.
 */
public class HomeControllerTest {
    @Test
    public void TestIndex() throws Exception {
        HomeController homeController=new HomeController();
        MockMvc mockMvc=standaloneSetup(homeController).build();
        mockMvc.perform(get("/home"))
                .andExpect(view().name("index"));
    }
}
