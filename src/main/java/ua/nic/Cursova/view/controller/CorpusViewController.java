package ua.nic.Cursova.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.nic.Cursova.model.CorpusEntity;
import ua.nic.Cursova.service.IEntityService;

import javax.validation.Valid;

@Controller
public class CorpusViewController {
    @Autowired
    private IEntityService corpusService;

    @GetMapping("/corpusList")
    public String getAllCorpus (Model model) {
        model.addAttribute("corpusList", corpusService.getAll());
        model.addAttribute("corpusEntity", new CorpusEntity());
        return "corpusList.html";
    }

    @RequestMapping(value = "/corpusList", method = RequestMethod.POST, params = "action=delete")
    ModelAndView deleteCorpus (
            ModelAndView modelAndView,
            @Valid CorpusEntity corpusEntity,
            BindingResult result) {
        corpusService.delete(corpusEntity.getId());
        modelAndView.setViewName("redirect:/corpusList");
        return modelAndView;
    }
    @RequestMapping(value = "/corpusList", method = RequestMethod.POST, params = "action=add")
    ModelAndView addCorpus (
            ModelAndView modelAndView,
            @Valid CorpusEntity corpusEntity,
            BindingResult result) {
        corpusService.save(corpusEntity);
        modelAndView.setViewName("redirect:/corpusList");
        return modelAndView;
    }
    @RequestMapping(value = "/corpusList", method = RequestMethod.POST, params = "action=save")
    ModelAndView updateCorpus (
            ModelAndView modelAndView,
            @Valid CorpusEntity corpusEntity,
            BindingResult result) {

        if (!result.hasErrors()) {
            corpusService.delete(corpusEntity.getId());
            corpusService.save(corpusEntity);
            modelAndView.getModel().put("corpus", corpusEntity);
            modelAndView.setViewName("redirect:/corpusList");
        }
        return modelAndView;
    }

}

