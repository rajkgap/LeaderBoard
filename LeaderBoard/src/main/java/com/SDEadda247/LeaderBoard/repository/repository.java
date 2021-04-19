package com.SDEadda247.LeaderBoard.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SDEadda247.LeaderBoard.entity.entity;

@Repository

public interface repository extends JpaRepository<entity, Integer> {

	@Modifying

	@Query(nativeQuery = true, value = "insert into leader_board(student_name,total_marks) select student_table.name, sum(marks) as total_marks from marks_table inner join student_table on student_table.id=marks_table.student_id group by marks_table.student_id order by total_marks desc")
	@Transactional
	void genratetable();

	@Query(nativeQuery = true, value = "select * from leader_board limit 10") //// ask how to change id -->rank
	List<entity> showleaderboard();

	@Modifying
	@Transactional
	@Query(nativeQuery = true, value = "delete from leader_board")
	void clear();

}
