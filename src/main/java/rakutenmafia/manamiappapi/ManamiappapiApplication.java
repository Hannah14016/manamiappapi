package rakutenmafia.manamiappapi;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ManamiappapiApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ManamiappapiApplication.class, args);
    }
    //        ItemRepository itemRepository = applicationContext.getBean(ItemRepository.class);
//        Item item = new Item();
//
//        item.setId(1);
//        item.setName("apple");
//        itemRepository.save(item);
//
//        item.setId(2);
//        item.setName("banana");
//        itemRepository.save(item);
//
//        item.setId(3);
//        item.setName("grape");
//        itemRepository.save(item);
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ManamiappapiApplication.class);
    }
}
