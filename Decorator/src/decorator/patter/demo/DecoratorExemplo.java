package decorator.patter.demo;
public class DecoratorExemplo{
    public static void main(String[] args){

        System.out.println("Exemplo Decorator Patter");
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorEx_1 cd_1 = new ConcreteDecoratorEx_1();
        cd_1.setTheComponent(cc);
        cd_1.doJob();

        ConcreteDecoratorEx_2 cd_2 = new ConcreteDecoratorEx_2();
        cd_2.setTheComponent(cd_1);
        cd_2.doJob();
    }
}