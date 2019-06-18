package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.NevropatologsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class NevropatologsViewController {
    @Autowired
    private IEntityService nevropatologsService;

    @GetMapping("/nevropatologsList")
    public String getAllNevropatologs (Model model) {
        model.addAttribute("nevropatologsList", nevropatologsService.getAll());
        model.addAttribute("nevropatologsEntity", new NevropatologsEntity());
        return "nevropatologsList.html";
    }

    @RequestMapping(value = "/nevropatologsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteNevropatologs (
            ModelAndView modelAndView,
            @Valid NevropatologsEntity nevropatologsEntity,
            BindingResult result) {
        nevropatologsService.delete(nevropatologsEntity.getId());
        modelAndView.setViewName("redirect:/nevropatologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/nevropatologsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addNevropatologs (
            ModelAndView modelAndView,
            @Valid NevropatologsEntity nevropatologsEntity,
            BindingResult result) {
        nevropatologsService.save(nevropatologsEntity);
        modelAndView.setViewName("redirect:/nevropatologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/nevropatologsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateNevropatologs (
            ModelAndView modelAndView,
            @Valid NevropatologsEntity nevropatologsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            nevropatologsService.delete(nevropatologsEntity.getId());
            nevropatologsService.save(nevropatologsEntity);
            modelAndView.getModel().put("nevropatologs", nevropatologsEntity);
            modelAndView.setViewName("redirect:/nevropatologsList");
        }
        return modelAndView;
    }

}

