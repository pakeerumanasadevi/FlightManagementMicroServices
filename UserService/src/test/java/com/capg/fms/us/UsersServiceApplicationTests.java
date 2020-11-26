
package com.capg.fms.us;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.VerificationCollector;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import com.capg.fms.us.dao.UsersDAO;
import com.capg.fms.us.dto.Users;
import com.capg.fms.us.service.UsersService;

@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
public class UsersServiceApplicationTests {	
	@Mock
    private UsersDAO usersDao;
	@InjectMocks
	private UsersService usersService;
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testViewUserByUsername()
	{
		Users users=new Users("Manasa", "Manasa98", "P Manasa",'F',"manasa@gmail.com",986573210);
		usersDao.findById("Manasa");
		verify(usersDao, times(1)).findById("Manasa");
	}
	@Test
	public void testAddUser() {
		Users users=new Users("Manasa", "Manasa98", "P Manasa",'F',"manasa@gmail.com",986573210);
		users.setUsername("Manasa");
		users.setPassword("Manasa98");
		users.setName("P Manasa");
		users.setGender('F');
		users.setEmail("manasa@gmail.com");
		users.setPhone(986573210);
		usersDao.save(users);
	}
		
	}
