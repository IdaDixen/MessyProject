import java.util.ArrayList;

public class UserList
{
  private final ArrayList<User> users = new ArrayList<>();

  public void add(User user)
  {
    if (user == null)
    {
      throw new IllegalArgumentException("User cannot be null");
    }
    this.users.add(user);
  }

  public ArrayList<User> getUsers()
  {
    return users;
  }
}
