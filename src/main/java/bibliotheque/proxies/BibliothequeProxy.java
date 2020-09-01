package bibliotheque.proxies;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "bibliocapi", url = "localhost:9090")
public interface BibliothequeProxy {
}
