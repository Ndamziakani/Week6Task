package library;


import library.models.Book;
import library.models.Student;
import library.models.Teacher;
import library.service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();


        library.addBook(new Book("Java", 1));
        library.addBook(new Book("Quality", 2));


        Teacher teacher = new Teacher("Ms ADA");
        Student seniorStudent = new Student("Ndamzi", 2);
        Student juniorStudent = new Student("Jude", 1);


        System.out.println(library.borrowBook(seniorStudent, "Java"));
        System.out.println(library.borrowBook(teacher, "Java"));
        System.out.println(library.borrowBook(juniorStudent, "Quality "));


        library.returnBook("Java");
        System.out.println(library.borrowBook(teacher, "Java"));
    }
}