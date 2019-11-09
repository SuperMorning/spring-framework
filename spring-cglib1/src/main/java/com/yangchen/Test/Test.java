package com.yangchen.Test;

import com.yangchen.app.Config;
import com.yangchen.service.CityService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName
 * @Author
 * @Date
 **/
public class Test {public static void main(String[] args) {

	//把类扫描出来
	//把bean实例化
	AnnotationConfigApplicationContext annotationConfigApplicationContext =
			new AnnotationConfigApplicationContext(Config.class);
	System.out.println(annotationConfigApplicationContext.getBean(CityService.class));

}

}
