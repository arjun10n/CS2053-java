public class Student {
public String Sname;
public String USN;
public char Section;
public int Semester;
    
   public Student (String sname,String usn,char  section,int semester)
{
   this.Sname=sname;
   this.USN=usn;
   this.Section=section;
   this.Semester=semester;
}
        public void display()
        {   
            System.out.println("Student name is " + Sname);
             System.out.println("Student USN is " +USN);
              System.out.println(" Student in section" + Section);
                System.out.println("Student is in "+ Semester);
      }
}
public class Prog2
{
 public static void main (String args [])
{ 
 Student  std = new Student( "An","1RVU24SCS0012",'A',3);
std.display();
}
}

