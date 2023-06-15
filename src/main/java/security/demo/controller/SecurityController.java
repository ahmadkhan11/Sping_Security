package security.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {


  @GetMapping("/show-all")
  public ResponseEntity<String> showAll(){

    String response = "Wellcome";

    return ResponseEntity.ok(response);
  }

  @GetMapping("/show")
  public String home(){
    return ("Welcome");
  }

}
