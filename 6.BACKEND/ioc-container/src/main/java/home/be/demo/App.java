package home.be.demo;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import home.be.bean.Item;
import home.be.service.ItemService;

public class App {
	public static void main(String[] args) {
		// IoC container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		// print beans in context container
		// String[] beanNames = context.getBeanDefinitionNames();
		
		// Arrays.stream(beanNames).forEach(System.out::println);
		
		Item itemA = context.getBean("itemA", Item.class);
		System.out.println(itemA);
		
		System.out.println("======================");
		
		ItemService service = context.getBean("itemService", ItemService.class);
		System.out.println(service.getItems());
	}
}
