package people.manager;

import people.model.Student;
import people.model.Teacher;

import java.util.ArrayList;

public class TeacherManager extends PeopleManager{
    ArrayList <Teacher> listTeacher;

    public TeacherManager() {
        listTeacher=new ArrayList<>();
    }

    public TeacherManager(ArrayList<Teacher> listTeacher) {
        this.listTeacher = listTeacher;
    }

    public ArrayList<Teacher> getListTeacher() {
        return listTeacher;
    }

    public void setListTeacher(ArrayList<Teacher> listTeacher) {
        this.listTeacher = listTeacher;
    }
    public void add(Teacher teacher) {
        listTeacher.add(teacher);
    }

    @Override
    public void print() {
        for (Teacher teacher : listTeacher) {
            System.out.println(teacher);

        }
        System.out.println("---------end------------");
    }

    @Override
    public int find(int id) {
        int index = -1;
        for (int i = 0; i < listTeacher.size(); i++) {
            if (listTeacher.get(i).getId() == id) {
                index = i;
                System.out.println("Đã tìm thấy giáo viên mà bạn cần .");
                System.out.println("Giáo viên đó có thông tin là : " + listTeacher.get(index));
                return index;

            }
            System.out.println("---------end------------");
        }
        System.out.println("Ko tìm thấy học viên này ");
        return index;
    }

    @Override
    public void delete(int id) {
        listTeacher.remove(find(id));
    }

}
