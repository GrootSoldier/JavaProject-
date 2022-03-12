package study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import study.dao.BookDAO;
import study.entity.BookEntity;

@Controller
public class BookController {
	
	@Autowired
	BookDAO dao;
	
	@PostMapping("/add")
	public void addbook(Model model,@RequestParam int id,@RequestParam int cost,@RequestParam String name)
	{
		dao.addbook(id, cost, name);
		model.addAttribute("book", name);
		System.out.println("added successfully");
	}
	
	@RequestMapping("/insert")
	public String insert()
	{
		return "insert";
	}
	
	@RequestMapping("/book")
	public String book()
	{
		return "book";
	}
	
	@RequestMapping("/showbook")
	public String show()
	{
		return "show";
	}

	@RequestMapping("/byid")
	public String showbyid(Model model)
	{List<BookEntity> list=dao.showall();
	model.addAttribute("booklist", list);
		return "bookid";
	}

	@RequestMapping("/byname")
	public String showbyname(Model model)
	{
		List<BookEntity> list=dao.showall();
		model.addAttribute("booklist", list);
		return "bookname";
	}

	@GetMapping("/bookname")
	public String displaybook(Model model,@RequestParam String name)
	{ System.out.println("book name called");
	  System.out.println(name);
		List<BookEntity> list= dao.showbyname(name);
		model.addAttribute("name", list);
		return "display";
	}
	
	@GetMapping("/bookid")
	public String displayid(Model model,@RequestParam ("id")int id)
	{ System.out.println("book name called");
		BookEntity be= dao.showbyid(id);
		model.addAttribute("name", be);
		return "displayid";
	}
}
