package common.service;

import common.domain.Member;
import common.pojo.ResponseRestful;

public interface MemberService {

	ResponseRestful sms(String mobile, String code);

	ResponseRestful bindMobile(String wechat, String mobile);

	ResponseRestful update(int i, Member newMember);

	ResponseRestful loginWechat(String wechat);

	ResponseRestful bindWechat(Member member);

}
