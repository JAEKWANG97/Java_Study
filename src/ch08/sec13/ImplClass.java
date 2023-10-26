package ch08.sec13;

public class ImplClass implements InterfaceC{
    @Override
    public void methodA(){
        System.out.println("excute methodA()");
    }
    @Override
    public void methodB(){
        System.out.println("excute methodB()");
    }

    @Override
    public void methodC(){
        System.out.println("excute methodC()");
    }
}
