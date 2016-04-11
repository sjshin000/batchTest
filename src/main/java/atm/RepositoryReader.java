package atm;

import atm.batchTest2.model.bank.Account;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by sjshin on 2016-04-11.
 */
@Repository
public class RepositoryReader implements ItemReader {
	@Autowired
	public SqlSessionTemplate sqlSession;

	public Account selectAccount(int accountNumber) {
		Account account = sqlSession.selectOne("account.select", accountNumber);
		System.out.println("account 이름 : " + account.getUserName());
		return account;
	}

	@Override
	public Account read() throws Exception {
		int accountNumber = 12345;
		Account account = sqlSession.selectOne("account.select", accountNumber);
		return account;
	}
}
