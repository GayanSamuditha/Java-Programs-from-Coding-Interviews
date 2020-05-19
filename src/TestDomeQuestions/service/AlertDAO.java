package TestDomeQuestions.service;

import java.util.Date;
import java.util.UUID;

/**
 * @author Gayan Samuditha
 * @created 19/05/2020 - 5:36 AM
 */
public interface AlertDAO {

    UUID addAlert(Date time);
    Date getAlert(UUID id);

}
