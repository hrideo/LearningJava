public class StudentProfile {
    String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int expectedGraduationYear;

    public StudentProfile(String firstName, String lastName,
                          String declaredMajor, double gpa, int expectedGraduationYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedGraduationYear = expectedGraduationYear;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedGraduationYear = this.expectedGraduationYear + 1;
    }
}
