package ar.edu.unlp.info.oo1.ejercicio24;

import java.util.List;

public interface PersistableUser {

	public String getUsername();

	public String getEmail();

	public List<Post> getPosts();

}
