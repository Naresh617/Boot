package com.naresh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.naresh.model.User;
import com.naresh.repository.UserRepository;
import com.naresh.services.UserServices;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBooWithMockitoApplicationTests {

	@Autowired
	private UserServices service;

	@MockBean
	UserRepository mockrepository;

	@Test
	void getUsersTest() {
		when(mockrepository.findAll()).thenReturn(Stream
				.of(new User(376, "Danile", 31, "USA"), new User(958, "Huy", 35, "UK")).collect(Collectors.toList()));
		assertEquals(2, service.getUsersList().size());
	}
	
	@Test
    void saveUserTest() {
		User user = new User(999, "Pranya", 33, "Pune");
		when(mockrepository.save(user)).thenReturn(user);
		assertEquals(user, service.addUser(user));
	}
	
	 @Test
     void getUserbyAddressTest() {
		String address = "Bangalore";
		when(mockrepository.findByAddress(address))
				.thenReturn(Stream.of(new User(376, "Danile", 31, "USA")).collect(Collectors.toList()));
		assertEquals(1, service.getUsersByAddress(address).size());
	}
	 


}
