package August.ex24082024;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import java.util.*;

public class Lab236 {
    public static void main(String[] args) {
        Student s1 = new Student(4, "Surya");
        Student s2 = new Student(2, "Tharun");
        Student s3 = new Student(3, "Madhu");
        Student s4 = new Student(1, "Karthik");

        List arrayList = new ArrayList();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);
        System.out.println(arrayList);
        //Collections.sort(arrayList); //Comparable
       // System.out.println(arrayList);
        Collections.sort(arrayList, new SortByID());
        System.out.println(arrayList);
        Collections.sort(arrayList, new SortByName());
        System.out.println(arrayList);
        Collections.sort(arrayList, new SortByIDDesc());
        System.out.println(arrayList);
        Collections.sort(arrayList, new SortByNameDesc());
        System.out.println(arrayList);

    }
}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDesc implements  Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getName().compareTo(o1.getName());
    }
}

class SortByID implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

class SortByIDDesc implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}

//class Student implements Comparable<Student>{
class Student{
    private Integer id;
    private String name;

    public Student(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id, o.id);
//    }


//    @Override
//    public int compareTo(Student o) {
//        return CharSequence.compare(this.name, o.name);
//    }
}
