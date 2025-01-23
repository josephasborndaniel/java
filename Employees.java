public class Employees {
    int id ;
    String name;
    String addres;
  void insert(int i,String n,String a)
  {
    id =i;
    name=n;
    addres =a;
  }
  
  void display()
  {
    System.out.println("id ="+id+"name = "+name+"address = "+addres);
  }
  
    public static void main(String[] args)
    {
        Employees e1 = new Employees();
        Employees e2 = new Employees();
        Employees e3 = new Employees();
        e1.insert(101,"ajeet","hellow");
        e2.insert(102, "daniel", "world");
        e3.insert(103,"asborn","earth");
        e1.display();  
        e2.display();
        e3.display();  

    }
}
