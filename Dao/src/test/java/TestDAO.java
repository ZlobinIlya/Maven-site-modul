import org.junit.Assert;
import org.junit.Test;

import com.epam.dao.Dao;
/** 
 * This is Test class, he checks method FullAnswer  .
 * @author Zlobin Ilya
 * @version 1.0
*/
public class TestDAO {
	/** 
	 * This is method checks method  FullAnswer 
     */
	@Test
	public void testFullAnswer() {
		Dao testDao = new Dao();
		
		/** data test */
		double res = testDao.fullAnswer(20, 40);
		
		if (res != 60)
			Assert.fail();
	}
}
