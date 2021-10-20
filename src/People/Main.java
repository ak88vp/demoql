package People;

public class Main {
    public static void main(String[] args) {
        StudentManager peopleManager =new StudentManager();
        peopleManager.add(new Student("ak88",16,8));
        peopleManager.add(new Student("ak86",22,6));
        peopleManager.add(new Student("ak87",24,10));
        peopleManager.print();
//        peopleManager.find(5);
//        peopleManager.delete(3);
//        peopleManager.print();
//        peopleManager.edit(3,new Student(4,"ak89",26,7));
//        peopleManager.print();
//        peopleManager.sort();
//        peopleManager.print();
        peopleManager.total();


    }
}
