package th.ac.kmutt.sit.myfirstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;

@RestController
public class UserController {

  @GetMapping("/user/{id}")
  public User getUser(@PathVariable("id") int userId) {
    List<User> users = new ArrayList();
    users.add(new User(1, "Supawit"));
    users.add(new User(2, "Pureewat"));
    users.add(new User(3, "Keerati"));
    users.add(new User(4, "Phachara"));
    users.add(new User(5, "Kanisorn"));
    return userId > 5 || userId < 1 ? null : users.get(userId - 1);
  }

   @GetMapping("/users")
   public List<User> getUsers() {
     List<User> users = new ArrayList();
     users.add(new User(1, "Supawit"));
     users.add(new User(2, "Pureewat"));
     users.add(new User(3, "Keerati"));
     users.add(new User(4, "Phachara"));
     users.add(new User(5, "Kanisorn"));
     return users;
   }

}