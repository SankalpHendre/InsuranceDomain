package insurance.cv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import insurance.cv.repositories.CaravanRepo;

@Service
public class CarvanService {
	@Autowired
	private CaravanRepo carvanRepo;

}
