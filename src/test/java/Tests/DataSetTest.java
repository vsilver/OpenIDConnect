package Tests;

import Model.DataSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.apache.commons.validator.routines.EmailValidator;

import java.io.IOException;


public class DataSetTest {

    String jsonInString = "{\"source\" : \"partner1\", \"data\" : {\"unid\" : 1234567, \"firstName\" : \"John\"," +
            "\"lastName\" : \"Doe\", \"emailAddress\" : \"JohnDoe@gmail.com\", \"phoneNumber\" : \"1-123-456-7890\"," +
            "\"countryCode\" : \"USA\", \"consentForDetails\" : \"true\", \"marketingConsent\" : \"true\"}}";


    @Test(description = "Verify the Email Address validation")
    public void checkEmailAddressValidation() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        //JSON from String to Object
        DataSet dataSet1 = mapper.readValue(jsonInString, DataSet.class);

        Assert.assertTrue((EmailValidator.getInstance().isValid(dataSet1.getData().getEmailAddress())),dataSet1.getData().getEmailAddress());
     }

    @Test(description = "Verify the ID validation")
    public void checkIdValidation() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        //JSON from String to Object
        DataSet dataSet1 = mapper.readValue(jsonInString, DataSet.class);

        Assert.assertTrue((dataSet1.getData().getUnid().matches("\\d{7}")),dataSet1.getData().getUnid());
    }

    @Test(description = "Verify the Phone Number validation")
    public void checkPhoneNumberValidation() throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        //JSON from String to Object
        DataSet dataSet1 = mapper.readValue(jsonInString, DataSet.class);

        Assert.assertTrue((dataSet1.getData().getPhoneNumber().matches("\\d{1}[-\\.\\s]\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")),dataSet1.getData().getPhoneNumber());
    }

}
