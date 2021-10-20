package demo2;
import java.util.Objects;

public class QUANly extends QlLoz implements HDofL<QlLoz>{
    QlLoz[] list= new QlLoz[3];
    private int size = 0;

    public QUANly() {
    }

    public QlLoz[] getList() {
        return list;
    }

    public void setList(QlLoz[] list) {
        this.list = list;
    }

    @Override
    public void them(QlLoz t) {
        list[size]=t;
        size++;
    }

    @Override
    public void in() {
        for (QlLoz qlLoz : list) {
            System.out.println(qlLoz);
        }
        System.out.println("---------------------------------------");
    }

    @Override
    public void sua(String name, QlLoz newLOZ) {
        list[tim(name)]=newLOZ;
    }
    @Override
    public int tim(String name  ) {
        int index=-1;
      for(int i=0;i<list.length;i++){
          if(Objects.equals(list[i].getName(), name)){
              index=i;
              System.out.println("vị trí là : " +index);
              System.out.println(list[index].toString());
              System.out.println("--------------------------------");
          }
      }
        if(index==-1){
            System.out.println("ko tìm thấy cái lozz này");
        }
        return index;


    }

    @Override
    public void xoa(String name) {
    QlLoz[] newList=new QlLoz[list.length-1];
    int index=0;
    for (int i=0;i<list.length;i++){
        if(list[i].getName().equals(name)){
            continue;
        }
        newList[index]=list[i];
        index++;
    }
    setList(newList);
    }
}
