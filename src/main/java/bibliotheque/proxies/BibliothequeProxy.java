package bibliotheque.proxies;

import bibliotheque.modele.Ouvrage;
import bibliotheque.modele.ResultatExemplaire;
import bibliotheque.modele.TypeUser;
import bibliotheque.modele.Usager;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "bibliocapi", url = "localhost:9090")
public interface BibliothequeProxy {
    @GetMapping("/rechercher-ouvrage")
    List<ResultatExemplaire> getResultatExemplaire(Ouvrage ouvrage);

    @GetMapping("/type-usager")
    List<TypeUser> getListeTypeUsager();

    @PostMapping("/creation-compte")
    void creationCompte(Usager usager);
}
