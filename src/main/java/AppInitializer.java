import bean.BeanFour;
import bean.BeanOne;
import bean.BeanThree;
import bean.MyConnection;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        //Run Something just before jvm Shutdown
//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("JVM Is about to ShutDown");
//                ctx.close();
//            }
//        }));

        ctx.registerShutdownHook(); //JVM eka shutdown wenn mohothakat kalin context ek shutdown krn eka
        ctx.register(AppConfig.class);
        ctx.refresh();
        
        
        //       Requst Bean form Application Context using bean Id
        //Bean Name request (Bean Id)
//        BeanOne beanOne = ctx.getBean(BeanOne.class);
//        BeanThree beanThree = ctx.getBean(BeanThree.class); //Class Type
//        System.out.println(beanOne);
//        System.out.println(beanThree);
//
//        BeanFour beanFour = ctx.getBean(BeanFour.class);
//        System.out.println(beanFour);

        //Bean Name eken Request karann puluwn(Bean Id)
        //BeanOne --> beanOne(Bean Id)
//        BeanOne beanOne = ctx.getBean("beanOne");
//        System.out.println(beanOne);

        //BeanThree --> beanThree
        //We can Change the default bean id to what we want
//        BeanThree beanThree = (BeanThree) ctx.getBean("beanThree"); //Bean Id
//        System.out.println(beanThree);


//        MyConnection bean = ctx.getBean(MyConnection.class);
//        System.out.println(bean);


        //MyConnection --> myConnection //no
        ///@Bean --> bean id --> bean method name
//        MyConnection myConnection = (MyConnection) ctx.getBean("getConnection");
//        System.out.println(myConnection);

//        MyConnection myConnection = (MyConnection) ctx.getBean("connection");
//        System.out.println(myConnection);

        BeanOne ref1 = ctx.getBean(BeanOne.class);
        BeanOne ref2 = ctx.getBean(BeanOne.class);
        System.out.println(ref1);
        System.out.println(ref2);

        BeanThree ref3 = ctx.getBean(BeanThree.class);
        System.out.println(ref3);
        BeanThree ref4 = ctx.getBean(BeanThree.class);
        System.out.println(ref4);

        MyConnection con1 = ctx.getBean(MyConnection.class);
        MyConnection con2 = ctx.getBean(MyConnection.class);
        System.out.println(con1);
        System.out.println(con2);
    }
}
