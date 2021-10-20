package People.Manager;

import People.Interface.Management;
import People.Model.People;

import java.util.ArrayList;

public class PeopleManager implements Management<People> {
    ArrayList <People> peopleArrayList;
    int idFirst = 0;

    public PeopleManager(ArrayList<People> peopleArrayList) {
        this.peopleArrayList = peopleArrayList;
    }

    public PeopleManager() {
        peopleArrayList=new ArrayList<>();
    }

    @Override
    public void add(People people) {
        idFirst++;
        people.setId(idFirst);
        peopleArrayList.add(people);
    }

    @Override
    public void print() {
        for (People people : peopleArrayList) {
            System.out.println(people);

        }
    }

    @Override
    public int find(int id) {

        int index = -1;
        for (int i = 0; i < peopleArrayList.size(); i++) {
            if (peopleArrayList.get(i).getId() == id) {
                index = i;
                System.out.println("Đã tìm thấy người mà bạn cần .");
                System.out.println(" Người có thông tin là : " + peopleArrayList.get(index));
                return index;

            }

            System.out.println("---------end------------");


        }
        System.out.println("Ko tìm thấy người này ");
        return index;
    }

    @Override
    public void delete(int id) {
        peopleArrayList.remove(find(id));
    }

    @Override
    public void edit(int id, People people) {
        idFirst++;
        people.setId(idFirst);
        peopleArrayList.set(find(id), people);
    }

}
