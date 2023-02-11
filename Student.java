package q02;
import java.text.DecimalFormat;
import java.util.Objects;

public class Student extends Person {
    private String major;
    private double totalGrade;
    private int numberOfCourses;

    public Student() {
    }

    public Student(String name, int age, String gender, String major, double totalGrade, int numberOfCourses) {
        super(name, age, gender);
        this.major = major;
        this.totalGrade = totalGrade;
        this.numberOfCourses = numberOfCourses;
    }

    public double getAverageGrade() {
        return totalGrade / numberOfCourses;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return super.toString() + ", Major: " + major + ", Total Grade: "
                + df.format(totalGrade) + ", Number of courses: "
                + numberOfCourses + ", Average Grade: "
                + df.format(getAverageGrade()) + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        if (!Objects.equals(major, other.major)) {
            return false;
        }
        if (!Objects.equals(totalGrade, other.totalGrade)) {
            return false;
        }
        if (!Objects.equals(numberOfCourses, other.numberOfCourses)) {
            return false;
        }
        return super.equals(obj);
    }
}
