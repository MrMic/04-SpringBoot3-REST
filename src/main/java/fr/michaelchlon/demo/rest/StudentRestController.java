package fr.michaelchlon.demo.rest;

import fr.michaelchlon.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {
  private List<Student> theStudents;

  // define @PostConstruct to load student data ... only once!
  @PostConstruct
  public void loadData() {
    theStudents = new ArrayList<>();
    theStudents.add(new Student("John", "Doe"));
    theStudents.add(new Student("Mary", "Smith"));
    theStudents.add(new Student("Peter", "Jackson"));
  }

  // define endpoint for "/students" - return a list of students
  @GetMapping("/students")
  public List<Student> getStudents() {

    return theStudents;
  }
}
