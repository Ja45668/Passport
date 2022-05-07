package com.wipro.Epassport.Service;

import com.wipro.Epassport.Entity.Epassport;
import com.wipro.Epassport.Exception.UserAlreadyExistException;
import com.wipro.Epassport.Repository.EpassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EpassportService {
    @Autowired
    private EpassportRepository repository;
    public void epassportRegistration(Epassport epassport){
        repository.save(epassport);

    }
    private boolean emailExists(final String email)
    {
        return repository.findByEmail(email)!=null;
    }
    public Epassport save(Epassport registrationDto) {
        if(emailExists(registrationDto.getEmail()))
        {
            throw new UserAlreadyExistException("There is an account with that email address: "+registrationDto.getEmail());
        }
        Epassport epassport = new Epassport(registrationDto.getFirstName(),
                registrationDto.getLastName(), registrationDto.getDate_of_birth(),
                registrationDto.getPlace_of_birth(),registrationDto.getGender(),registrationDto.getState(),registrationDto.getDistrict(),registrationDto.getMarital_status(),registrationDto.getPan(),
                registrationDto.getEmploymentType(),registrationDto.getEducationalQualification(),registrationDto.getFatherName(),registrationDto.getMotherName(),
                registrationDto.getHouseNo(),registrationDto.getStreetName(),
                registrationDto.getCity(),registrationDto.getPinCode(),registrationDto.getTelephoneNumber(),
                registrationDto.getEmail(),registrationDto.getPassword(),registrationDto.getReferenceName(),registrationDto.getAddress(),registrationDto.getReferenceTelephoneNumber());

        return repository.save(epassport);
    }
    public boolean login(Epassport registrationDto) {
        String password = repository.findByPassword(registrationDto.getEmail());
        if(registrationDto.getPassword().equals(password))
        {
            return true;
        }
        else{
            return false;
        }

    }
    public List<Epassport> getAllEpassportDetails()
    {
        return (List<Epassport>) repository.findAll();
    }
}
