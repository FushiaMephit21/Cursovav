package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.DogtorsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class DogtorsViewController {
    @Autowired
    private IEntityService dogtorsService;

    @GetMapping("/dogtorsList")
    public String getAllDogtors (Model model) {
        model.addAttribute("dogtorsList", dogtorsService.getAll());
        model.addAttribute("dogtorsEntity", new DogtorsEntity());
        return "dogtorsList.html";
    }

    @RequestMapping(value = "/dogtorsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteDogtors (
            ModelAndView modelAndView,
            @Valid DogtorsEntity dogtorsEntity,
            BindingResult result) {
        dogtorsService.delete(dogtorsEntity.getId());
        modelAndView.setViewName("redirect:/dogtorsList");
        return modelAndView;
    }
    @RequestMapping(value = "/dogtorsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addDogtors (
            ModelAndView modelAndView,
            @Valid DogtorsEntity dogtorsEntity,
            BindingResult result) {
        dogtorsService.save(dogtorsEntity);
        modelAndView.setViewName("redirect:/dogtorsList");
        return modelAndView;
    }
    @RequestMapping(value = "/dogtorsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateDogtors (
            ModelAndView modelAndView,
            @Valid DogtorsEntity dogtorsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            dogtorsService.delete(dogtorsEntity.getId());
            dogtorsService.save(dogtorsEntity);
            modelAndView.getModel().put("dogtors", dogtorsEntity);
            modelAndView.setViewName("redirect:/dogtorsList");
        }
        return modelAndView;
    }

}

