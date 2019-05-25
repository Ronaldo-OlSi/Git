package test;

public class FoobarTeste {
    //@BeforeClass
    public static void setUpClass() throws Exception{
        //Executado antes do primeiro texte
    }
   // @Before
    public void setUp() throws Exception{
        //Executado antes de cada teste
    }
    //@Teste
    public void testOneThing(){

    }
   // @Teste
    public void testAnotherThing(){

    }
   // @Teste
    public void testSomethingElse(){

    }
   // @After
    public void tearDown() throws Exception{

    }
   // @AfterClass
    public void tearDonClass()throws Exception{
        //Executado depois do ultimo texte
    }
}

