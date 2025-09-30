//package poly.edu.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import poly.edu.Entity.Product;
//
//@Controller
//public class ProductController {
//	@GetMapping("/poly/product/form2")
//	public String form(Model model) {
//		model.addAttribute("product", new Product());
//	return "/poly/product/form2";
//	}
//	
//	@PostMapping("/poly/product/save")
//	public String save(@ModelAttribute Product product, Model model) {
//		model.addAttribute("product", product);
//	return "/poly/product/form2";
//	}
//}

package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import poly.edu.Entity.Product;

@Controller
public class ProductController {

    @GetMapping("/poly/product/form2")
    public String form(Model model) {
    	// Khởi tạo product rỗng 
        model.addAttribute("product", new Product());
        return "poly/product/form2"; // form.html nằm trong /templates/product/
    }

    @PostMapping("/poly/product/save")
    public String save(@ModelAttribute("product") Product product, Model model) {
    	// Sau khi submit form, product sẽ nhận dữ liệu từ form.html
        model.addAttribute("product", product);
        return "poly/product/form2"; // quay lại form.html để hiển thị
    }
}