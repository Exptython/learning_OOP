import java.util.ArrayList;
import java.util.*;

// Base Class
class Person {
    private String name;
    private String email;

    // Constructor
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Display method (can be overridden)
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

// Derived Class: Student
class Student extends Person {
    private String studentID;
    private Double gpa;  // Wrapper class

    // Constructor
    public Student(String name, String email, String studentID, Double gpa) {
        super(name, email);  // Calls base class constructor
        this.studentID = studentID;
        this.gpa = gpa;
    }

    // Copy Constructor
    public Student(Student other) {
        super(other.getName(), other.getEmail());
        this.studentID = other.studentID;
        this.gpa = other.gpa;
    }

    // Overridden method
    @Override
    public void displayInfo() {
        System.out.println("---- Student Info ----");
        super.displayInfo(); // Calls Person's displayInfo()
        System.out.println("Student ID: " + studentID);
        System.out.println("GPA: " + gpa);
    }
}

// Derived Class: Instructor
class Instructor extends Person {
    private String instructorID;
    private String specialization;

    // Constructor
    public Instructor(String name, String email, String instructorID, String specialization) {
        super(name, email);
        this.instructorID = instructorID;
        this.specialization = specialization;
    }

    // Overridden method
    @Override
    public void displayInfo() {
        System.out.println("---- Instructor Info ----");
        super.displayInfo();
        System.out.println("Instructor ID: " + instructorID);
        System.out.println("Specialization: " + specialization);
    }
}

// Course Class
class Course {
    private String courseCode;
    private String title;
    private int creditHours;
    private Instructor instructor;

    // Constructor
    public Course(String courseCode, String title, int creditHours) {
        this.courseCode = courseCode;
        this.title = title;
        this.creditHours = creditHours;
    }

    // Method to assign instructor using "this"
    public void assignInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Display course info
    public void displayCourseInfo() {
        System.out.println("---- Course Info ----");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + title);
        System.out.println("Credit Hours: " + creditHours);
        if (instructor != null) {
            System.out.println("Instructor: " + instructor.getName());
        }
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public String getTitle() {
        return title;
    }
}

// Enrollment Class
class Enrollment {
    private Student student;
    private Course course;
    private Character grade; // Wrapper class

    // Constructor
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Method to display enrollment details
    public void displayEnrollment() {
        System.out.println("---- Enrollment Info ----");
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + course.getTitle());
        System.out.println("Grade: " + (grade != null ? grade : "Not Assigned"));
    }

    // Method to update grade (returns new object)
    public Enrollment updateGrade(Character newGrade) {
        Enrollment updated = new Enrollment(this.student, this.course);
        updated.grade = newGrade;
        return updated;
    }
}

// Main Class
public class CourseManagementSystem {
    public static void main(String[] args) {

        // Create Instructors
        Instructor inst1 = new Instructor("Dr. Ali", "ali@uni.edu", "I001", "Computer Science");
        Instructor inst2 = new Instructor("Dr. Sara", "sara@uni.edu", "I002", "Mathematics");

        // Create Courses
        Course c1 = new Course("CS101", "Intro to Programming", 3);
        Course c2 = new Course("MTH102", "Calculus", 4);

        // Assign Instructors
        c1.assignInstructor(inst1);
        c2.assignInstructor(inst2);

        // Create Students
        Student s1 = new Student("Ahmed", "ahmed@uni.edu", "S101", 3.7);
        Student s2 = new Student("Aisha", "aisha@uni.edu", "S102", 3.9);

        // Copy Student using copy constructor
        Student s3 = new Student(s1);

        // Enroll students
        Enrollment e1 = new Enrollment(s1, c1);
        Enrollment e2 = new Enrollment(s2, c2);

        // Update grade (returns new object)
        Enrollment e3 = e1.updateGrade('A');

        // Display information
        s1.displayInfo();
        inst1.displayInfo();
        c1.displayCourseInfo();
        e3.displayEnrollment();

        // Dynamic dispatch demonstration
        System.out.println("\n---- Dynamic Dispatch Demo ----");
        List<Person> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(inst1);
        people.add(inst2);

        for (Person p : people) {
            p.displayInfo();  // Calls overridden version at runtime
        }
    }
}