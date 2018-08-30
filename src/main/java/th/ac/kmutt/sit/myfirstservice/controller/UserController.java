package th.ac.kmutt.sit.myfirstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class UserController {

  private ArrayList<User> users;

  public UserController() {
    super();
    this.users = new ArrayList<User>();
    this.users.add(new User(1, "Supawit"));
    this.users.add(new User(2, "Pureewat"));
    this.users.add(new User(3, "Keerati"));
    this.users.add(new User(4, "Phachara"));
    this.users.add(new User(5, "Kanisorn"));
  }

  @GetMapping("/user/{id}")
  public User getUser(@PathVariable("id") int userId) {
    return userId > this.users.size() || userId < 1 ? null : this.users.get(userId - 1);
  }

   @GetMapping("/users")
   public List<User> getUsers() {
     return this.users;
   }

}