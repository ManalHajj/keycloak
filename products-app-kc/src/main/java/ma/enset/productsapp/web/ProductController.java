package ma.enset.productsapp.web;

import lombok.Data;
import ma.enset.productsapp.repositories.ProductRepository;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import org.springframework.hateoas.PagedModel;

@Controller
public class ProductController{
    @Autowired
    private KeycloakRestTemplate keycloakRestTemplate;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/products")
    public String products(Model model){
        model.addAttribute("products",productRepository.findAll());
        return "products";
    }
    // faire communiquer les micro-services
    @GetMapping("/suppliers")
    public String suppliers(Model model){
        PagedModel<Supplier> pageSuppliers = keycloakRestTemplate.getForObject("http://localhost:8083/suppliers", PagedModel.class); // stock les données json dans pagesuppliers
        model.addAttribute("suppliers",pageSuppliers);
        return "suppliers";
    }

@GetMapping("/jwt")
@ResponseBody   // since the controller is not a rest controller / return en format json
    public Map<String,String> map (HttpServletRequest request){
        KeycloakAuthenticationToken token= (KeycloakAuthenticationToken)  request.getUserPrincipal(); // l'utilisateur authentifié
        KeycloakPrincipal principal = (KeycloakPrincipal) token.getPrincipal();
        KeycloakSecurityContext keycloakSecurityContext = principal.getKeycloakSecurityContext(); // là ou il stocke les info sur l'utilisateur authentifié
        // consulter le jwt
        Map<String,String> map=new HashMap<>();
         map.put("access_token",keycloakSecurityContext.getIdTokenString());
         return map;
    }
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e,Model model){
        model.addAttribute("errorMessage","e.getMessage()");
        return "errors";
    }
}

@Data
class Supplier {
    private Long id;
    private String name;
    private String email;
}