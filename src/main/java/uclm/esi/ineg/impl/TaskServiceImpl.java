package uclm.esi.ineg.impl;

import java.util.Random;

import javax.jws.WebService;
import uclm.esi.ineg.service.TaskService;

@WebService
public class TaskServiceImpl implements TaskService {
	
	private static final Random random = new Random();
	private static final int MIN_COPY_RATE = 0;
	private static final int MAX_COPY_RATE = 100;
	
	@Override
	public int copyRate() {
		return random.nextInt(MAX_COPY_RATE - MIN_COPY_RATE) + MIN_COPY_RATE;
	}
	
}
