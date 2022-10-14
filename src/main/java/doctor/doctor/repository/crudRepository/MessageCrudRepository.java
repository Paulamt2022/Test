package doctor.doctor.repository.crudRepository;


import doctor.doctor.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository <Message, Integer>{
}
