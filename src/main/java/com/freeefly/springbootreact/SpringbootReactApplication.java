package com.freeefly.springbootreact;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.core.Ordered;
import org.springframework.web.method.support.HandlerMethodArgumentResolverComposite;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.AbstractHandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class SpringbootReactApplication implements WebMvcConfigurer {
    private final ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootReactApplication.class, args);
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/public/js/**").addResourceLocations("classpath:/templates/public/js/");
//        registry.addResourceHandler("/public/css/**").addResourceLocations("classpath:/templates/public/css");
        registry.addResourceHandler("/**/*.js").addResourceLocations("classpath:/templates/");
        registry.addResourceHandler("/**/*.css").addResourceLocations("classpath:/templates/");
        registry.addResourceHandler("/**/*.ico").addResourceLocations("classpath:/templates/");
        registry.addResourceHandler("/**/*.png").addResourceLocations("classpath:/templates/");
        registry.addResourceHandler("/**/*.txt").addResourceLocations("classpath:/templates/");
        registry.addResourceHandler("/**/*.json").addResourceLocations("classpath:/templates/");
    }

    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        RequestMappingHandlerMapping handler = new RequestMappingHandlerMapping();
        handler.setOrder(1);
        return handler;
    }

    //    @Bean
//    @Description("Thymeleaf Template Resolver")
//    public SpringResourceTemplateResolver  templateResolver() {
//        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setApplicationContext(applicationContext);
//        templateResolver.setPrefix("classpath:/templates/");
//
//        return templateResolver;
//    }
//
//    @Bean
//    @Description("Thymeleaf Template Engine")
//    public SpringTemplateEngine templateEngine() {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        return templateEngine;
//    }
//    @Bean
//    @Description("Thymeleaf View Resolver")
//    public ThymeleafViewResolver viewResolver() {
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setViewNames(new String[] {".html", ".xhtml"});
//        return viewResolver;
//    }
}
