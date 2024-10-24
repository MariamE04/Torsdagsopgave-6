package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Jonas", new ArrayList<>());
        student1.passedCourses.add("Math");
        student1.passedCourses.add("English");
        student1.passedCourses.add("Java 1.0");

        Student student2 = new Student("Maria", new ArrayList<>());
        student2.passedCourses.add("English");
        student2.passedCourses.add("Physics");

        Teacher teacher1 = new Teacher("Jane", new ArrayList<>());
        teacher1.canTeach.add("chemistry");
        teacher1.canTeach.add("Math");

        Teacher teacher2 = new Teacher("Hans", new ArrayList<>());
        teacher2.canTeach.add("Physics");
        teacher2.canTeach.add("English");
        teacher2.canTeach.add("Java 1.0");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        for (Person p : persons) {
            if (!p.addCourse("Java 1.0")){
                if (p instanceof Student) {
                    System.out.println(p.getName() + " har allerede bestået dette kursus.");
                } else if (p instanceof Teacher) {
                    System.out.println(p.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }

    }
}
