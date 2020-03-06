package org.tml.esb;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@Configuration
public class SwaggerUIConfig {
    @Value("${swagger.host}")
    private String swaggerHost;
    // Redirect to access swagger UI via short URL from "/swagger-ui" to "/swagger-ui/index.html?url=/api/swagger&validatorUrl="
    @Controller
    class SwaggerWelcome {
        @RequestMapping("/swagger-ui")
        public String redirectToUi() {
            return "redirect:https://"+swaggerHost+"/tml/index.html?url=/api/docs&validatorUrl=";
        }
    }
}
