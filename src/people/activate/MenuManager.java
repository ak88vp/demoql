package people.activate;

import people.manager.PeopleManager;
import people.manager.StudentManager;
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

                        peopleManager.print();
                        break;
                    case 7:
                        StudentManager studentManager = getStudentManager(peopleManager);
                        studentManager.sort();
                        studentManager.print();
                        break;
                    case 8:
                        StudentManager studentManager1 = getStudentManager(peopleManager);
                        studentManager1.total();
                        break;

                }
            } else if (selection < 0 || selection > 8) {
                System.out.println("Chúng tôi chưa phát triển chức năng này ! ");
            } else {
                System.out.println("đã tắt chương trình");
            }
        } while (selection != 0);

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

    private static void find(Scanner scanner, PeopleManager peopleManager) {
        System.out.println("Nhập id của người bạn muốn tìm");
        int idWantToFind = scanner.nextInt();
        peopleManager.find(idWantToFind);
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

    private static void upDate(Scanner scanner, PeopleManager peopleManager) {
        int edit;
        do {
            System.out.println(" 1 : sửa học sinh ");
            System.out.println(" 2 : sửa giáo viên ");
            System.out.println(" 0 : Không sửa nữa ! ");
            edit = scanner.nextInt();
            if (edit == 1) {
                System.out.println("Nhập id của học sinh mà bạn muốn sửa");
                int idWantToFix = scanner.nextInt();
                if (peopleManager.find(idWantToFix) > -1) {
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
                break;
            }
            if (edit == 2) {
                System.out.println("Nhập id của giáo viên mà bạn muốn sửa");
                int idWantToFix = scanner.nextInt();
                if (peopleManager.find(idWantToFix) > -1) {
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
                }
                break;
            }
        } while (edit != 0);
    }

}
