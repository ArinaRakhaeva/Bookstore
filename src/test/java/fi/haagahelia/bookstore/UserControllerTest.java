package fi.haagahelia.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import fi.haagahelia.bookstore.UserController;

/**
* Testing that the context is creating your controller
*/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {
	@Autowired
	private UserController controller;
	@Test
		public void contextLoads() throws Exception { 
		assertThat(controller).isNotNull();
		}
}
