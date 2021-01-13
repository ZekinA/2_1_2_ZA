import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        //Задание
        HelloWorld secondBean = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat firstCat = applicationContext.getBean("catBean", Cat.class);
        Cat secondCat = applicationContext.getBean("catBean", Cat.class);

        System.out.println("First pair equal: " + (bean == secondBean));
        System.out.println("Second pair equal: " + (firstCat == secondCat));
    }
}