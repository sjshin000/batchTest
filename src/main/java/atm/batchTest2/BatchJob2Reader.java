package atm.batchTest2;

import atm.batchTest2.model.bank.Account;
import atm.batchTest2.repository.AccountRepository;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by sjshin on 2016-04-11.
 */
@Component
@Scope("step")
public class BatchJob2Reader implements ItemReader {
	@Autowired
	AccountRepository accountRepository;


	@Override
	public Object read() throws Exception {
		System.out.println("========read=====");
		int accountSrl = 12345;
		Account account = accountRepository.selectAccount(accountSrl);
		System.out.println("====이름 : " + account.getUserName());
		return null;
	}
}
