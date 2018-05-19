package com.example.ci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CiApplicationTests {

	@Test
	public void contextLoads() {
	}

    @Test
    public void basic() throws Exception {
	    assertEquals(1, 1);
    }
}
