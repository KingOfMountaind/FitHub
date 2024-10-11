package com.exe.FitHub.community;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunityFreeBoardRepository extends JpaRepository<CommunityFreeBoard, Integer> {

		CommunityFreeBoard findBySubject(String subject);
		CommunityFreeBoard findBySubjectAndContent(String subject,String content);
		List<CommunityFreeBoard> findBySubjectLike(String subject);
		
	
}
