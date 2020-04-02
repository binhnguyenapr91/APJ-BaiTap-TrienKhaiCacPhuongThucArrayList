import java.util.Collections;
import java.util.Iterator;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<String>(10);

        myList.add("BinhNguyen");
        myList.add("ThanhNguyen");
        myList.add("NguyenNguyen");
        myList.add("DucTran");
        myList.add("HoangPhan");

        System.out.println("Original List");
        System.out.println("This list has size: "+ myList.size());
        display(myList);

        System.out.println("After add elemnents at positon 3");
        myList.add(3,"SieuNhan");
        System.out.println("This list has size: "+ myList.size());
        display(myList);

        System.out.println("After remove elemnents at positon 4");
        myList.remove(4);
        System.out.println("This list has size: "+ myList.size());
        display(myList);

        System.out.print("Check if contain 'BinhNguyen' elements: ");
        System.out.println(myList.contains("BinhNguyen"));

        System.out.print("Check index of 'SieuNhan' elements: ");
        System.out.println( myList.indexOf("SieuNhan"));

        System.out.print("Get elements at index 1: ");
        System.out.println( myList.get(1));

        System.out.println("After clear all elements");
        myList.clear();
        System.out.println("This list has size: "+ myList.size());
        display(myList);
    }

    private static void display(MyList<String> myList) {
        Iterator itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println("Memmber: " + itr.next());
        }
    }
}
