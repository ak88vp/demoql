package people.activate;

import people.manager.PeopleManager;
import people.model.Student;
import people.manager.StudentManager;
import people.model.Teacher;

public class Main {
    public static void main(String[] args) {

        PeopleManager peopleManager = new PeopleManager();
        StudentManager studentManager=new StudentManager();

        peopleManager.add(new Student("DŨNG", 16, 10));
        peopleManager.add(new Student("ak88", 18, 7));
        peopleManager.add(new Student("ak", 18, 18));
        peopleManager.add(new Teacher("Như Anh", 16, "Math"));
        peopleManager.add(new Teacher("Quân", 16, "English"));
//        peopleManager.print();

        for (int i = 0; i < peopleManager.getIdFirst(); i++) {
            boolean isStudent = peopleManager.getPeopleArrayList().get(i) instanceof Student;
            if(isStudent){
                Student studentList = (Student) peopleManager.getPeopleArrayList().get(i);
                studentManager.add(studentList);
            }
        }
        studentManager.sort();
        studentManager.print();
    }
}
