package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.OttolaringologsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class OttolaringologsViewController {
    @Autowired
    private IEntityService ottolaringologsService;

    @GetMapping("/ottolaringologsList")
    public String getAllOttolaringologs (Model model) {
        model.addAttribute("ottolaringologsList", ottolaringologsService.getAll());
        model.addAttribute("ottolaringologsEntity", new OttolaringologsEntity());
        return "ottolaringologsList.html";
    }

    @RequestMapping(value = "/ottolaringologsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteOttolaringologs (
            ModelAndView modelAndView,
            @Valid OttolaringologsEntity ottolaringologsEntity,
            BindingResult result) {
        ottolaringologsService.delete(ottolaringologsEntity.getId());
        modelAndView.setViewName("redirect:/ottolaringologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/ottolaringologsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addOttolaringologs (
            ModelAndView modelAndView,
            @Valid OttolaringologsEntity ottolaringologsEntity,
            BindingResult result) {
        ottolaringologsService.save(ottolaringologsEntity);
        modelAndView.setViewName("redirect:/ottolaringologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/ottolaringologsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateOttolaringologs (
            ModelAndView modelAndView,
            @Valid OttolaringologsEntity ottolaringologsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            ottolaringologsService.delete(ottolaringologsEntity.getId());
            ottolaringologsService.save(ottolaringologsEntity);
            modelAndView.getModel().put("ottolaringologs", ottolaringologsEntity);
            modelAndView.setViewName("redirect:/ottolaringologsList");
        }
        return modelAndView;
    }

}

