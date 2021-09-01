public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.testCourse();
        main.testSchedule();

        /* Expected output:
        *
        * Data Structures and Algorithms
        * 6:30pm
        * 9:15pm
        * Data Structures and Algorithms: 6:30pm - 9:15pm
        *
        * Your schedule:
        * Math: 8 AM - 10AM
        * Science: 9 AM - 11AM
        * History: 4 PM - 7PM
        */
    }

    private void testCourse() {
        Course course = new Course("Data Structures and Algorithms", "6:30pm", "9:15pm");

        System.out.println(course.getName());
        System.out.println(course.getStartTime());
        System.out.println(course.getEndTime());
        System.out.println(course.toString());
        System.out.println();
    }

    private void testSchedule() {
        Schedule schedule = new Schedule();

        Course math = new Course("Math", "8 AM", "10AM");
        schedule.addCourse(math);

        Course science = new Course("Science", "9 AM", "11AM");
        schedule.addCourse(science);

        Course history = new Course("History", "4 PM", "7PM");
        schedule.addCourse(history);

        System.out.println(schedule.toString());
    }
}
