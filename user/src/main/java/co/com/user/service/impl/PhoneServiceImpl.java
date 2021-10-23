package co.com.user.service.impl;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import co.com.user.bean.Phone;
import co.com.user.repository.PhoneRepository;
import co.com.user.service.IPhoneService;

/**
 * 
 * @author Edsson Pabon
 *
 */
public class PhoneServiceImpl implements IPhoneService{

	@Autowired
	private PhoneRepository iPhoneRepository;

	@Override
	public co.com.user.model.Phone guardarTelefono(Phone phone, String uuidUser) {
		try {
			co.com.user.model.Phone phoneEntity = convertToEntityPhone(phone, uuidUser);
			phoneEntity = iPhoneRepository.save(phoneEntity);
			return phoneEntity;			
		} catch (Exception e) {
			new Throwable(e);
		}
		return null;
	}

	public co.com.user.model.Phone convertToEntityPhone(Phone phoneDto, String uuidUser){
		co.com.user.model.Phone phoneEntity = new co.com.user.model.Phone();
		phoneEntity.setUser(UUID.fromString(uuidUser));
		phoneEntity.setNumber(phoneDto.getNumber());
		phoneEntity.setCitycode(phoneDto.getCitycode());
		phoneEntity.setContrycode(phoneDto.getContrycode());
		return phoneEntity;
	}
}
