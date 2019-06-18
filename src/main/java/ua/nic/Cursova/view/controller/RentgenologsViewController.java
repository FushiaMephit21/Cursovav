package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.RentgenologsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class RentgenologsViewController {
    @Autowired
    private IEntityService rentgenologsService;

    @GetMapping("/rentgenologsList")
    public String getAllRentgenologs (Model model) {
        model.addAttribute("rentgenologsList", rentgenologsService.getAll());
        model.addAttribute("rentgenologsEntity", new RentgenologsEntity());
        return "rentgenologsList.html";
    }

    @RequestMapping(value = "/rentgenologsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteRentgenologs (
            ModelAndView modelAndView,
            @Valid RentgenologsEntity rentgenologsEntity,
            BindingResult result) {
        rentgenologsService.delete(rentgenologsEntity.getId());
        modelAndView.setViewName("redirect:/rentgenologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/rentgenologsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addRentgenologs (
            ModelAndView modelAndView,
            @Valid RentgenologsEntity rentgenologsEntity,
            BindingResult result) {
        rentgenologsService.save(rentgenologsEntity);
        modelAndView.setViewName("redirect:/rentgenologsList");
        return modelAndView;
    }
    @RequestMapping(value = "/rentgenologsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateRentgenologs (
            ModelAndView modelAndView,
            @Valid RentgenologsEntity rentgenologsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            rentgenologsService.delete(rentgenologsEntity.getId());
            rentgenologsService.save(rentgenologsEntity);
            modelAndView.getModel().put("rentgenologs", rentgenologsEntity);
            modelAndView.setViewName("redirect:/rentgenologsList");
        }
        return modelAndView;
    }

}

