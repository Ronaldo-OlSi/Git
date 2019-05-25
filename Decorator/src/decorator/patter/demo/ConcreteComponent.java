package decorator.patter.demo;
public class ConcreteComponent extends Component{
   // @Overide
    public void doJob(){
        System.out.println("Sou do ConcreteComponent" +
                " - Estou fechado para modificações.");
    }
}
