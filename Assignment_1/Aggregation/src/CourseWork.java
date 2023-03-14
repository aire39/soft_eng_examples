import java.util.Vector;

public class CourseWork {
    private Vector<Course> courses = new Vector<>();

    CourseWork() {

    }

    public void AddCourse(String course_name
                         ,String instructor_first_name
                         ,String instructor_last_name
                         ,String instructor_office_number
                         ,String book_title
                         ,String book_author
                         ,String book_publisher) {
        Course add_course = new Course();

        add_course.SetCourseName(course_name);
        add_course.AddInstructor(instructor_first_name, instructor_last_name, instructor_office_number);
        add_course.AddBook(book_title, book_author, book_publisher);

        courses.add(add_course);
    }

    public void AddCourse(Course new_course) {
        courses.add(new_course);
    }

    public void print() {
        for (Course c : courses) {
            c.print();
            System.out.println("");
            System.out.println("");
        }
    }
}
