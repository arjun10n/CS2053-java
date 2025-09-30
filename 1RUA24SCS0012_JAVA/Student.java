public class student{
	private String name;
	private int id;
public student (String name, int id){
  	this.name=name;
	this.id=id;
	System.out.println("student object created"+name);
	}
  protected void finalize(){
 	System.out.println("finalize() called for student" +name);
 public static void main(String[]args){
	Student s1= new Student("pranav",1);
	Student s2= new Student("prag",2);
	System.gc();