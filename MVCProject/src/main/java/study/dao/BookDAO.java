package study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.entity.BookEntity;
import study.repository.MyRepository;

@Service
public class BookDAO {
	
	@Autowired
	MyRepository repo;
	
	public void addbook(int id , int cost , String name)
	{
		BookEntity be= new BookEntity(id,cost,name);
		repo.save(be);
	}
	
	public List<BookEntity> showbyname(String name)
	{   System.out.println("show by name called");
		List<BookEntity>list=repo.findByName(name);
		return list;
	}
	public List<BookEntity> showall()
	{
		return repo.findAll();
	}

	public BookEntity showbyid(int id) {
		
		
		return repo.findById(id).get();
	}
}
