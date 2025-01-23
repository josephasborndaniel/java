class Methodoverdata {
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
}
class Testoverloading{
    public static void main(String[] args) {
        System.out.println(Methodoverdata.add(11,11));
        System.out.println(Methodoverdata.add(11.23,5.4));
    }
}

