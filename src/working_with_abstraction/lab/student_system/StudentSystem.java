package working_with_abstraction.lab.student_system;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private final Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public void parseCommand(String[] arguments) {
        if (arguments[0].equals("Create")) {
            createStudentInRepo(arguments);
        } else if (arguments[0].equals("Show")) {
            showStudent(arguments);
        }
    }

    private void showStudent(String[] arguments) {
        String name = arguments[1];
        if (repo.containsKey(name)) {
            Student student = repo.get(name);
            String view = String.format("%s is %s years old.", student.getName(), student.getAge());

            if (student.getGrade() >= 5.00) {
                view += " Excellent student.";
            } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                view += " Average student.";
            } else {
                view += " Very nice person.";
            }

            System.out.println(view);
        }
    }

    private void createStudentInRepo(String[] arguments) {
        String name = arguments[1];
        int age = Integer.parseInt(arguments[2]);
        double grade = Double.parseDouble(arguments[3]);
        if (!repo.containsKey(name)) {
            Student student = new Student(name, age, grade);
            repo.put(name, student);
        }
    }
}
