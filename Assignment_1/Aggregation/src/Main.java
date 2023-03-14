public class Main {
    public static void main(String[] args) {
        CourseWork course_work = new CourseWork();
        course_work.AddCourse("Adv. Software Engineering"
                             , "Nema"
                             , "Davapanah"
                             , "3-2636"
                             , "Clean Code"
                             , "Robort C. Martin"
                             , "Pearson 1st edition");

        Course new_course = new Course();
        new_course.SetCourseName("Light Literaturature");
        new_course.AddInstructor("Donald", "Brewer", "6-1545");
        new_course.AddInstructor("Jeff", "Baloon", "6-1555");
        new_course.AddBook("Shining Light", "Brailer Nuten", "Fun House");
        new_course.AddBook("Light Text", "Jasonr Soler", "Gene Publishing");

        course_work.AddCourse(new_course);

        course_work.print();
    }
}