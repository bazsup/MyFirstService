package th.ac.kmutt.sit.myfirstservice.controller;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserControllerTest {

  private UserController userController;

  private List<User> expectedUsers;

  @Before
  public void initial() {
    userController = new UserController();
    expectedUsers = new ArrayList<User>();
    expectedUsers.add(new User(1, "Supawit"));
    expectedUsers.add(new User(2, "Pureewat"));
    expectedUsers.add(new User(3, "Keerati"));
    expectedUsers.add(new User(4, "Phachara"));
    expectedUsers.add(new User(5, "Kanisorn"));
  }

  @Test
  public void getIndividualUserID_1_shouldBe_Supawit() {
    User user = userController.getUser(1);
    User expectUser = expectedUsers.get(0);
    assertEquals(expectUser, user);
  }

  @Test
  public void getUsers() {
    assertEquals(expectedUsers, userController.getUsers());
  }

}
