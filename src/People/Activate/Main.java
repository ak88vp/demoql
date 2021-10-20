package People.Activate;

import People.Manager.PeopleManager;
import People.Model.Student;
import People.Manager.StudentManager;
import People.Model.Teacher;

public class Main {
    public static void main(String[] args) {
//        StudentManager peopleManager =new StudentManager();
//        peopleManager.add(new Student("ak88",16,8));
//        peopleManager.add(new Student("ak86",22,6));
//        peopleManager.add(new Student("ak87",24,10));
//        peopleManager.print();
//        peopleManager.find(5);
//        peopleManager.delete(3);
//        peopleManager.print();
//        peopleManager.edit(3,new Student(4,"ak89",26,7));
//        peopleManager.print();
//        peopleManager.sort();
//        peopleManager.print();
//        peopleManager.total();

        PeopleManager peopleManager = new PeopleManager();
        peopleManager.add(new Student("DŨNG", 16, 8));
        peopleManager.add(new Student("ak88", 18, 7));
        peopleManager.add(new Teacher("Như Anh", 16, "Math"));
        peopleManager.add(new Teacher("Quân", 16, "English"));
        peopleManager.print();
        peopleManager.find(2);
        peopleManager.delete(2);
        peopleManager.print();
        peopleManager.edit(4, new Teacher("Huấn hoa hồng", 30, "đạo đức"));
        peopleManager.print();

    }
}
