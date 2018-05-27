package mockitoapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private NameService nameService;

    @Autowired
    public UserService(NameService nameService) {
    	System.out.println("inside main user service");
        this.nameService = nameService;
    }

    public String getUserName(String id) {
    	System.out.println("inside main get user service");
        return nameService.getUserName(id);
    }
}