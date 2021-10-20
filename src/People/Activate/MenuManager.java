package People.Activate;

import People.Manager.PeopleManager;
import People.Model.Student;
import People.Model.Teacher;

import java.util.Scanner;

public class MenuManager {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        PeopleManager peopleManager=new PeopleManager();
        int selection;
        do {
            System.out.println("--------------------Menu-------------------");
            System.out.println(" 1 : Thêm học sinh ");
            System.out.println(" 2 : Thêm giáo viên  ");
            System.out.println(" 3 : Tìm kiếm  ");
            System.out.println(" 4 : Xóa  ");
            System.out.println(" 5 : Sửa ");
            System.out.println(" 6  : Hiển thị danh sách ");
            System.out.println(" 0 : kết thúc ");
            selection =scanner.nextInt();
            if(selection > 0 && selection < 7){
                switch (selection){
                    case 1:
                        System.out.println("Nhập tên học sinh : ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Nhập tuổi của học sinh :");
                        int age = scanner.nextInt();
                        System.out.println("Nhập số điểm trung bình của học sinh :");
                        int mediumScore = scanner.nextInt();
                        peopleManager.add(new Student( name, age,mediumScore));
                        break;
                    case 2:
                        System.out.println("Nhập tên giáo viên : ");
                        scanner.nextLine();
                        String nameTeacher = scanner.nextLine();
                        System.out.println("Nhập tuổi của giáo viên :");
                        int ageTeacher = scanner.nextInt();
                        System.out.println("Nhập môn dạy :");
                        scanner.nextLine();
                        String subject = scanner.nextLine();
                        peopleManager.add(new Teacher( nameTeacher, ageTeacher,subject));
                    case 3:
                        System.out.println("Nhập id của người bạn muốn tìm");
                        int idWantToFind = scanner.nextInt();
                        peopleManager.find(idWantToFind);
                        break;
                    case 4:
                        System.out.println("Nhập vào id của người bạn muốn xóa : ");
                        int deleteId = scanner.nextInt();
                       peopleManager.delete(deleteId);
                        break;
                    case 5 :
                        System.out.println("Nhập id của người mà bạn muốn sửa");
                        int idWantToFix = scanner.nextInt();
                        if (peopleManager.find(idWantToFix) > -1) {
                            System.out.println("Nhập tên  : ");
                            scanner.nextLine();
                            String setName = scanner.nextLine();
                            System.out.println("Nhập số tuổi của học sinh :");
                            int setAge = scanner.nextInt();
                            System.out.println("Nhập số điểm trung bình của học sinh :");
                            int setMediumScore = scanner.nextInt();
                            Student newStudent = new Student( setName, setAge,setMediumScore);
                            peopleManager.edit(idWantToFix, newStudent);
                        }
                        break;
                }
            }else if (selection < 0 || selection > 6) {
                System.out.println("Chúng tôi chưa phát triển chức năng này ! ");
            } else {
                System.out.println("đã tắt chương trình");
            }
        }while (selection!=0);

    }
}
