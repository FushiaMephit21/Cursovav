package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.StaffsEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class StaffsViewController {
    @Autowired
    private IEntityService staffsService;

    @GetMapping("/staffsList")
    public String getAllStaffs (Model model) {
        model.addAttribute("staffsList", staffsService.getAll());
        model.addAttribute("staffsEntity", new StaffsEntity());
        return "staffsList.html";
    }

    @RequestMapping(value = "/staffsList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteStaffs (
            ModelAndView modelAndView,
            @Valid StaffsEntity staffsEntity,
            BindingResult result) {
        staffsService.delete(staffsEntity.getId());
        modelAndView.setViewName("redirect:/staffsList");
        return modelAndView;
    }
    @RequestMapping(value = "/staffsList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addStaffs (
            ModelAndView modelAndView,
            @Valid StaffsEntity staffsEntity,
            BindingResult result) {
        staffsService.save(staffsEntity);
        modelAndView.setViewName("redirect:/staffsList");
        return modelAndView;
    }
    @RequestMapping(value = "/staffsList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateStaffs (
            ModelAndView modelAndView,
            @Valid StaffsEntity staffsEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            staffsService.delete(staffsEntity.getId());
            staffsService.save(staffsEntity);
            modelAndView.getModel().put("staffs", staffsEntity);
            modelAndView.setViewName("redirect:/staffsList");
        }
        return modelAndView;
    }

}

