package Task3;

import java.util.ArrayList;

public class Student extends Person{
    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
         this.currentCourses = new ArrayList<String>();
    }

    @Override
    public boolean addCourse(String course) {
        // Tjek om kurset allerede er bestået
        if(passedCourses.contains(course)){ // Hvis kurset er bestået, returneres false
            return false;
        } else {
            return true; // Returner true, da kurset blev tilføjet
        }
    }
}
