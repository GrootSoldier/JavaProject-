package study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import study.entity.BookEntity;

@Repository
public interface MyRepository extends JpaRepository<BookEntity, Integer>
{
	public List<BookEntity> findByName(String bname);
//@Query(value="select * from book12 where name=:pName",nativeQuery = true)
//public List<BookEntity>findBy
}
