package atm.batchTest2;

import java.util.List;

/**
 * Created by sjshin on 2016-04-11.
 */
public class BatchJob2Writer implements org.springframework.batch.item.ItemWriter {
	@Override public void write(List list) throws Exception {
		System.out.println("================write ");
	}
}
