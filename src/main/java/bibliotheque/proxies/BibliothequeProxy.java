package bibliotheque.proxies;

import bibliotheque.modele.Ouvrage;
import bibliotheque.modele.ResultatExemplaire;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "bibliocapi", url = "localhost:9090")
public interface BibliothequeProxy {
    @GetMapping("/rechercher-ouvrage")
    List<ResultatExemplaire> getResultatExemplaire(Ouvrage ouvrage);

}
