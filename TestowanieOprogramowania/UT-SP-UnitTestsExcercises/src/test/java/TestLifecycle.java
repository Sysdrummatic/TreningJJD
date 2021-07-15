import org.junit.*;

public class TestLifecycle {

    @Before
    public void setUp(){
        System.out.println("Set up");
        System.out.flush();
    }

    @After
    public void tearDown(){
        System.out.println("Tear down");
        System.out.flush();
    }

    @BeforeClass
    public static void setUpClass(){
        System.out.println("Set up class");
        System.out.flush();
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("Tear down class");
        System.out.flush();
    }

    @Test
    public void test1(){
        System.out.println("test 1");
        System.out.flush();
    }

    @Test
    public void test2(){
        System.out.println("test2");
        System.out.flush();
    }



}
