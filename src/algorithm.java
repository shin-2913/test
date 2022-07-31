
import java.util.ArrayList;

public class algorithm {
    public static void main(String[] args){
    Student st1 = new Student("손오공","1682");
    Student st2 = new Student("저팔계","1772");
    Student st3 = new Student("사오정","1813");

    ArrayList <Student>list = new ArrayList<Student>();
    
       list.add(st1);
        list.add(st2);
        list.add(st3);

        for (Student Stu :list){
            System.out.println(stu.getNme());
            System.out.println(stu.getNo());
        }
    }
}
