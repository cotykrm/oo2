package ar.edu.unlp.info.oo1.ejercicio24;

import java.io.FileReader;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class UserRepository {
    // Necesitamos tener el PostRepository para poder inyectárselo al Proxy
    private PostRepository postRepository;

    public UserRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @SuppressWarnings("unchecked")
    public PersistableUser findUserByUsername(String aUsername) {
        JSONParser parser = new JSONParser();
        try {
            List<JSONObject> usersData = (List<JSONObject>) parser.parse(new FileReader("users.json"));
            return usersData.stream()
                .filter(userData -> userData.get("username").equals(aUsername))
                .findFirst()
                // ¡AQUÍ OCURRE EL CAMBIO! Retornamos el Proxy en lugar del User real
                .map(userData -> new UserProxy(
                    (String) userData.get("username"), 
                    (String) userData.get("email"), 
                    this.postRepository
                ))
                .orElse(null);
        } catch (Exception e) {
            return null;
        }
    }
}