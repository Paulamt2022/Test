package doctor.doctor.repository.crudRepository;

import com.usa.doctorsapp.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository<Doctor, Integer> {
}

