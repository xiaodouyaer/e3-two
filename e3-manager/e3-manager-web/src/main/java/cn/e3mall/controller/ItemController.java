package cn.e3mall.controller;

import cn.e3mall.interfaces.ItemService;
import cn.e3mall.pojo.TbItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by liuchaoya on 2018/8/1.
 * For lukekeji bulu
 */
@Controller
public class ItemController {
    @Resource
    private ItemService itemService;

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private String getItemById(@PathVariable Long itemId) {
        TbItem tbItem = itemService.getItemById(itemId);
        return tbItem.toString();
    }
}
