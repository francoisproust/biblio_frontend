package bibliotheque.controlleur;

import bibliotheque.modele.TypeUser;
import bibliotheque.modele.Usager;
import bibliotheque.proxies.BibliothequeProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsagerController {

    private final BibliothequeProxy bibliothequeProxy;

    @Autowired
    public UsagerController(BibliothequeProxy bibliothequeProxy){
        this.bibliothequeProxy = bibliothequeProxy;
    }

    @GetMapping(value = "/creation-compte")
    public ModelAndView creationCompte(Model model) {
        List<TypeUser> typeUser = bibliothequeProxy.getListeTypeUsager();
        model.addAttribute("typeUser",typeUser);
        model.addAttribute("usager", new Usager());
        return new ModelAndView("creation-compte");
    }

    @PostMapping(value = "/creation-compte")
    public ModelAndView creationComptePost(Model model, @ModelAttribute("usager") Usager usager) {

        return new ModelAndView("home" );
    }
}
