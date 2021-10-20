package People;

public interface Management<T> {
    void add(T t);
    void print();
    int find(int id);
    void delete(int id);
    void edit(int id ,T t);
    void sort();
    int total();

}
