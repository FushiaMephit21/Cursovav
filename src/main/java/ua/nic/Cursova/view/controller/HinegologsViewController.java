package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.HinegologsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class HinegologsViewController {
    @Autowired
    private IEntityService hinegologsService;

    @GetMapping("/hinegologsList")
    public String getAllHinegologs (Model model) {
        model.addAttribute("hinegologsList", hinegologsService.getAll());
        model.addAttribute("hinegologsEntity", new HinegologsEntity());
        return "hinegologsList.html";
    }

    @RequestMapping(value = "/hinegologsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteHinegologs (
            ModelAndView modelAndView,
            @Valid HinegologsEntity hinegologsEntity,
            BindingResult result) {
        hinegologsService.delete(hinegologsEntity.getId());
        modelAndView.setViewName("redirect:/hinegologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/hinegologsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addHinegologs (
            ModelAndView modelAndView,
            @Valid HinegologsEntity hinegologsEntity,
            BindingResult result) {
        hinegologsService.save(hinegologsEntity);
        modelAndView.setViewName("redirect:/hinegologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/hinegologsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateHinegologs (
            ModelAndView modelAndView,
            @Valid HinegologsEntity hinegologsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            hinegologsService.delete(hinegologsEntity.getId());
            hinegologsService.save(hinegologsEntity);
            modelAndView.getModel().put("hinegologs", hinegologsEntity);
            modelAndView.setViewName("redirect:/hinegologsList");
        }
        return modelAndView;
    }

}

