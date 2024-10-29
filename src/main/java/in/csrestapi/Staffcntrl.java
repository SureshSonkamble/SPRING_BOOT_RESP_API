package in.csrestapi;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Staffcntrl {
    @Autowired
	private Staffrepo repo;
    @GetMapping("/staff")
    public List<Staff> getstaff() {
    	List<Staff> list=repo.findAll();
    	return list;
    }  
   
    @GetMapping("/allstf")
	public List<String> getAllName() {
		 return repo.getStfName();
	}
    
    @PostMapping("/savestaff")
	public Staff savestud(@RequestBody Staff s) {
	  return  repo.save(s);
	}
    
    @PostMapping("/savestf")
	public Object savestf(@RequestBody Staff s) {
	    repo.save(s);
	  Map<String, Object> response = new HashMap<>();
		response.put("status", 200);
		response.put("message", "Record Saved sucessfully...!!!");
		return response;
	}
    @PutMapping("/updatestaff")
	public Staff upadtestaff(@RequestBody Staff s) {
	  return  repo.save(s);
	  
	}
    @PutMapping("/updatestf")
	public Object upadtestf(@RequestBody Staff s) {
	    repo.save(s);
	    Map<String, Object> response = new HashMap<>();
		response.put("status", 200);
		response.put("message", "Record Update  sucessfully...!!!");
		return response;
	  
	}
    @DeleteMapping("/delstff/{id}")
    public String delstud(@PathVariable int id) {
    	repo.deleteById(id);
    	return "delete succees";
    }  
    
    @DeleteMapping("/delstf/{id}")
    public Object delstf(@PathVariable int id) {
    	repo.deleteById(id);
    	 Map<String, Object> response = new HashMap<>();
 		response.put("status", 200);
 		response.put("message", "Record Delete  sucessfully...!!!");
 		return response;	
    }  
    
    
}
