package learningAOP.learningAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learningAOP.learningAOP.bean.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//XMLをロード
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("IoCbeans.xml");
    	//BeanのIDを使ってインスタンスを取得
    	//Book book = (Book) applicationContext.getBean("book");
    	//System.out.println(book);
    	//Beanのクラスを使って、インスタンスを取得
    	//Book book１ = applicationContext.getBean(Book.class);
    	//System.out.println(book１);   
    	//Constructor
    	Book bookcon=  (Book)applicationContext.getBean("book");
    	System.out.println(bookcon);
    	}
}
