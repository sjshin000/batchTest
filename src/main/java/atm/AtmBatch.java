package atm;

import org.springframework.batch.item.ItemReader;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by sjshin on 2016-04-08.
 */
@Component
@Scope("step")
public class AtmBatch implements ItemReader {
	@Override
	public Object read() throws Exception {
		System.out.println("========read=====");
		return null;
	}
}
