package decorator.patter.demo;
public class ConcreteDecoratorEx_2 extends AbstractDecorator{
    public void doJob(){
        System.out.println("");
        System.out.println("*** Inicio Ex_2 ***");
        super.doJob();
        System.out.println("Sou do DecoratorEx_2");
        System.out.println("*** Fim do Ex_2 ***");
    }
}
