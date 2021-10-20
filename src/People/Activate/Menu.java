package People.Activate;

import People.Model.Student;
import People.Manager.StudentManager;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        StudentManager studentManager=new StudentManager();
        int selection;
        do {
            System.out.println("---------------------Menu-------------------");
            System.out.println(" 1 : Thêm học sinh ");
            System.out.println(" 2 : Xóa học sinh ");
            System.out.println(" 3 : Sửa học sinh ");
            System.out.println(" 4 : Tìm kiếm học sinh ");
            System.out.println(" 5 : Sắp xếp học sinh theo điểm ");
            System.out.println(" 6  : Hiển thị danh sách học sinh ");
            System.out.println(" 7 : Hiển thị tổng điểm của học sinh trong danh sách");
            System.out.println(" 0 : kết thúc ");
            selection = scanner.nextInt();
            if (selection > 0 && selection < 8) {
                switch (selection) {
                    case 1:
                        System.out.println("Nhập tên học sinh : ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Nhập tuổi của học sinh :");
                        int age = scanner.nextInt();
                        System.out.println("Nhập số điểm trung bình của học sinh :");
                        int mediumScore = scanner.nextInt();
                        studentManager.add(new Student( name, age,mediumScore));
                        break;
                    case 2:
                        System.out.println("Nhập vào id học sinh mà bạn muốn xóa : ");
                        int deleteId = scanner.nextInt();
                        studentManager.delete(deleteId);
                        break;
                    case 3:
                        System.out.println("Nhập id học sinh mà bạn muốn sửa");
                        int idWantToFix = scanner.nextInt();
                        if (studentManager.find(idWantToFix) > -1) {
                            System.out.println("Nhập tên học sinh : ");
                            scanner.nextLine();
                            String setName = scanner.nextLine();
                            System.out.println("Nhập số tuổi của học sinh :");
                            int setAge = scanner.nextInt();
                            System.out.println("Nhập số điểm trung bình của học sinh :");
                            int setMediumScore = scanner.nextInt();
                            Student newStudent = new Student( setName, setAge,setMediumScore);
                            studentManager.edit(idWantToFix, newStudent);
                        }
                        break;


                    case 4:
                        System.out.println("Nhập id của sinh viên mà bạn muốn tìm");
                        int idWantToFind = scanner.nextInt();
                        studentManager.find(idWantToFind);
                        break;
//                    case 5:
//                        studentManager.sort();
//                        break;
                    case 6:
                        studentManager.print();
                        break;
//                    case 7 :
//                        studentManager.total();
                }

            } else if (selection < 0 || selection > 7) {
                System.out.println("Chúng tôi chưa phát triển chức năng này ! ");
            } else {
                System.out.println("đã tắt chương trình");
            }
        }while (selection!=0);
    }
}
