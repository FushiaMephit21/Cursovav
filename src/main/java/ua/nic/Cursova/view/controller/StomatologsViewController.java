package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.StomatologsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class StomatologsViewController {
    @Autowired
    private IEntityService stomatologsService;

    @GetMapping("/stomatologsList")
    public String getAllStomatologs (Model model) {
        model.addAttribute("stomatologsList", stomatologsService.getAll());
        model.addAttribute("stomatologsEntity", new StomatologsEntity());
        return "stomatologsList.html";
    }

    @RequestMapping(value = "/stomatologsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteStomatologs (
            ModelAndView modelAndView,
            @Valid StomatologsEntity stomatologsEntity,
            BindingResult result) {
        stomatologsService.delete(stomatologsEntity.getId());
        modelAndView.setViewName("redirect:/stomatologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/stomatologsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addStomatologs (
            ModelAndView modelAndView,
            @Valid StomatologsEntity stomatologsEntity,
            BindingResult result) {
        stomatologsService.save(stomatologsEntity);
        modelAndView.setViewName("redirect:/stomatologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/stomatologsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateStomatologs (
            ModelAndView modelAndView,
            @Valid StomatologsEntity stomatologsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            stomatologsService.delete(stomatologsEntity.getId());
            stomatologsService.save(stomatologsEntity);
            modelAndView.getModel().put("stomatologs", stomatologsEntity);
            modelAndView.setViewName("redirect:/stomatologsList");
        }
        return modelAndView;
    }

}

