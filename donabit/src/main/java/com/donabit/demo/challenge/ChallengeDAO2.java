package com.donabit.demo.challenge;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("dao2")
public interface ChallengeDAO2 {
	int insertChallenge(ChallengeDTO2 dto);
	List<ChallengeDTO2> selectChallenge(int index, int count);
	int selectChallengeCount();
}
