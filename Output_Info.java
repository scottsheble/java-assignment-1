package q02;
public class Output_Info {
    public Output_Info() {}
    /**
     * @param args
     */
    public static void main(String[] args) {
        Employee employee1 = new Employee("Linda Ward",26,"Female",17.8, 22.7);
        System.out.println(employee1);
        Employee employee2 = new Employee("Linda Ward", 26, "Female", 19.3, 17.8);
        System.out.println(employee2);
        if (employee1.equals(employee2)) {
            System.out.println("These employees are the same; true");
        }
        else {
            System.out.println("These employees are different people; false");
        }
        Student student1 = new Student("James Smith", 21, "Male", "Computer Science", 281, 4);
        System.out.println(student1);
        Student student2 = new Student("James Smith", 21, "Male", "Information Technology", 281, 3);
        System.out.println(student2);
        if (student1.equals(student2)) {
            System.out.println("These students are the same; true");
        }
        else {
            System.out.println("These students are different people; false");
        }
    }
}