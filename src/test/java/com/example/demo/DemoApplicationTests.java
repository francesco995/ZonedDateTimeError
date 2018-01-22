package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.ZonedDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private Repo repo;

	@Test
	public void contextLoads() {
	}


	@Test
	public void test(){
		TestModel testModel = new TestModel();
        testModel.setZonedDateTime(ZonedDateTime.now());


		testModel = repo.save(testModel);

		TestModel testModel1 = repo.findOne(testModel.getId());
        System.out.println(testModel1.toString());
	}

}
