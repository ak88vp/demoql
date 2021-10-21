package people.manager;

import people.model.Student;

import java.util.ArrayList;

public class StudentManager extends PeopleManager {
    ArrayList<Student> listStudent;
    private int size = 0;
    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    public StudentManager(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setListStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }
    public int getSize() {
        return size;
    }

    public StudentManager() {
        listStudent = new ArrayList<>();
    }

    public void add(Student student) {
        size++;
        listStudent.add(student);
    }

    @Override
    public void print() {
        for (Student student : listStudent) {
            System.out.println(student);

        }
    }

    @Override
    public int find(int id) {
        int index = -1;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                index = i;
                System.out.println("Đã tìm thấy học viên mà bạn cần .");
                System.out.println("Học viên có thông tin là : " + listStudent.get(index));
                return index;

            }
            System.out.println("---------end------------");
        }
        System.out.println("Ko tìm thấy học viên này ");
        return index;
    }

    @Override
    public void delete(int id) {
        size--;
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
        System.out.println(" Tổng điểm của các học sinh trong danh sách là : " + total + " điểm ");
    }


}
