package rakutenmafia.manamiappapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PageController {
    @Autowired
    ItemRepository itemRepository;

    @GetMapping
    public String home(){
        return "(@.@)b";
    }

    @GetMapping("/item/all")
    public List<Item> getAllItems(){
        return itemRepository.findAll();
    }
}
