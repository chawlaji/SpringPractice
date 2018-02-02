package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.basics5.xml.XmlPersonDAO;

public class XMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(XMLContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());
			// [xmlJdbcConnection, xmlPersonDAO]

			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
			LOGGER.info("{look here}");
		}
	}
}