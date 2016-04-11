package atm.batchTest2.repository;

import atm.batchTest2.model.bank.Account;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by sjshin on 2016-04-04.
 */

@Repository
public class AccountRepository {
	@Autowired
	private SqlSessionTemplate sqlSession;

	public Account selectAccount(int accountNumber) {
		Account account = sqlSession.selectOne("account.select", accountNumber);
		return account;
	}
}
