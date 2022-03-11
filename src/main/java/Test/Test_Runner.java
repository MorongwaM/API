package Test;
import Functionality.Dogs_Breed;
import Functionality.Login;
import org.testng.annotations.Test;

public class Test_Runner {

    Dogs_Breed dogs_breed = new Dogs_Breed();
    Login login = new Login();

      @Test
      public void GetAllDogsandVerifyTests()
    {
      dogs_breed.List_All_Dogs_Breed();

    }
       @Test
     public void GetAllResponse()

       {
           login.log_Response();
       }




}
