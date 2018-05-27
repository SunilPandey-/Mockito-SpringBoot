package mockitoapi;

import org.springframework.stereotype.Service;

@Service
public class NameService {
    public String getUserName(String id) {
    	System.out.println("inside main name service");
        return "Real user name";
    }
}