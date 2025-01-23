//overrinding
class Bank {
   int  getintrest(){
    return 0;
   }
}

class Sbi extends Bank{
    int getintrest()
    {
        return 5;
    }
}

class Icic extends Bank{
    int getintrest()
    {
        return 8;
    }
}

class Axis extends Bank{
    int getintrest()
    {
        return 7;
    }
}

class test{
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Icic i = new Icic();
        Axis a=new Axis();
        System.out.println(+a. getintrest());
        System.out.println("SBI Rate of Interest: "+s. getintrest());  
        System.out.println("ICICI Rate of Interest: "+i. getintrest());

    }
}
