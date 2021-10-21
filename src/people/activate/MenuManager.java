package people.activate;

import people.manager.PeopleManager;
import people.manager.StudentManager;
import people.manager.TeacherManager;
import people.model.Student;
import people.model.Teacher;
import java.util.Scanner;

public class MenuManager {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PeopleManager peopleManager = new PeopleManager();

        int selection;
        do {
            System.out.println("+_+_+_+_+_+_+_+_+_Menu_+_+_+_+_+_+_+_+_+");
            System.out.println(" 1 : Thêm học sinh ");
            System.out.println(" 2 : Thêm giáo viên  ");
            System.out.println(" 3 : Tìm kiếm  ");
            System.out.println(" 4 : Xóa  ");
            System.out.println(" 5 : Sửa ");
            System.out.println(" 6 : Hiển thị danh sách ");
            System.out.println(" 7 : sắp xếp học sinh theo điểm ");
            System.out.println(" 8 : Tính tổng điểm của học sinh ");
            System.out.println(" 0 : kết thúc ");
            selection = scanner.nextInt();
            if (selection > 0 && selection < 9) {
                switch (selection) {
                    case 1:
                        addStudents(scanner, peopleManager);
                        break;
                    case 2:
                        addTeacher(scanner, peopleManager);
                        break;
                    case 3:
                        find(scanner, peopleManager);
                        break;
                    case 4:
                        delete(scanner, peopleManager);
                        break;
                    case 5:
                        upDate(scanner, peopleManager);
                        break;
                    case 6:
                        StudentManager studentManager = getStudentManager(peopleManager);
                        TeacherManager teacherManager = getTeacherManager(peopleManager);
                        studentManager.print();
                        teacherManager.print();
                        break;
                    case 7:
                        StudentManager studentManager1 = getStudentManager(peopleManager);
                        studentManager1.sort();
                        studentManager1.print();
                        break;
                    case 8:
                        StudentManager studentManager2 = getStudentManager(peopleManager);
                        studentManager2.total();
                        break;

                }
            } else if (selection < 0 || selection > 8) {
                System.out.println("Chúng tôi chưa phát triển chức năng này ! ");
            } else {
                System.out.println("Đã tắt chương trình");
            }
        } while (selection != 0);

    }

    private static void upDate(Scanner scanner, PeopleManager peopleManager) {
        int choice;
        do {
            System.out.println(" 1 : Sửa học sinh ");
            System.out.println(" 2 : Sửa giáo viên ");
            System.out.println(" 0 : Không sửa nữa ! ");
            choice = scanner.nextInt();
            if (choice == 1) {
                StudentManager studentManager = getStudentManager(peopleManager);
                System.out.println("Nhập id của học sinh mà bạn muốn sửa");
                int idWantToFix = scanner.nextInt();
                for (int i = 0; i < studentManager.getSize(); i++) {
                    boolean isIdStudent = studentManager.getListStudent().get(i).getId() == idWantToFix;
                    if (isIdStudent) {
                        System.out.println("Nhập tên học sinh  : ");
                        scanner.nextLine();
                        String setName = scanner.nextLine();
                        System.out.println("Nhập số tuổi của học sinh :");
                        int setAge = scanner.nextInt();
                        System.out.println("Nhập số điểm trung bình của học sinh :");
                        int setMediumScore = scanner.nextInt();
                        Student newStudent = new Student(setName, setAge, setMediumScore);
                        peopleManager.edit(idWantToFix, newStudent);
                    }
                }
                System.out.println("Danh sách học sinh không có người có ID  này :( ");
                break;
            }
            if (choice == 2) {
                TeacherManager teacherManager = getTeacherManager(peopleManager);
                System.out.println("Nhập id của giáo viên mà bạn muốn sửa");
                int idWantToFix = scanner.nextInt();
                for (int i = 0; i < teacherManager.getListTeacher().size(); i++) {
                    boolean isIdTeacher = teacherManager.getListTeacher().get(i).getId() == idWantToFix;
                    if (isIdTeacher) {
                        System.out.println("Nhập tên giáo viên  : ");
                        scanner.nextLine();
                        String setName = scanner.nextLine();
                        System.out.println("Nhập số tuổi của giáo viên :");
                        int setAge = scanner.nextInt();
                        System.out.println("Nhập môn dạy của giáo viên :");
                        scanner.nextLine();
                        String setSubject = scanner.nextLine();
                        Teacher newTeacher = new Teacher(setName, setAge, setSubject);
                        peopleManager.edit(idWantToFix, newTeacher);
                        break;
                    }
                }
                System.out.println("Danh sách giáo viên không có người có ID  này :(");
                break;
            }
        } while (choice != 0);
    }

    private static TeacherManager getTeacherManager(PeopleManager peopleManager) {
        TeacherManager teacherManager = new TeacherManager();
        for (int i = 0; i < peopleManager.getIdFirst(); i++) {
            boolean isTeacher = peopleManager.getPeopleArrayList().get(i) instanceof Teacher;
            if (isTeacher) {
                Teacher teacherList = (Teacher) peopleManager.getPeopleArrayList().get(i);
                teacherManager.add(teacherList);
            }
        }
        return teacherManager;
    }

    private static StudentManager getStudentManager(PeopleManager peopleManager) {
        StudentManager studentManager = new StudentManager();
        for (int i = 0; i < peopleManager.getIdFirst(); i++) {
            boolean isStudent = peopleManager.getPeopleArrayList().get(i) instanceof Student;
            if (isStudent) {
                Student studentList = (Student) peopleManager.getPeopleArrayList().get(i);
                studentManager.add(studentList);
            }
        }
        return studentManager;
    }

    private static void find(Scanner scanner, PeopleManager peopleManager) {
        System.out.println("Nhập id của người bạn muốn tìm");
        int idWantToFind = scanner.nextInt();
        peopleManager.find(idWantToFind);
    }

    private static void addStudents(Scanner scanner, PeopleManager peopleManager) {
        System.out.println("Nhập tên học sinh : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi của học sinh :");
        int age = scanner.nextInt();
        System.out.println("Nhập số điểm trung bình của học sinh :");
        int mediumScore = scanner.nextInt();
        peopleManager.add(new Student(name, age, mediumScore));
    }

    private static void delete(Scanner scanner, PeopleManager peopleManager) {
        System.out.println("Nhập vào id của người bạn muốn xóa : ");
        int deleteId = scanner.nextInt();
        peopleManager.delete(deleteId);
    }


    private static void addTeacher(Scanner scanner, PeopleManager peopleManager) {
        System.out.println("Nhập tên giáo viên : ");
        scanner.nextLine();
        String nameTeacher = scanner.nextLine();
        System.out.println("Nhập tuổi của giáo viên :");
        int ageTeacher = scanner.nextInt();
        System.out.println("Nhập môn dạy :");
        scanner.nextLine();
        String subject = scanner.nextLine();
        peopleManager.add(new Teacher(nameTeacher, ageTeacher, subject));
    }


}
