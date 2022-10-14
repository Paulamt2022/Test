package doctor.doctor.repository.crudRepository;

import doctor.doctor.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
