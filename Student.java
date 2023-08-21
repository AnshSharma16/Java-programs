
    import java.util.Scanner;
public class Student{
        String name;
    String course;
    long  roll;
    long ph;
    int o;
    int dm;
    int d;
    int c;
    

   void  get(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name: ");
    sc.next();
    System.out.println("Enter your course: ");
    sc.next();
    
  }

   void display(){
    System.out.println(name);
    System.out.println(course);
    System.out.println(roll);
    System.out.println(ph);}
    
    
    void marks(){
     Scanner m=new Scanner(System.in);
     System.out.println("Enter OOPs marks out of 100: ");
     o=m.nextInt();
     System.out.println("Enter CO marks out of 100: ");
     c=m.nextInt();
     System.out.println("Enter DBMS marks out of 100: ");
     d=m.nextInt();
     System.out.println("Enter Maths marks out of 100: ");
     dm=m.nextInt();

    }

    void percent(){
        System.out.println((o+c+d+dm)/4);
    }
  
    public static void main(String[]args){

        
        Student st=new Student();
        st.get();
        st.display();
        Student k=new Student();
        k.marks();
        k.percent();
    }
}


