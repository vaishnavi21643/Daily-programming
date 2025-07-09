public class methods{
    private int id;
    private String name;

    public methods(int id,String name){
        this.id = id;
        this.name = name;

    }

    public void display(String headers){
        System.out.println(headers);
        System.out.println(getName());
        System.out.println(getId());

    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public static void main(String[] args) {
        methods obj = new methods(1,"kiran");

        obj.display("details");
    }
}