package ClassesObjects;

/**
 * Created by MDS1728 on 5/8/2017.
 */
public class StudentsMain {
    public static void main(String[] args) {
        //Instantiate against newly created student class
        Students students = new Students();

        //Students = Class name
        //new = implies new object to be created
        //Students() = a call to the Students constructor


        //I want to reach out to the fileds and methods inside the Students
        // class through the students object


        System.out.println(students.studentsarr[10]);

        //I want to reach out to Student's helper class

        System.out.println (students.type.employeeType[0]);

    }
}
