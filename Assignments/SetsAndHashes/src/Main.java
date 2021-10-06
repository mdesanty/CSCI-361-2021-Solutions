import java.io.FileNotFoundException;
import java.util.List;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {

    /* Expected output:
     *
     * All users: [Nate, Mike, Anthony, Steve, Kristen, Randy, Bill, John, Sara]
     * Users that like Mike: [Kristen, Sara, Nate, Anthony, Randy]
     * Users that like Kristen: [Mike, John, Steve, Bill]
     * Users that like Bill: [Sara, Nate]
     * Users that like Sara: [Nate, Anthony]
     * Users that are liked by Kristen: [Mike]
     * Users that are liked by Sara: [Mike, Bill]
     * Users that are liked by Nate: [Mike, Bill, Sara]
     * Users that are liked by Anthony: [Mike, Sara]
     * Users that are liked by Randy: [Mike]
     * Users that are liked by Mike: [Kristen]
     * Users that are liked by John: [Kristen]
     * Users that are liked by Bill: [Kristen]
     * Users that are liked by Steve: [Kristen]
     */

    FacebookLikeManager manager = new FacebookLikeManager();
    manager.loadFile("users.txt");

    System.out.println("All users: " + manager.getAllUsers());

    System.out.println("Users that like Mike: " + manager.getLikes("Mike"));
    System.out.println("Users that like Kristen: " + manager.getLikes("Kristen"));
    System.out.println("Users that like Bill: " + manager.getLikes("Bill"));
    System.out.println("Users that like Sara: " + manager.getLikes("Sara"));

    System.out.println("Users that are liked by Kristen: " + manager.getLikesBy("Kristen"));
    System.out.println("Users that are liked by Sara: " + manager.getLikesBy("Sara"));
    System.out.println("Users that are liked by Nate: " + manager.getLikesBy("Nate"));
    System.out.println("Users that are liked by Anthony: " + manager.getLikesBy("Anthony"));
    System.out.println("Users that are liked by Randy: " + manager.getLikesBy("Randy"));
    System.out.println("Users that are liked by Mike: " + manager.getLikesBy("Mike"));
    System.out.println("Users that are liked by John: " + manager.getLikesBy("John"));
    System.out.println("Users that are liked by Steve: " + manager.getLikesBy("Steve"));
    System.out.println("Users that are liked by Bill: " + manager.getLikesBy("Bill"));
  }
}