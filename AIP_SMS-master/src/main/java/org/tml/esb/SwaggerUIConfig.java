package org.tml.esb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class SwaggerUIConfig {
    @Value("${swagger.host}")
    private String swaggerHost;
    // Redirect to access swagger UI via short URL from "/swagger-ui" to "/swagger-ui/index.html?url=/api/swagger&validatorUrl="
    @Controller
    class SwaggerWelcome {
        @RequestMapping("/swagger-ui")
        public String redirectToUi() {
            String swaggerPath="https://"+swaggerHost+"/swagger/index.html?url=/api/sms/docs&validatorUrl=";
            return "redirect:"+swaggerPath;
        }
    }
}
/*@Configuration
public class SwaggerUIConfig {
    // Redirect to access swagger UI via short URL from "/swagger-ui" to "/swagger-ui/index.html?url=/api/sms&validatorUrl="
    @Controller
    class SwaggerWelcome {
        @RequestMapping("/swagger-ui")
        public String redirectToUi() {
            return "redirect:/swagger/index.html?url=/api/sms/docs&validatorUrl=";
        }
    }
}*/
