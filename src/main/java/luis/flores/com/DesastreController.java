package luis.flores.com;


	import java.util.ArrayList;
	import javax.servlet.http.HttpServletRequest;

	import org.springframework.stereotype.Controller;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.support.SessionStatus;
	import org.springframework.web.servlet.ModelAndView;



import database.dbConnection;
import entities.Desastre;
import services.DesastreService;

	@RequestMapping("desastre")
	@Controller
	public class DesastreController {
	private final String viewsUrl = "desastre/";
//		private CursoValidator cursoValidator;
	private DesastreService serviceDesastre;
				
		
		
		
		
		
		public DesastreController() {
			serviceDesastre = new DesastreService(dbConnection.getDS());
			
		}
		
		@RequestMapping("")
		public ModelAndView index(HttpServletRequest req) {
			ModelAndView mav = new ModelAndView();
//			mav.setViewName(viewsUrl + "index");		
//			mav.addObject("mantenimientos", serviceMantenimiento.getList());		
//			return mav;	
			mav.setViewName(viewsUrl + "index");
					
			String searchCriteria = req.getParameter("distrito");
			mav.addObject("desastres", serviceDesastre.getList(searchCriteria));	
			mav.addObject("searchCriteria", searchCriteria);
			return mav;
		}	
		
		@RequestMapping(value="/agregar", method=RequestMethod.GET)
		public ModelAndView agregar(){
			ModelAndView mav = new ModelAndView();
			mav.setViewName(viewsUrl + "agregar");
			mav.addObject("desastre", new Desastre());
			return mav;
		}
		
		@RequestMapping(value="/agregar", method=RequestMethod.POST)
		public ModelAndView agregar
			(
					@ModelAttribute ("desastre") Desastre desastre,
					BindingResult result,
					SessionStatus status
			)
		{
			
			if(result.hasErrors()) {
				ModelAndView mav = new ModelAndView();
				mav.setViewName(viewsUrl + "agregar");
				mav.addObject("desastre", desastre);
				return mav;		
			}else {
				serviceDesastre.add(desastre);
				return new ModelAndView("redirect:/desastre");
			}
		}
		
		@RequestMapping(value="/editar", method=RequestMethod.GET)
		public ModelAndView editar(HttpServletRequest request){
			ModelAndView mav = new ModelAndView();
			mav.setViewName(viewsUrl + "editar");
			
			int id = Integer.parseInt(request.getParameter("id"));
			mav.addObject("desastre", serviceDesastre.getById(id));
			return mav;
		}
		
		@RequestMapping(value="/editar", method=RequestMethod.POST)
		public ModelAndView editar
		(
			@ModelAttribute ("desastre") Desastre desastre,
			BindingResult result,
			SessionStatus status
		)
		{
			if(result.hasErrors()) {
				ModelAndView mav = new ModelAndView();
				mav.setViewName(viewsUrl + "agregar");
				mav.addObject("desastre", desastre);
				return mav;		
			}else {
				serviceDesastre.update(desastre);
				return new ModelAndView("redirect:/desastre");
			}
		}
		
		@RequestMapping(value="/eliminar", method=RequestMethod.GET)
		public ModelAndView eliminar(HttpServletRequest request)
		{
			int id = Integer.parseInt(request.getParameter("id"));
			serviceDesastre.delete(id);
			return new ModelAndView("redirect:/desastre");
		}
	}
