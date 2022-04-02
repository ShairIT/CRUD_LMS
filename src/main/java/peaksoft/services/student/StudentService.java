package peaksoft.services.student;

import peaksoft.models.Student;

import java.util.List;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getByIdStudent(Long id);

    void updateStudent(Student student, Long id);

    void deleteStudent(Long id);
}