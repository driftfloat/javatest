package temp;

import javax.validation.Valid;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping(value = "/handle91")
	public String handle91(@Valid  User user,BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "/user/register3";
		}else{
			return "/user/showUser";
		}
	}
}