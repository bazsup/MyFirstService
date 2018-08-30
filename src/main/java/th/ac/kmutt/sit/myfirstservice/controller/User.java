package th.ac.kmutt.sit.myfirstservice.controller;

public class User {
  private int id;
  private String name;

  public User(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    boolean isUserType = o instanceof User;
    if (isUserType) {
      User user = ((User) o);
      boolean isEqualId = this.id == user.id;
      boolean isEqualName = this.name.equals(user.name);
      return isEqualId && isEqualName;
    }
    return isUserType;
  }
}
