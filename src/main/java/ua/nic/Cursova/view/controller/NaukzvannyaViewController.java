package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.NaukzvannyaEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class NaukzvannyaViewController {
    @Autowired
    private IEntityService naukzvannyaService;

    @GetMapping("/naukzvannyaList")
    public String getAllNaukzvannya (Model model) {
        model.addAttribute("naukzvannyaList", naukzvannyaService.getAll());
        model.addAttribute("naukzvannyaEntity", new NaukzvannyaEntity());
        return "naukzvannyaList.html";
    }

    @RequestMapping(value = "/naukzvannyaList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteNaukzvannya (
            ModelAndView modelAndView,
            @Valid NaukzvannyaEntity naukzvannyaEntity,
            BindingResult result) {
        naukzvannyaService.delete(naukzvannyaEntity.getId());
        modelAndView.setViewName("redirect:/naukzvannyaList");
        return modelAndView;
    }
    @RequestMapping(value = "/naukzvannyaList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addNaukzvannya (
            ModelAndView modelAndView,
            @Valid NaukzvannyaEntity naukzvannyaEntity,
            BindingResult result) {
        naukzvannyaService.save(naukzvannyaEntity);
        modelAndView.setViewName("redirect:/naukzvannyaList");
        return modelAndView;
    }
    @RequestMapping(value = "/naukzvannyaList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateNaukzvannya (
            ModelAndView modelAndView,
            @Valid NaukzvannyaEntity naukzvannyaEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            naukzvannyaService.delete(naukzvannyaEntity.getId());
            naukzvannyaService.save(naukzvannyaEntity);
            modelAndView.getModel().put("naukzvannya", naukzvannyaEntity);
            modelAndView.setViewName("redirect:/naukzvannyaList");
        }
        return modelAndView;
    }

}

