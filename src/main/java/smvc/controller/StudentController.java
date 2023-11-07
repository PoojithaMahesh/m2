package smvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import smvc.dao.StudentDao;
import smvc.dto.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDao studentDao;

	@RequestMapping("/register")
	public ModelAndView registerStudent() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("student", new Student());
		modelAndView.setViewName("register.jsp");
		return modelAndView;
	}
	@RequestMapping("/save")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView modelAndView=new ModelAndView();
		studentDao.saveStudent(student);
		
		modelAndView.setViewName("display.jsp");
		
		return modelAndView;
	}
}
