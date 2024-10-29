package in.csrestapi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Staffrepo extends JpaRepository<Staff, Integer> {
	@Query(value = "select name,mob,sub from staff where id=2", nativeQuery = true) 
	  public abstract List<String> getStfName();

}
