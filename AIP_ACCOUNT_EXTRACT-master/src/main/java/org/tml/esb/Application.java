package org.tml.esb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})

public class Application {
	@Value("${swagger.host}")
	private String swaggerHost;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
   
   
    @Controller
    class SwaggerWelcome {
        @RequestMapping(
            "/swagger-ui"
        )
        public String redirectToUi() {
            return "redirect:https://"+swaggerHost+"/tml/index.html?url=/api/docs&validatorUrl=";

        }
    }


}
