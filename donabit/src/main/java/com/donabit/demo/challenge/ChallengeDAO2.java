package com.donabit.demo.challenge;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import donabit.challenge.ChallengeDTO;
import joinlogin.MemberDTO;

@Mapper
@Repository("dao2")
public interface ChallengeDAO2 {
	int insertChallenge(ChallengeDTO2 dto);
	List<ChallengeDTO2> selectChallengePage(int index, int count);
	int selectChallengeCount();
	List<MemberDTO> selectMember();
	int selectChallengingMemberCount(int chnum);
	int selectSuccessMemberCount(int chnum);
	int selectCheckCount(int chnum);
	int deleteChallenge(int chnum); 
	int selectMemberCount();
	List<ChallengeDTO2> selectChallengeName();
	int selectChallengingCountByNickname(String nickname);
	int selectSuccessCountByNickname(String nickname);
	int selectCheckCountByNickname(String nickname);
	int selectReportCountByNickname(String nickname);
	String selectChallengeNameByNumber(int chnum);
	List<ChallengingDTO> selectMemberInfoByNumber(int chnum);
	int selectEachReportCountByNumber(String chnum, String nickname);
	int selectEachCheckCountByNumber(String chnum, String nickname);
	List<ReportDTO> selectReportDto();
	List<ChallengeDTO> selectMainChallenge();
}
