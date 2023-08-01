package hu.team;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Program {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		One szoveges=(One)factory.getBean("szovegbean");
		szoveges.displayInfo();
		
		System.out.println();
		
		Two szamos=(Two)factory.getBean("szambean");
		szamos.displayInfo();
	}

}
