package atm;

import java.util.List;

/**
 * Created by sjshin on 2016-04-11.
 */
public class ItemWriter implements org.springframework.batch.item.ItemWriter {
	@Override public void write(List list) throws Exception {
		System.out.println("================write ");
	}
}
