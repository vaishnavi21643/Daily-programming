
class oops{
    private int a;
    private int b;

    public void setA(int a ){
        this.a =a;

    }
    public void setB(int b){
        this.b =b;
    }

    public void sum(){
        System.out.println(a+b);
    }

    public void sub(){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        oops obj = new oops();
        obj.setA(5);
        obj.setB(10);

        obj.sum();
        obj.sub();
    }
}
