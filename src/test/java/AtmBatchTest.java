import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by sjshin on 2016-04-07.
 */


@SuppressWarnings("SpringJavaAutowiringInspection") @RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/Context-config.xml", "classpath:/spring/job-config.xml"})

public class AtmBatchTest {
	@Autowired
	private JobLauncher launcher;

	@Autowired
	@Qualifier("batchJob")
	private Job job;

	@Test
	public void testJob2(){
		JobParameters pram = new JobParameters();
		try {
			JobExecution execution = launcher.run(job, pram);
			System.out.println("=============test 2 " + job.getName());
			Assert.assertEquals(BatchStatus.COMPLETED, execution.getStatus());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
