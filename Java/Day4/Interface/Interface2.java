package Java.Interface;

public interface Interface2 {
    static int a=10;
    void subtract();
    default void multiply(){
        System.out.println("Interface 2");
    }
}
