public class MyReactangle {
    int length;
    int breath;
    void insert(int l,int b)
    {
        length = l;
        breath = b;

    }
    void display(){
        System.out.println("area ="+length*breath);
    }

    public static void main(String[] args)
    {
           MyReactangle r1= new    MyReactangle();
           MyReactangle r2 = new   MyReactangle();
           MyReactangle r3 = new   MyReactangle();

        r1.insert(11,5);
        r2.insert(3,15);  
        r3.insert(4,7);

        r1.display();
        r2.display();
        r3.display();

    }

}

