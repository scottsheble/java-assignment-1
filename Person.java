package q02;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private String gender;
    public Person() {}
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getGender() {return gender;}
    @Override
    public String toString() {
        return "Person [[Name: " + name + ", Age: " + age + ", Gender: " + gender + "]";
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
        Person other = (Person) obj;
        if (!Objects.equals(name, other.name)) {
            return false;
        }
        if (!Objects.equals(age, other.age)) {
            return false;
        }
        return true;
    }
}
/*if (name == null) {
            if (other.name != null) {
                return false;
        } else if (!name.equals(other.name)) {
                return false;
                }
        }*/

