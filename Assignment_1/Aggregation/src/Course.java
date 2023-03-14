import java.util.Vector;

public class Course {
    private String name = "";

    private final Vector<Instructor> instructors = new Vector<>();
    private final Vector<Book> books = new Vector<>();

    public void SetCourseName(String name) {
        this.name = name;
    }

    public String GetCourseName() {
        return name;
    }

    public void AddInstructor(String first_name, String last_name, String office_number) {
        Instructor new_instructor = new Instructor();
        new_instructor.instructorFirstName = first_name;
        new_instructor.instructorLastName = last_name;
        new_instructor.instructorOfficeNumber = office_number;

        instructors.add(new_instructor);
    }

    public String GetInstructorFirstName(int index) {
        return instructors.get(index).instructorFirstName;
    }

    public String GetInstructorLastName(int index) {
        return instructors.get(index).instructorLastName;
    }

    public String GetInstructorOfficeNumber(int index) {
        return instructors.get(index).instructorOfficeNumber;
    }

    public void AddBook(String title, String author, String publisher) {
        Book new_book = new Book();
        new_book.bookTitle = title;
        new_book.bookAuthor = author;
        new_book.bookPublisher = publisher;

        books.add(new_book);
    }

    public String GetBookTitle(int index) {
        return books.get(index).bookTitle;
    }

    public String GetBookAuthor(int index) {
        return books.get(index).bookAuthor;
    }

    public String GetBookPublisher(int index) {
        return books.get(index).bookPublisher;
    }
    public void print()
    {
        System.out.println("Course Name: " + name);

        System.out.println("Instructor Name: ");
        for (Instructor i : instructors) {
            System.out.print(i.instructorFirstName + " " + i.instructorLastName + ", ");
        }

        System.out.println();

        for (int i=0; i<books.size(); i++) {
            System.out.println("Book " + (i+1) + ": " + books.get(i).bookTitle);
            System.out.println("Book " + (i+1) + " Author: " + books.get(i).bookAuthor);
        }
    }
}
