import java.util.List;
import java.util.ArrayList;

public class Schedule {
    private List<Course> courses;

    public Schedule() {
        courses = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String toString() {
        String message = "Your schedule:\n";

        for(Course course: courses) {
            message += course.toString() + "\n";
        }

        return message;
    }
}