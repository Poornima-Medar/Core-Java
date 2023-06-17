package springmvcfile;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {

	@RequestMapping(path="/file", method = RequestMethod.GET)
	public String showFile() {
		return "fileform";
	}
	
	
	@RequestMapping(path="/uploadimage", method = RequestMethod.POST)
	public String successFile(@RequestParam("image") CommonsMultipartFile file, HttpSession s, Model model) {
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		byte[] data = file.getBytes();
		
		//to save file 
		String path = s.getServletContext().getRealPath("/")+file.getOriginalFilename();
		System.out.println(path);
		try {
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("File uploaded successfully");
		model.addAttribute("msg","Uploded Successfully");
		model.addAttribute("filename",file.getOriginalFilename());
		}catch (IOException e) {
			System.out.println("Uploading error");
		}
		return "filesuccess";
	}

}
