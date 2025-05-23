package ru.planetnails.partnerslk.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.planetnails.partnerslk.model.item.dto.ItemAddDto;
import ru.planetnails.partnerslk.model.item.dto.ItemDtoOut;
import ru.planetnails.partnerslk.service.ItemService;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@Slf4j
@RequestMapping (value = "/api/v1/items")
public class ItemRestControllerV1 {
private ItemService itemService ;

    @PostMapping()
    @PutMapping
    public String add(@RequestBody List<ItemAddDto> items){
         itemService.add(items);
        return "Your data has been queued. ";
    }

    @GetMapping(produces =  "application/json;charset=UTF-8")
    public List<ItemDtoOut> getAll(){
       return itemService.getAll();
    }
}
