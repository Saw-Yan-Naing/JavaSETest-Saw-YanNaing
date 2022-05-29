package withi_ide;

//multi level inheritance

class GrandParent{
   static void add(){
        System.out.println("GrandParent method.");
    }
}
class Parent extends GrandParent{
    static  void sum(){
        System.out.println("Parent method.");
    }
}

public class Q18 extends Parent {
    static void sum1(){
        System.out.println("Q18 class method is working.");
    }

    public static void main(String[] args) {

Parent obj =new Q18();

        System.out.println(obj);
    }

}
