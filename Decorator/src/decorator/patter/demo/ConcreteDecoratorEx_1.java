package decorator.patter.demo;

public class ConcreteDecoratorEx_1 extends AbstractDecorator{
    public void doJob(){
        super.doJob();
        System.out.println("Sou do DecoratorEx_1!!!");
    }
}