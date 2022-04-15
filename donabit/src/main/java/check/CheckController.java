package check;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import donabit.challenge.ChallengeDTO;

@Controller
public class CheckController {
	@Autowired
	@Qualifier("checkservice")
	CheckService service;
	
	//뷰의 요청경로 지정
	@RequestMapping("/checkmorning")
	public void checkmorning() {}
		
	@GetMapping("/checkmorninglist")
	public void checkmorninglist() {}
	
	
	@PostMapping("/checkmorninglist")
	public ModelAndView checkmorning(CheckDTO dto) { //Controller 처리 결과 후 응답할 view와 view에 전달할 값을 저장
		ModelAndView mv = new ModelAndView(); 
				
		int result = service.insertCheck(dto);
		List<CheckDTO> list = service.checklist();
		
		mv.addObject("result", result); //"변수이름", "변수에 넣을 데이터"
		mv.addObject("checklist", list);
		mv.setViewName("checkmorninglist"); // 뷰 이름 지정, jsp 이름
		return mv; // jsp 보냄
	}

	
	
}
