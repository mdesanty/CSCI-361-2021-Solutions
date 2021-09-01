public class Course {
  private String name;
  private String startTime;
  private String endTime;

  public Course(String name, String startTime, String endTime) {
    this.name = name;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public String getName() {
    return name;
  }

  public String getStartTime() {
    return startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public String toString() {
    return getName() + ": " + getStartTime() + " - " + getEndTime();
  }
}
