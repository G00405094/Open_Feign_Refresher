package ie.atu.open_feign_refresher;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationRegister {
    @PostMapping("/confirm")
    public String confirmDetails(@RequestBody Product product){
        String confirmationMessage = String.format("Recieved details, id: %s , name: %s , price: %s",
                product.getId(), product.getName(), product.getPrice());
        return confirmationMessage;
    }
}
