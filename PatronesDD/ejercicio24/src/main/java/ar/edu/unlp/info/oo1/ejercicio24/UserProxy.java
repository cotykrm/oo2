package ar.edu.unlp.info.oo1.ejercicio24;

import java.util.List;

public class UserProxy implements PersistableUser {

    private String username;
    private String email;
    private PostRepository postRepository; // Para el Lazy Loading
    private User realUser; // El "Subject" real que se creará bajo demanda

    public UserProxy(String username, String email, PostRepository postRepository) {
        this.username = username;
        this.email = email;
        this.postRepository = postRepository;
        this.realUser = null; // Al principio no existe el objeto real
    }

    @Override
    public String getUsername() {
        // Si el usuario real ya fue creado, le delegamos la respuesta
        if (this.realUser != null) {
            return this.realUser.getUsername();
        }
        // Si no, respondemos rápido con el atributo local sin ir al repositorio
        return this.username;
    }

    @Override
    public String getEmail() {
        if (this.realUser != null) {
            return this.realUser.getEmail();
        }
        return this.email;
    }

    @Override
    public List<Post> getPosts() {
        // En el momento que piden los posts, si no se cargaron, ocurre la magia:
        if (this.realUser == null) {
            // 1. Buscamos los posts pesados en el almacenamiento secundario
            List<Post> postsReales = this.postRepository.findPostsByUsername(this.username);
            
            // 2. Instanciamos por primera vez al User de negocio real con TODOS sus datos
            this.realUser = new User(this.username, this.email);
			this.realUser.addPosts(postsReales);
        }
        
        // 3. Le delegamos la devolución de la lista al objeto real
        return this.realUser.getPosts();
    }

    


}
