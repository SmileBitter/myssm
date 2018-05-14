package cn.mldn.controller;

import cn.mldn.service.IMessageService;
import cn.mldn.vo.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Dony
 * Date: 2018/5/11
 * Time: 20:01
 * Description:
 */
@Controller
@Repository
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private IMessageService messageService;

    @RequestMapping("/add")
    public ModelAndView add(Message vo) {
        try {
            messageService.insert(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @InitBinder
    public void initBindler(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
}
