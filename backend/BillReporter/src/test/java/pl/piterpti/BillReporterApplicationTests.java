package pl.piterpti;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BillReporterApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testBCryptPasswordEncoder() {
		String encode = new BCryptPasswordEncoder().encode("1");
		System.out.println(encode);
	}

}
