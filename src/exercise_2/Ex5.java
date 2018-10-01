package exercise_2;

class Student implements Cloneable
{
    int rollno;
    String name;

    Student(int rollno, String name)
    {
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Ex5 {
    public static void main(String args[]){
        try{
            Student s1=new Student(101,"puneet");
            Student s2=(Student)s1.clone();
            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);
        }catch(CloneNotSupportedException c){}
        copy c = new copy(10, 15);
        copy c1 = new copy(c);
        System.out.println("Copied values from constructor= " + c1.x + " and " + c1.y);
    }
}
class copy {
    int x,y;

    public copy(int x, int y) {
        this.x = x;
        this.y = y;
    }
    copy(copy C)
    {
        x=C.x;
        y=C.y;
    }

}