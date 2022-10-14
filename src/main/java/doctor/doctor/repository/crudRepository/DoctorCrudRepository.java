package doctor.doctor.repository.crudRepository;

import doctor.doctor.model.Doctor;
import org.springframework.data.repository.CrudRepository;

public interface DoctorCrudRepository extends CrudRepository<Doctor, Integer> {
}

