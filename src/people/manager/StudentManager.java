package people.manager;

import people.model.Student;

import java.util.ArrayList;

public class StudentManager extends PeopleManager {
    ArrayList<Student> listStudent;

    public StudentManager(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public StudentManager() {
        listStudent = new ArrayList<>();
    }

    public void add(Student student) {
        listStudent.add(student);
    }

    @Override
    public void print() {
        for (Student student : listStudent) {
            System.out.println(student);

        }
        System.out.println("---------end------------");
    }

    @Override
    public int find(int id) {
        int index = -1;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                index = i;
                System.out.println("đã tìm thấy học viên mà bạn cần .");
                System.out.println(" học viên có thông tin là : " + listStudent.get(index));
                return index;

            }

            System.out.println("---------end------------");


        }
        System.out.println("ko tìm thấy học viên này ");
        return index;
    }

    @Override
    public void delete(int id) {
        listStudent.remove(find(id));
    }

    public void sort() {
        listStudent.sort((a, b) -> (int) (a.getMediumScore() - b.getMediumScore()));
    }


    public void total() {
        int total = 0;
        for (Student student : listStudent) {
            total += student.getMediumScore();
        }
        System.out.println(" tổng điểm của các học sinh trong danh sách là : " + total + " điểm ");
    }

    public void edit(int id, Student student) {
        listStudent.set(find(id), student);
    }
}
