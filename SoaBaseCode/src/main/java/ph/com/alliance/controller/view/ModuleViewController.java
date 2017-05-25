package ph.com.alliance.controller.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ph.com.alliance.entity.Person;
import ph.com.alliance.entity.TrainingFacilitator;
import ph.com.alliance.entity.TrainingParticipant;
import ph.com.alliance.service.LogInService;
import ph.com.alliance.service.PersonService;
import ph.com.alliance.service.TrainingFacilitatorService;
import ph.com.alliance.service.TrainingParticipantService;

/**
 * Example controller class that hadles static view requests.
 * All requests that returns pages (html, xhtml, jsp, jspx, etc.) is handled here. 
 *
 */
@Controller
@RequestMapping("/modulename")
public class ModuleViewController {
	
	@Autowired
	private PersonService personService;
	@Autowired
	private TrainingFacilitatorService FacilitatorService;
	@Autowired
	private TrainingParticipantService ParticipantService;
	@Autowired
	private LogInService logInService;
	
    /*@RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String viewProfile(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/profile MODULE VIEW CONTROLLER CALLED.");
        return "profile";
    }
    
  
    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public String viewMessages(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/messages MODULE VIEW CONTROLLER CALLED.");
        return "messages";
    }
    
   
    @RequestMapping(value = "/userform", method = RequestMethod.GET)
    public String viewUserForm(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/userform MODULE VIEW CONTROLLER CALLED.");
        return "userform";
    }
    
    @RequestMapping(value="/teststring")
	public String getStringList(ModelMap map) {
		map.put("myString","HELLO #1");
		map.addAttribute("myString", "HELLO #2");
		map.put("myList", personService.getList());
		return "test/stringpage";
	}
	
	@RequestMapping(value="/mylist")
	public String getMyList(ModelMap map) {
		List<Person> myList = personService.getPersons();
		map.put("personList",myList);
		return "personEntity/mylist";
	}
	
	@RequestMapping(value="/mylist/searched")
	public String getSearchedList(ModelMap map) {
		return "personEntity/mylist";
	}
	
	@RequestMapping(value="/person/insert")
	public String insertPerson(Person person, ModelMap map) {
		try{
		personService.insertPerson(person);
			return this.getMyList(map);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "insert";
	}
	@RequestMapping(value="/person/update")
	public String updatePerson(Person person, ModelMap map) {
		personService.updatePerson(person);
		return this.getMyList(map);
	}
	/*@RequestMapping(value = "/search", method = RequestMethod.GET)
    public String search(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
    	System.out.println("@/modulename/search MODULE VIEW CONTROLLER CALLED.");
    	String code = request.getParameter("sel");
    	
        return "messages";
    }
	@RequestMapping(value="/person/search", method = RequestMethod.GET)
	public String searchPerson(HttpServletRequest request, Person person, ModelMap map) {
		String coder= request.getParameter("sel");
		String searchinput=request.getParameter("toSearch");
		List<Person> list = personService.searchPerson(coder, searchinput);
		map.put("personList", list);
		return this.getSearchedList(map);
	}*/
	
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String logIn(HttpServletRequest request, ModelMap map){
		System.out.println("Entered");
		String uname=request.getParameter("username");
		String pword=request.getParameter("password");
		boolean exists=logInService.checkLogIn(uname, pword);
		if(!exists){
		return "Interface2";
		}
		else
		return "Users";
	}
	
	@RequestMapping(value="/mylist")
	public String getMyList(ModelMap map) {
		List<TrainingFacilitator> myList = FacilitatorService.getFaci();
		map.put("personList",myList);
		return "test";
	}
	
	@RequestMapping(value="/addFacilitator")
	public String addFaci(TrainingFacilitator facilitator, ModelMap map) {
		try{
			FacilitatorService.addFacilitator(facilitator);
			return this.getMyList(map);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "test";
	}
	@RequestMapping(value="/editFacilitator")
	public String editFaci(TrainingFacilitator facilitator, ModelMap map) {
		try{
			FacilitatorService.updatePerson(facilitator);
			return this.getMyList(map);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "test";
	}
	
	
	
	@RequestMapping(value="/addParticipant")
	public String addParticipant(TrainingParticipant participant, ModelMap map) {
		try{
			ParticipantService.addParticipant(participant);
			return this.getMyList(map);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "test";
	}
	@RequestMapping(value="/editParticipant")
	public String editParticipant(TrainingParticipant participant, ModelMap map) {
		try{
			ParticipantService.editParticipant(participant);
			return this.getMyList(map);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "test";
	}
	
}