package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Resource
	private UserDao userdao;
	@Test
	public void contextLoads() {
		System.out.println("TEST------------BEGIN");
		List<User> userlist = userdao.findAll();
		System.out.println();
		System.out.println("TEST------------END");
	}

}
