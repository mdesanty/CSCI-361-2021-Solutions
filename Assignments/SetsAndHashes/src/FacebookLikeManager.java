import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FacebookLikeManager {
  private Map<String, List<String>> likesFor;
  private Map<String, List<String>> likesBy;

  public FacebookLikeManager() {
    likesFor = new HashMap<String, List<String>>();
    likesBy = new HashMap<String, List<String>>();
  }

  public List<String> getAllUsers() {
    Set<String> users = new HashSet<String>();
    users.addAll(likesFor.keySet());
    users.addAll(likesBy.keySet());

    List<String> allUsers = new ArrayList<String>();
    allUsers.addAll(users);

    return allUsers;
  }

  public List<String> getLikes(String user) {
    return likesFor.get(user);
  }

  public List<String> getLikesBy(String user) {
    return likesBy.get(user);
  }

  public void loadFile(String filePath) throws FileNotFoundException {
    File file = new File(filePath);
    Scanner scanner = new Scanner(file);

    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      processLine(line);
    }

    scanner.close();
  }

  private void processLine(String line) {
    String[] lineData = line.split(":|,");
    String user = lineData[0].trim();

    List<String> likers = new ArrayList<String>();
    for(String liker : Arrays.copyOfRange(lineData, 1, lineData.length))
      likers.add(liker.trim());

    processLikesFor(user, likers);
    processLikesBy(user, likers);
  }

  private void processLikesFor(String user, List<String> likers) {
    if(!likesFor.containsKey(user))
      likesFor.put(user, new ArrayList<String>());

    likesFor.get(user).addAll(likers);
  }

  private void processLikesBy(String user, List<String> likers) {
    for(String liker : likers) {
      if(!likesBy.containsKey(liker))
        likesBy.put(liker, new ArrayList<String>());

      likesBy.get(liker).add(user);
    }
  }
}